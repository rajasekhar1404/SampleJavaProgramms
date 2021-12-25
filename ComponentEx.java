//program to demonstrate components, JLabel,
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class ComponentEx extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JComboBox j1,j2;
    ComponentEx()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        FlowLayout fl = new FlowLayout();
        this.setLayout(null);

        Container c = this.getContentPane();
        
	//label creation
        l1 = new JLabel("Registration form");
	l1.setBounds(15,50,200,20);
        c.add(l1);


        //checkbox creation with an array
        String India[] = {"Telangana","Andhra Pradhesh","Tamilnadu","Kerala","Madya Pradesh"};
        j1 = new JComboBox(India);
	j1.setBounds(15,70,200,20);
        c.add(j1);
        j1.addActionListener(this);

	//label creation
        l2 = new JLabel("Distics of state");
	l2.setBounds(15,90,200,20);
        c.add(l2);
	
        j2 = new JComboBox();
	j2.setBounds(15,110,200,20);
        c.add(j2);

    }

    public void actionPerformed(ActionEvent e)
    {
	if(j1.getSelectedItem().equals("Telangana"))
	{
		j2.removeAllItems();
		j2.addItem("Hyderabad");
		j2.addItem("Secundrabad");
		j2.addItem("Khammam");
		j2.addItem("Suryapet");
	}else{};

	if(j1.getSelectedItem().equals("Andhra Pradhesh"))
	{
		j2.removeAllItems();
		j2.addItem("Vizag");
		j2.addItem("chithoor");
		j2.addItem("krishna");
		j2.addItem("kadapa");
	}else{};

	if(j1.getSelectedItem().equals("Tamilnadu"))
	{
		j2.removeAllItems();
		j2.addItem("Bikkumalla");
		j2.addItem("Noothanakal");
		j2.addItem("kothapet");
		j2.addItem("chaithanyapuri");
	}
		else{};
    }


    public static void main(String[] args)
    {
        ComponentEx f = new ComponentEx();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
