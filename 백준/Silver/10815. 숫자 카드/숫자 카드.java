import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        String[] input1 = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
        	set.add(Integer.parseInt(input1[i]));
        }
        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
        	int tmp = Integer.parseInt(input2[i]);
        	if(set.contains(tmp)) {
        		sb.append("1 ");
        	}
        	else {
        		sb.append("0 ");
        	}
        }
        System.out.println(sb);
    }   
}          