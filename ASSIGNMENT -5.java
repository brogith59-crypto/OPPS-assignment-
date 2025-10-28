import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {
    JTextField nameField, rollField;
    JRadioButton male, female;
    JCheckBox read, sports, music;
    JButton submit;

    public StudentForm() {
        setTitle("Student Info Form");
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Roll No:"));
        rollField = new JTextField(15);
        add(rollField);

        add(new JLabel("Gender:"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        add(male);
        add(female);

        add(new JLabel("Hobbies:"));
        read = new JCheckBox("Reading");
        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");
        add(read);
        add(sports);
        add(music);

        submit = new JButton("Submit");
        add(submit);
        submit.addActionListener(this);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String roll = rollField.getText();
        String gender = male.isSelected() ? "Male" : "Female";

        String hobby = "";
        if (read.isSelected()) hobby += "Reading ";
        if (sports.isSelected()) hobby += "Sports ";
        if (music.isSelected()) hobby += "Music ";

        JOptionPane.showMessageDialog(this,
            "Name: " + name + "\nRoll No: " + roll +
            "\nGender: " + gender +
            "\nHobbies: " + hobby);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
