package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class ALL_Patient_Info extends JFrame {
    ALL_Patient_Info(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,1000,590);
        panel.setBackground(new Color(180, 208, 211));
        panel.setLayout(null);
        add(panel);


        JTable table = new JTable();
        table.setBounds(10,40,1000,450);
        table.setBackground(new Color(180, 208, 211));
        table.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(table);

        try{
            conn c= new conn();
            String q = "Select * From patient_info";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel label1 = new JLabel("ID");
        label1.setBounds(14,11,105,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Number");
        label2.setBounds(180,11,155,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Name");
        label3.setBounds(340,11,155,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Gender");
        label4.setBounds(500,11,155,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);

        JLabel label5 = new JLabel("Disease name");
        label5.setBounds(650,11,135,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);


        JLabel label7 = new JLabel("Time");
        label7.setBounds(820,11,155,20);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label7);


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
        setSize(940,600);
        setLocation(300,200);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ALL_Patient_Info();
    }
}
