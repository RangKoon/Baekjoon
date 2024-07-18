import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        ArrayList<String> arrlist = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
        	set.add(br.readLine());
        }
        for(int i=0; i<m; i++) {
        	String s = br.readLine();
        	if(set.contains(s)) {
        		arrlist.add(s);
        	}
        }
        Collections.sort(arrlist);
        StringBuilder sb = new StringBuilder();
        sb.append(arrlist.size() + "\n");
        for(int i=0; i<arrlist.size(); i++) {
        	sb.append(arrlist.get(i) + "\n");
        }
        System.out.println(sb);
    }   
}          