import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int arr[] = new int[11];
    	for(int i=1; i<arr.length; i++) {
    		arr[i] = sc.nextInt();    		
    	}
    	int sumarr[] = new int[11];
    	for(int i=1; i<sumarr.length; i++) {
    		sumarr[i] = sumarr[i-1] + arr[i];
    	}
    	int m1 = 0;
    	int m2 = 0;
    	for(int i=1; i<sumarr.length; i++) {
    		if(sumarr[i]-100==0) {
    			m1 = m2 = 100;
    			break;
    		}
    		else if(sumarr[i]>100) {
    			m1 = sumarr[i];
    			m2 = sumarr[i-1];
    			break;
    		}
    	}
    	if(m1-100 == 100-m2) {
    		System.out.println(m1);
    	}
    	else if(m1<100) 
    		System.out.println(sumarr[10]);
    	else if(m1-100 > 100-m2)
    		System.out.println(m2);
    	else if(m1-100 < 100-m2)
    		System.out.println(m1);
    	
    }
}