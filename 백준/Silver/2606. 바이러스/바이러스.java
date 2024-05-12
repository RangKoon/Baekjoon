import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        for(int i=0; i<n+1; i++) {
        	ArrayList<Integer> newarr = new ArrayList<>();
        	arr.add(newarr);
        }
        
        for(int i=0; i<m; i++) {
        	String[] input = br.readLine().split(" ");
        	int a = Integer.parseInt(input[0]);
        	int b = Integer.parseInt(input[1]);
        	arr.get(a).add(b);
        	arr.get(b).add(a);
        }
        
        int cnt = 0;
        int start = 1;
        boolean[] visited = new boolean[n+1]; // 방문 확인 배열
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start); 
        visited[start] = true;
        
        // start의 인접 리스트 q에 삽입
        for(int i=0; i<arr.get(start).size(); i++) { 
        	int tmp = arr.get(start).get(i);
        	q.add(tmp);
        	visited[tmp] = true;
        	cnt ++;
        }
        q.remove();
        
        while(q.size() != 0) {
        	
        	int t = q.peek();
        	
        	for(int i=0; i<arr.get(t).size(); i++) {
        		int tmp2 = arr.get(t).get(i);
        		if(visited[tmp2])
        			continue;
        		else {
        			q.add(tmp2);
        			visited[tmp2] = true;
        			cnt ++;
        		}
        		
        	}
        	
        	q.remove();
        }
        
        System.out.println(cnt);
        
        
    }
}
