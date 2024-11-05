import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]);
    	int m = Integer.parseInt(input[1]);
    	int r = Integer.parseInt(input[2]);
    	
    	ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    	
    	for(int i=0; i<n+1; i++) {
    		arr.add(new ArrayList<Integer>());
    	}
    	for(int i=0; i<m; i++) {
    		String[] input2 = br.readLine().split(" ");
    		int from = Integer.parseInt(input2[0]);
    		int to = Integer.parseInt(input2[1]);
    		arr.get(from).add(to);
    		arr.get(to).add(from);
    	}
    	
    	for(int i=1; i<n+1; i++) {
    		Collections.sort(arr.get(i));
    	}
    	boolean[] visited = new boolean[n+1];
    	Stack<Integer> st = new Stack<>();
    	st.push(r);
    	int[] num = new int[n+1];
    	int cnt = 1;
    	while(st.size() > 0) {
    		int peek = st.pop();
    		if(visited[peek] == false) {
    			visited[peek] = true;
    			num[peek] = cnt;
    			cnt ++;
    		}
    		for(int j=0; j<arr.get(peek).size(); j++) {
    			if(visited[arr.get(peek).get(j)] == false) {
    				st.push(arr.get(peek).get(j));
    			}
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	for(int i=1; i<n+1; i++) {
    		sb.append(num[i] + "\n");
    	}
    	System.out.println(sb);
    }
}   