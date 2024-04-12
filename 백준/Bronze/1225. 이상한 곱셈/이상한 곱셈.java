import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        long sum = 0;
        for(int i=0; i<arr[0].length(); i++) {
        	for(int j=0; j<arr[1].length(); j++) {
        		sum += (arr[0].charAt(i)-'0') * (arr[1].charAt(j)-'0');
        	}
        }
        System.out.println(sum);
    }
}