import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s = 0;
        for(int i=0; i<4; i++) {
        	s += Integer.parseInt(input[i]);
        }
        int t = 0;
        String[] input2 = br.readLine().split(" ");
        for(int i=0; i<4; i++) {
        	t += Integer.parseInt(input2[i]);
        }
        if(s >= t) {
        	System.out.println(s);
        }
        else {
        	System.out.println(t);
        }
    }   
}          