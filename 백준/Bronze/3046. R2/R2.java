import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        System.out.println(s * 2 - r1 );
    }
}