package question02;
import java.util.*;

public class Main {
	public static void main(String[] args){
		ArrayList<Item> items= new ArrayList<Item>();
		ArrayList<User> users= new ArrayList<User>();
		ArrayList<User> orderedUsers= new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
			Item it1= new Item("Rice",60,50);
			Item it2= new Item("Dal",200,30);
			Item it3= new Item("Sugar",150,25);
			items.add(it1);
			items.add(it2);
			items.add(it3);
			User us1= new User("Raihan","485475");
			User us2= new User("Sakib","234987","3876612903");
			User us3= new User("Ovi","578535","981621390334");
			users.add(us1);
			users.add(us2);
			users.add(us3);
			for(int i=0;i<users.size();i++) {
			  System.out.println("Hi! "+users.get(i).name+" Welcome to ShopDukaan...Would you like to buy any grocery items...\nIf so enter 1 otherwise enter 0...\n ");
			  
			 
			  int j=sc.nextInt();
			  if(j==1) {
				  for(int k=0;k<items.size();k++) {
						 items.get(k).details(); 
					  }  
			  
			 
			  int m=1;
			  while(m!=0) {
				  
			  System.out.println("Enter the item name\n");
			  String it;
			  it =sc.next();
			  System.out.println("Enter the items amount\n");
			  int  itam;
			  itam =sc.nextInt();
			  users.get(i).cart.add(new Order(it,itam));
			  System.out.println("Enter 0 for not adding any more item or else type 1 for further shopping\n");
			  m=sc.nextInt();
			  }
			  }
			  if(j==0) {
				  continue;
			  }
			 }
			for(int i=0;i<users.size();i++) {
				if(users.get(i).cart.size()>0) {
					orderedUsers.add(users.get(i));
				}
			}
			ProcessOrder.prcord(orderedUsers, items);
			sc.close();
		}
	}
	
	
