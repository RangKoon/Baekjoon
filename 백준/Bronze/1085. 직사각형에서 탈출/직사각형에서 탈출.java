import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int arr[] = new int[] {x, y, w-x, h-y};
        int min = arr[0];
        
        for(int i=1; i<4; i++) {
        	if(arr[i]<min)
        		min = arr[i];
        }
        
        System.out.println(min);
        
        
    }
}