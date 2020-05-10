package main;
//Stephany Lais A. Souza 2019472
//Teacher Amilcar Aponte

//******model**********
/*The following 6 lines of code (or lines 10 to 19) has been sourced     *    from w3schools.com.
Title: <title of program/source code>
Author: <author(s) names>
Date: <date>
Code version: <code version>
Availability: https://www.w3schools.com/php/php_if_else.asp
*/

//********imports added******************
import java.awt.BorderLayout;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import main.menu;



public class Main extends JFrame implements ActionListener {//ActionListener require the import and override actionEvent on the botton of the code
	//JFrame is the entire window and the base to which every other component add below.

	
	//line above from tutorialspoint Smita Kapse published on 30-May-2019
	GridBagLayout shopStaff = new GridBagLayout();//to center the component JLabel
		
	JButton button;
	
public Main() {//main method
    
	//default constructor setting some attributes
	//(this.) is the JFrame involved
	this.setSize(700,700);
	this.setVisible(true);
	this.setLocationRelativeTo(null);//set the frame to the center
	this.setTitle("Ultra Vision Rental Shop Management System");
	
	//***************Menu*********************
	//JMenuBar,JMenu, JmenuItem -always go together, otherwise pretty useless.
	JMenuBar myMenuBar = new JMenuBar();//create the Menubar is just another object
	this.setJMenuBar(myMenuBar);
	
	JMenu customerMenu = new JMenu("Customers");//add customer to the Menubar
	myMenuBar.add(customerMenu);
	
	JMenu titleMenu = new JMenu("Titles");//add titles to the  Menubar
	myMenuBar.add(titleMenu);
	
	JMenu rentMenu = new JMenu("Rents");//add rents to the  Menubar
	myMenuBar.add(rentMenu);
	
	button = new JButton();
    add(button);
	
	JMenuItem searchCustomerItem = new JMenuItem("Search customers");//is just another object
    customerMenu.add(searchCustomerItem);//add to the menu
    searchCustomerItem.addActionListener(this); //set the action listener up, I need to implement the interface ActionListener on the top class Main 
    searchCustomerItem.setActionCommand("SearchCustomers");//adding a tag
    
    JMenuItem addCustomerItem = new JMenuItem("Add new customers");//is just another object
    customerMenu.add(addCustomerItem);
    addCustomerItem.addActionListener(this);  
    addCustomerItem.setActionCommand("AddCustomers");
    
    JMenuItem updateCustomerItem = new JMenuItem("Update customers / subscription plan");//is just another object
    customerMenu.add(updateCustomerItem);
    updateCustomerItem.addActionListener(this);  
    updateCustomerItem.setActionCommand("UpdateCustomers");
    
    JMenuItem searchTitleItem = new JMenuItem("Search titles");  
    titleMenu.add(searchTitleItem);
    searchTitleItem.addActionListener(this);
    searchTitleItem.setActionCommand("SearchTitles");
    
    JMenuItem registerItem = new JMenuItem("Register rents");  
    rentMenu.add(registerItem);
    registerItem.addActionListener(this);
    registerItem.setActionCommand("RegisterRents");
    
    JMenuItem registerReturnItem = new JMenuItem("Register returns");  
    rentMenu.add(registerReturnItem);
    registerReturnItem.addActionListener(this);
    registerReturnItem.setActionCommand("RegisterReturns");
      
    JMenuItem addTitleItem = new JMenuItem("Add new titles");  
    titleMenu.add(addTitleItem);
    addTitleItem.addActionListener(this);
    addTitleItem.setActionCommand("AddTitles");
            
	//******************Layout**************	
	//Creating the JPanel similar to "div tags" in HTML
	//main function is to separate sections of the GUI object
	//Adding the JPanel to the frame
	JPanel mainPanel = new JPanel();
	
	//Creating the JLabel is the type of object we use when we want to add some text to our interface
	//Adding the JLabel to the panel
	JLabel myLabel = new JLabel("Welcome to Utra-Vision Rental Shop Management System");
	mainPanel.add(myLabel);
	mainPanel.setLayout(shopStaff);
			
	this.add(mainPanel);
	
	//because more components has been add those below need to be use.
	this.validate();
	this.repaint();
		
}
public static void main(String[] args) {
	// main method
	
	new Main();
	new menu();
	
}
//**********Action Listener****************
/*
class thehandler implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("\O/");
}}*/

@Override
public void actionPerformed(ActionEvent argo) {
	// TODO Auto-generated method stub
	//System.out.println("****Thank you for use Utra-Vision Rental Shop Management Console*****");
	
	//new menu();
	
    //e.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//String ac = argo.getActionCommand();

	//if (argo.equals("SearchCustomers")){}
	System.out.print(":( :/ :( :( :/");

	
	}

}
