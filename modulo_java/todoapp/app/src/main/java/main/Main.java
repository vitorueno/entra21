
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class Main {
        public static void main(String[] args) {
//        ProjectController projControl = new ProjectController();

//        // criando instância de projeto
//        Project proj = new Project();
//        proj.setName("projeto teste");
//        proj.setDescription("descrição");
//        
//        // salvando no bd
//        projControl.save(proj);
//        
//        // alterando a instancia
//        Project proj = new Project();
//        proj.setId(1);
//        proj.setName("novo nome");
//        proj.setDescription("nova descrição");
//        
//        // atualizando o projeto
//        projControl.update(proj);
        // pegando todos os projetos e printando a quantidade
//        List<Project> projs = projControl.getAll();
//        System.out.println("quantidade de projetos: " + projs.size());
        // removendo o de id 1 
//        projControl.removeById(1);
//        List<Project> projs = projControl.getAll();
//        System.out.println("quantidade de projetos: " + projs.size());
        TaskController taskControl = new TaskController();

        // criando uma task 
//        Task tsk = new Task();
//        tsk.setName("nome");
//        tsk.setDescription("descricao");
//        tsk.setNotes("notas");
//        tsk.setDeadline(new Date());
//        tsk.setIdProject(2);
//        
        // salvando a task
//      taskControl.save(tsk);
        
        // criando nova task com mesmo id da anterior
//        Task tsk = new Task();
//        tsk.setId(1);
//        tsk.setIdProject(2);
//        tsk.setName("novo nome");
//        tsk.setDescription("nova descricao");
//        tsk.setNotes("novas notas");
//        tsk.setDeadline(new Date());
//        
//        // atualizando task
//        taskControl.update(tsk);

        // listando todas as tasks do projeto de id 2
//        List <Task> tasks = taskControl.getAll(2);
//        System.out.println("quantidade de tasks do projeto 2: " + tasks.size());
        
//        taskControl.removeById(1);
//        List <Task> tasks = taskControl.getAll(2);
//        System.out.println("quantidade de tasks do projeto 2: " + tasks.size());
        
    }
}
