import java.util.Scanner;
public class Main {
	static int fiv(int n) {
		if(n==0)
			return n;
		else if(n==1)
			return 1;
		
		return fiv(n-1) + fiv(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(fiv(n));
		
	}
}