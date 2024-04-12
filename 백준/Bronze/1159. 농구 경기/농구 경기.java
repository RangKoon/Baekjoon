import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[27];
        int max = 0;
        
        for(int i=0; i<n; i++) {
        	String s = sc.next();
        	arr[s.charAt(0)-'a'] ++;
        }
        for(int i=0; i<arr.length; i++) {
        	if(max<arr[i])
        		max = arr[i];
        }
        if(max<5)
        	System.out.println("PREDAJA");
        else {
        	for(int i=0; i<arr.length; i++) {
        		if(arr[i]>=5)
        			System.out.print((char)(i+'a'));
        	}
        }
    }
}