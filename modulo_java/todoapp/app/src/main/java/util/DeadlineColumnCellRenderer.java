package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer {

    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int col) {
        
        // pegando objeto da classe pai
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, 
                value, isSelected, hasFocus, row, col);
        
        // fazendo personalizações
        
        label.setHorizontalAlignment(CENTER);
        
        // pegando a task a partir da taskModel presente na table
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        
        // pintando a celula se estiver atrasada ou não
        if (task.getDeadline().after(new Date())) {
            label.setBackground(Color.GREEN);
        } else {
            label.setBackground(Color.RED);
        }
        
        return label;
    }
}
