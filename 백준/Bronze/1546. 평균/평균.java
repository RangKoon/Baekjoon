import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		int arr[] = new int[n];
		float sum = 0.0f;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>max)
				max = arr[i];
		}
		
		for(int i=0; i<n; i++) {
			sum += ((float)arr[i]/max)*100;
		}
		System.out.println(sum / n);
		
	}
}