import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xarr[] = new int[n];
        int yarr[] = new int[n];
        
        for(int i=0; i<n; i++) {
        	xarr[i] = sc.nextInt();
        	yarr[i] = sc.nextInt();
        	
        }
        
        Arrays.sort(xarr);
        Arrays.sort(yarr);
        
        System.out.println((xarr[n-1]-xarr[0]) * (yarr[n-1]-yarr[0]));
        
    }
}