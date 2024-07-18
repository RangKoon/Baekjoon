import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
        	String[] input = br.readLine().split(" ");
        	String s1 = input[0];
        	String s2 = input[1];
        	if(s2.equals("enter")) {
        		set.add(s1);
        	}
        	else {
        		set.remove(s1);
        	}
        }
        ArrayList<String> arr = new ArrayList<>(set);
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=arr.size()-1; i>=0; i--) {
        	sb.append(arr.get(i) + "\n");
        }
        System.out.println(sb);
    }   
}          