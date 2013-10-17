package com.programutvikling.prosjekt1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;


public class GUI {
    public GUI() {
    	
        JFrame frame = new JFrame("JTable Test Display");
        JPanel panel = new JPanel();

// 		MENU
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menu.setMnemonic('F');
		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.setMnemonic('S');
		menu.add(saveItem);
		JMenuItem openItem = new JMenuItem("Open");
		openItem.setMnemonic('O');
		menu.add(openItem);	
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic('x');
		menu.add(exitItem);
        
        menuBar.add(menu);
        
        saveItem.addActionListener(
    			new ActionListener(){
    				public void actionPerformed(ActionEvent e)
    				{
    					System.out.println("Save is pressed");
    					FileOutputStream saveFile = new FileOutputStream("savedTable.txt");
    					ObjectOutputStream save = ObjectOutputStream(saveFile);
    				}
    			}
    		);
        
        
//    	MENU   
        
        
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

        panel.add(menuBar, BorderLayout.NORTH);
        panel.add(tableContainer, BorderLayout.CENTER);
       
        frame.getContentPane().add(panel);
       
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}


