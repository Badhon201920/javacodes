package question01;

import java.util.Scanner;

public class DateTest {
	public static void main(String[] args){
		int i;
		Date dt= new Date(2,3,2021);
		Date dt1= new Date(4,23);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("If you wanna see the date separated by / then enter 1...otherwise enter 0..\n");
			i= sc.nextInt();
		}
		if(i==1) {
		dt.displayDate(i);
		dt1.displayDate(i);
		}
		else {
		dt.displayDate();
		dt1.displayDate();
		}
}
}