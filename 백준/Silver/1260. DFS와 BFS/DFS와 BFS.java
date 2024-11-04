import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]); // 정점의 개수
    	int m = Integer.parseInt(input[1]); // 간선의 개수
    	int v = Integer.parseInt(input[2]); // 시작 정점
    	
    	ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    	for(int i=0; i<n+1; i++) {
    		arr.add(new ArrayList<Integer>());
    	}
    	
    	for(int i=0; i<m; i++) { // 간선 추가, 연결 리스트로
    		String[] node_input = br.readLine().split(" ");
    		int from_node = Integer.parseInt(node_input[0]);
    		int to_node = Integer.parseInt(node_input[1]);
    		arr.get(from_node).add(to_node);
    		arr.get(to_node).add(from_node);
    	}
    	for(int i=0; i<n+1; i++) {
    		Collections.sort(arr.get(i));
    		Collections.reverse(arr.get(i));
    	}
    	StringBuilder sb = new StringBuilder();
    	
    	// DFS
    	Stack<Integer> st = new Stack<>();
    	boolean[] dfs_visited = new boolean[n+1];

    	st.push(v);
    	
    	while(st.size() > 0) {
    		int peek = st.pop();
    		if(dfs_visited[peek] == false) {
    			dfs_visited[peek] = true;
    			sb.append(peek + " ");
    			for(int j=0; j<arr.get(peek).size(); j++) {
    				if(dfs_visited[arr.get(peek).get(j)] == false) {
    					st.push(arr.get(peek).get(j));
    				}
    			}
    		}
    	}
    	
    	sb.append("\n");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	for(int i=0; i<n+1; i++) {
    		Collections.sort(arr.get(i));
    	}
    	// BFS
    	Queue<Integer> q = new LinkedList<>();
    	boolean bfs_visited[] = new boolean[n+1];
    	bfs_visited[v] = true;
    	for(int i=0; i<arr.get(v).size(); i++) {    		
    		q.add(arr.get(v).get(i));
    		bfs_visited[arr.get(v).get(i)] = true;
    		
    	}
    	sb.append(v + " ");
    	
    	while(q.size() > 0) {
    		int peek = q.peek();
    		for(int j = 0; j<arr.get(peek).size(); j++) {
    			if(bfs_visited[arr.get(peek).get(j)] == false) {
    				q.add(arr.get(peek).get(j));
    				bfs_visited[arr.get(peek).get(j)] = true;
    			}
    		}
    		sb.append(peek + " ");
    		q.remove();
    		
    	}
    	System.out.println(sb);
    	
    	
    }
}   