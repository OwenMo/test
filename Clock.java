package hello;

public class Clock {
	private Display hour =new Display(24); //如果不在一个Project或者package中，则要import，和Scanner一样
	private Display minute= new Display(60);
	
	public void tik() {
		minute.tik();
		if(minute.getValue()==0) {
			hour.tik();
		}
	}

	public void show() {
//		System.out.println(hour.getValue()+":"+minute.getValue());
//		System.out.printf("%02d:%02d\n", hour.getValue(),minute.getValue());
		System.out.println(hour+":"+minute);
		
	}
	public static void main(String[] args) {
		Clock c= new Clock();
		while(true) {
			c.tik();
			c.show();
		}
	}

}
