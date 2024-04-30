import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int numarr[] = new int[n+1];
    	int sumarr[] = new int[n+1];
    	for(int i=1; i<numarr.length; i++) {
    		numarr[i] = sc.nextInt();
    	}
    	int max = -100000;
    	for(int i=1; i<=n-k+1; i++) {
    		for(int j=i; j<i+k; j++)
    			sumarr[i] += numarr[j];
    		if(max<sumarr[i])
    			max = sumarr[i];
    	}
    	System.out.println(max);
    }
}