package question02;

public class Item {
	String name;
	int unitPrice;
	int  quantity;
	Item(String n,int up,int qn){
		this.name=n;
		this.unitPrice=up;
		this.quantity=qn;
	}
	void details() {
		System.out.println(name+" availabe :"+quantity+" kg UnitPrice :"+unitPrice);
	}

}
