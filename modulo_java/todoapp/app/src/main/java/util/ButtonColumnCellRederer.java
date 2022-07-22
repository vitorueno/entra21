package util;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class ButtonColumnCellRederer extends DefaultTableCellRenderer {

    private String buttonType;
    
    
    
    public ButtonColumnCellRederer(String buttonType) {
        this.buttonType = buttonType;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, 
                value, isSelected, hasFocus, row, col);
        
        label.setHorizontalAlignment(JLabel.CENTER);
        
        
        label.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/" + buttonType + ".png")));
        
        return label;
    }

}