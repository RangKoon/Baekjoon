import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        String[] input = br.readLine().split(" ");
        for(int i=0; i<input.length; i++) {
        	int tmp = Integer.parseInt(input[i]);
        	if(tmp == n)
        		cnt ++;
        }
        System.out.println(cnt);
    }   
}          