package hello;

public class Display {
	private int uplimit;
	private int value;
	public static String k;
	
	public Display(int uplimit) {
		this.uplimit=uplimit;
	}
	
	public void tik() {
		value++;
		if(value == uplimit)
			value = 0;
	}
	public String toString(){
		if(value<10) {
			return "0"+value;
		}
		return ""+value;
	}
	
	public int getValue() {return value;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d= new Display(24);
		while(true) {
			d.tik();
			k= d.toString();
			System.out.println(k);
		}

	}

}
