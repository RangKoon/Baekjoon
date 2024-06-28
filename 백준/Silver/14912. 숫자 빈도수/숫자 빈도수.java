import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        long cnt = 0;
        for(int i=1; i<=n; i++) {
        	int t = i;
        	while(t>0) {
        		if(t%10 == d)
        			cnt ++;
        		t /= 10;
        	}
        }
        System.out.println(cnt);
    }
}