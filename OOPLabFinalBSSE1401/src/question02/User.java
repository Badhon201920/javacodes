package question02;

import java.util.*;

public class User {
		
		String name;
		String contactNumber;
		String creditCardNumber;
	    int totalamn= 100000;
		ArrayList<Order> cart= new ArrayList<Order>();
		ArrayList<Item> items= new ArrayList<Item>();
		User(String nm, String cn){
			this.name=nm;
			this.contactNumber=cn;
			this.creditCardNumber="";
		}
		User(String nm, String cn,String ccn){
			this.name=nm;
			this.contactNumber=cn;
			this.creditCardNumber=ccn;
		}
		
		
		
}
