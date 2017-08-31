package hello;

public class Ticket {
	private int price = 20;
	private int balance;
	private int total;
	private String line_name;

	public Ticket(int i) {  //同名的成员函数是被允许的，但输入的参数需要保证不同，才能够在被调用的时候区分
		price=i;			//这就称为over-load
	}
	
	public Ticket(int i, String line_name) {
		//price=i;
		this(i); //这样会调用另外（也就是上面那个）构造函数，同样可以改变price
		this.line_name=line_name; //this可以帮助区分相同的变量名，制定当前对象的line_name；
		System.out.println(i+"CNY "+this.line_name);
	}
	//没有static的变量或者子函数我们只能通过对象去调用
	public void showprompt() {
		System.out.println("welcome to MTR!");
		System.out.println("The price you need is " + price);
		int price=10; //成员变量在成员函数中可以被再次定义暂时代替
		printicket(); //不需要附加对象
	}
	
	public void printicket() {
		System.out.println("TICKET out!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=80;
		String s="line 4";
		
		Ticket tk = new Ticket(i,s);
		int k = tk.price;   //通过对象可以使用成员变量
		System.out.println("Price is "+k+"CNY");
		tk.showprompt();
	}

}
