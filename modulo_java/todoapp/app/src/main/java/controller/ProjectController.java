package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

public class ProjectController {

    public void save(Project project) {
        // template comando sql de insert
        String sql = "INSERT INTO project ( "
                + "name, "
                + "description, "
                + "createdAt, "
                + "updatedAt ) "
                + "VALUES (?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // estabelecendo a conexão com o BD
            connection = ConnectionFactory.getConnection();

            // preparando o comando SQL 
            statement = connection.prepareStatement(sql);

            // substituindo as informações pelas do parametro
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));

            // executa a query
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar o projeto "
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void update(Project project) {
        // template comando sql de update
        String sql = "UPDATE project SET "
                + "name = ?, "
                + "description = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            // estabelecendo a conexão com o BD
            connection = ConnectionFactory.getConnection();

            // preparando o comando SQL 
            statement = connection.prepareStatement(sql);

            // substituindo as informações pelas do parametro
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

            // executa a query
            statement.execute();

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o projeto "
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void removeById(int projectId) {
        // template comando sql de delete
        String sql = "DELETE FROM project WHERE ID = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // estabelecendo a conexão com o BD
            connection = ConnectionFactory.getConnection();

            // preparando o comando SQL
            statement = connection.prepareStatement(sql);

            // substituindo o id pelo que vem por parametro
            statement.setInt(1, projectId);

            // executa a query
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar o projeto "
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public List<Project> getAll() {
        // template do comando sql de select
        String sql = "SELECT * FROM project";  
        
        Connection connection = null;
        PreparedStatement statement = null; 
        ResultSet resultSet = null; 
        
        // lista (data structure) que guarda o retorno da query
        List <Project> projects = new ArrayList<Project>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // resultado da query será um set (data structure de conjunto)
            resultSet = statement.executeQuery(); 
            
            while (resultSet.next()) {
                // cria um novo objeto com o retorno da query
                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                // adiciona o novo objeto task para a lista (tasks)
                projects.add(project);
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao listar os projetos " 
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        // retornando a lista de resultados
        return projects;
    }

}
