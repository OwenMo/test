package hello;

public class halfdivide {

	public static int half(int k,int[] a) {
		int ret=-1;
		int l=0,r=a.length;
		while(l != r) {
			int m=(l+r)/2;
			if(a[m]==k) {
				ret=m;break;
			}else if(a[m]>k) {
				r=m-1;
			}else {
				l=m+1;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,5,7,8,12,14,17,23,45};
		System.out.println(half(7,a));
	}

}
