import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        StringBuilder str = new StringBuilder();

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            if(a<x)
                str.append(a).append(" ");
        }

        System.out.println(str);
    }
}