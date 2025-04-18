package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class Employee_info extends JFrame {
    Employee_info(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(206, 231, 232));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,980,450);
        table.setBackground(new Color(206, 231, 232));
        table.setFont(new Font("Tahoma",Font.BOLD,13));
        panel.add(table);

        try{
            conn c= new conn();
            String q = "Select * From doctors";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel label1 = new JLabel("ID");
        label1.setBounds(14,11,105,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Name");
        label2.setBounds(180,11,155,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Degree");
        label3.setBounds(290,11,155,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(411,11,155,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);

        JLabel label5 = new JLabel("Post");
        label5.setBounds(505,11,105,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);

        JLabel label6 = new JLabel("OPD_No");
        label6.setBounds(641,11,155,20);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);

        JLabel label7 = new JLabel("dept");
        label7.setBounds(785,11,105,20);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label7);

        JLabel label8 = new JLabel("timing");
        label8.setBounds(891,11,155,20);
        label8.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label8);


        JButton button = new JButton("Back");
        button.setBounds(350,500,120,30);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        panel.add(button);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(1000,600);
        setLocation(350,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Employee_info();
    }
}
