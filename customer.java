/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

public class customer extends user {
 item item;
 private String name,email;
public customer(String id, String pass, item item, String name, String email) {
	super(id, pass);
	this.item = item;
	this.name = name;
	this.email = email;
}
 @Override
 public void display() {
	 super.display();
	 System.out.println("Name: "+name);
	 System.out.println("E-mail: "+email);
	 item.display();
 }
}