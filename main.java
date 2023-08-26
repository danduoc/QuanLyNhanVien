
public class main {
	public static void main(String[] args) {
		System.out.println(giaiThua(10));
		System.out.println(tong(10));
		System.out.println(phiTuyen(5));
//		int kq = 1;
//		int n = 10;
//		for (int i = 1; i <= n; i++) {
//			kq*=i;
//		}
//		System.out.println(kq);
	}
	
	static int phiTuyen (int n) {
		if (n==0) return 1;
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + i*i*(n-i);
		}
		return s;
	}
	
	static int tong (int n) {
		if (n==0) return 0;
		return n+tong(n-1);
	}
	
	static int giaiThua (int n) {
		if (n==0) return 1;
		return n*giaiThua(n-1);
	}
}
