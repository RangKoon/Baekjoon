import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i < 1000000; i++) {
			
			sum = i + (i%10) + (i/10%10) + (i/100%10) + (i/1000%10) + (i/10000%10) + (i/100000%10)
					+ (i/1000000%10);
			
			if (sum == n) {
				System.out.println(i);
				cnt ++;
				break;
			} 
			sum = 0;
		}
		if(cnt==0)
			System.out.println("0");

	}
}