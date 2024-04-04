import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int arr[] = new int[1500];
        int cnt = 0;
        int index = 0;
        
        while(true) {
        	cnt ++;
        	
        	for(int i=index; i<index+cnt; i++) {
        		arr[i] = cnt;
        	}
        	index += cnt;
        	if(index>1004)
        		break;
        }
        
        int sum = 0;
        
        for(int i=a-1; i<b; i++) {
        	sum += arr[i];
        }
        
        System.out.println(sum);
    }
}