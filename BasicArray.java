package hello;

import java.util.Scanner;

public class BasicArray {
	final static int LIMIT=15;
	final static int MUTI=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=0;
		}
		int n;
		do {
			n=in.nextInt();
			if(n>=0 &&n<10) {
				a[n]++;
			}
		}while(n!=-1);
		for(int i=0;i<a.length;i++) {
			System.out.println(i+" shows "+a[i]+" times");
		}
	}

}
