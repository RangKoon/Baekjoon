import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for(int i=n.length()-1; i>=0; i--) {
			if(n.charAt(i)>='A')
				sum += (int)(n.charAt(i)-55)*Math.pow(b, cnt);
			else
				sum += (int)(n.charAt(i)-48)*Math.pow(b, cnt);
			cnt++;
		}
		System.out.println(sum);
	}
}