package hello;

public class Sort {
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int index=0;
			for(int j=1;j<a.length-i;j++) {
				if(a[j]>a[index]) {
					index=j;
				}
			}
			int temp=a[index];
			a[index]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100);
		}
		for(int h:a)
			System.out.print(h+" ");
		System.out.println( );
		sort(a);
		for(int h:a)
			System.out.print(h+" ");
	}

}
