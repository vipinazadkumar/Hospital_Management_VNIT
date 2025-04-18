package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.awt.event.ActionListener;

public class Department extends JFrame {

    Department(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(204, 223, 225));
        panel.setLayout(null);
        add(panel);


        JTable table = new JTable();
        table.setBounds(10,40,700,400);
        table.setBackground(new Color(204, 223, 225));
        table.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(table);

        try{
           conn c= new conn();
           String q = "Select * From department";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Department");
        label1.setBounds(145,11,105,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Phone Number");
        label2.setBounds(431,11,155,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JButton button = new JButton("Back");
        button.setBounds(350,300,120,30);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        panel.add(button);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setSize(700,500);
        setLocation(350,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Department();
    }
}
