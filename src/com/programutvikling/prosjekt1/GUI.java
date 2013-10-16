package com.programutvikling.prosjekt1;
import java.awt.*;
import javax.swing.*;


public class GUI {
    public GUI() {
        JFrame frame = new JFrame("JTable Test Display");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        String[] columnNames = {
        		"Title",
        		"First Name",
        		"Last Name"};
        Object[][] data = {
        		{"Ms", "Mari", "Ødegård"},
        		{"Mr", "Bjarne", "Andersen"},
        		{"Ms", "Sina", "Lund"},
        		{"Mrs", "Karianne", "Nilsen"},
        		{"Mr", "Bottolf", "Aae"}
	};

JTable table = new JTable(data, columnNames);

        JScrollPane tableContainer = new JScrollPane(table);

        panel.add(tableContainer, BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}







/*public class GUI extends JFrame{

	public GUI () {
		JFrame f = new JFrame ("Navn");
		f.setMinimumSize (new Dimension (400, 400));
		f.setVisible(true);
		
	}
	
	
	
	
	public static void main	(String args[]) {
		GUI gui = new GUI ();
	}
}*/


