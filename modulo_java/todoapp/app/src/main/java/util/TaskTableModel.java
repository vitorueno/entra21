package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"}; 
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size(); // retornando a quantidade de linhas (registros)
    }

    @Override
    public int getColumnCount() {
        return columns.length; // quantas colunas temos ("atributos")
    }
    
    @Override
    public String getColumnName(int ColumnIndex) {
        return columns[ColumnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (tasks.isEmpty()) {
            return Object.class;
        }
        
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int ColumnIndex) {
        tasks.get(rowIndex).setIsCompleted((boolean) aValue);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // retorna o valor de um campo (dado em uma certa linha e coluna)
        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isIsCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados";
        }
    }
    
    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    

}
