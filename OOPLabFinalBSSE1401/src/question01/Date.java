package question01;

public class Date {
	int month;
	int day;
	int year;
	Date(int m,int d,int y){
		this.month=m;
		this.day=d;
		this.year=y;
		}
	Date(int m,int d){
		this.month=m;
		this.day=d;
		this.year=2003;
		}
	void displayDate(int a) {
		System.out.println(month+"/"+day+"/"+year);
		
	}
	void displayDate() {
		System.out.println(month+"."+day+"."+year);
		
	}

}
