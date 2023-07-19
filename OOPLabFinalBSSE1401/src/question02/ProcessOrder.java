package question02;


import java.util.*;


public class ProcessOrder {
	static void  prcord(ArrayList<User>users,ArrayList<Item> items) {
		Scanner sc = new Scanner(System.in);
		System.out.println(users.size());
		for(int i=0;i<users.size();i++) {
			int totalAmount=0;
			for(int k=0;k<users.get(i).cart.size();k++) {
				for(int l=0;l<items.size();l++) {
					if(users.get(i).cart.get(k).name.equals(items.get(l).name)){
						totalAmount=totalAmount+users.get(i).cart.get(k).qunt*items.get(l).unitPrice;
					}
				}
			}
					if(users.get(i).creditCardNumber.length()!=10) {
						System.out.println(users.get(i).name+" As you have an invalid creditCardNumber so you have to pay in cash...\n");
						System.out.println("So your total amount is "+totalAmount+"\n\n");
						users.get(i).totalamn-=totalAmount;
						
					}
					else {
						int t=0;
						while(t<4) {
						String df;
						System.out.println(users.get(i).name+" Enter your credit card number \n");
						df=sc.next();
						if(users.get(i).creditCardNumber.equals(df)){
							System.out.println(users.get(i).name+" So your total amount is "+totalAmount+"\n\n");
							users.get(i).totalamn-=totalAmount;
							break;
							
						}
						else {
							 
							System.out.println("Incorrect credit card\nTry again\n");
							t++;
							if(t==4) {
								System.out.println("Sorry you have tried maximum num of times\n");
								break;
							}	
				}
						
			 }
						}
		}
		sc.close();
	}
	
}
