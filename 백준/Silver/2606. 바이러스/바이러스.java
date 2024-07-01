import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        LinkedList<LinkedList<Integer>> arr = new LinkedList<>();
        for(int i=0; i<=n; i++) {
        	LinkedList<Integer> newarr = new LinkedList<>();
        	arr.add(newarr);
        }
        for(int i=0; i<t; i++) {
        	String[] input = br.readLine().split(" ");
        	int a = Integer.parseInt(input[0]);
        	int b = Integer.parseInt(input[1]);
        	arr.get(a).add(b);
        	arr.get(b).add(a);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        q.add(1);
        visited[1] = true;
        for(int i=0; i<arr.get(1).size(); i++) {
        	q.add(arr.get(1).get(i));
        	visited[arr.get(1).get(i)] = true;
        }
        q.remove();
        int cnt = 0;
        while(q.size() != 0) {
        	cnt ++;
        	int tmp = q.peek();
        	for(int i=0; i<arr.get(tmp).size(); i++) {
        		if(visited[arr.get(tmp).get(i)] == false ) {
        			q.add(arr.get(tmp).get(i));
        			visited[arr.get(tmp).get(i)] = true;
        			
        		}
        	}
        	q.remove();
        }
        System.out.println(cnt);
        
        
    }
}