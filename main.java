/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

public static void main(String[]args) {
	 Item item=new Item("Biscuit",20.00);
	 Customer cust= new Customer("1021","16353555",item,"Asif","asif15-1021@diu.edu.bd");
	 cust.display();
 }