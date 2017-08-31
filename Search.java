package hello;

public class Search {
	public static int[] search(int k, int[] a) {
		int index = 0;
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = -1;
		}
//		for (int h : b)  //notice: for-each cannot change the array itself.
//			h = -1;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (k == a[i]) {
				b[index++] = i; //this is the key point
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] ret = search(5, a);
		System.out.print("5 is on ");
		for (int i = 0; i < a.length; i++) {
			if(ret[i] != -1) {
				System.out.print(ret[i]+1+" ");
			}
		}
		System.out.print("places");
	}

}
