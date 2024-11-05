import java.util.*;
import java.io.*;


class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
   		
    	
    	int[][] land = new int[n][n];
    	boolean[][] visited = new boolean[n][n];
    	
    	for(int i=0; i<n; i++) {
   			String s = br.readLine();
   			for(int j=0; j<n; j++) {
   				land[i][j] = s.charAt(j) - '0';
   			}
   		}
    	
    	
   		int[] dx = {1, -1, 0, 0}; // 순서대로 동서남북
   		int[] dy = {0, 0, -1, 1};
    	
   		ArrayList<Integer> arrList = new ArrayList<>();
   		
    	Queue<Point> q = new LinkedList<>();
   		int cnt = 0;
   		for(int i=0; i<n; i++) {
   			for(int j=0; j<n; j++) {
   				if(visited[i][j] == false && land[i][j] == 1) {
    				q.add(new Point(i,j));
    				visited[i][j] = true;
    				cnt ++;
    				int tmp = 0;
    				
    				
    				while(q.size() > 0) {
    					Point p = q.poll();
    					tmp ++;
    					for(int v=0; v<4; v++) {
    						if(p.x + dx[v] < 0 || p.x + dx[v] > n-1 || p.y + dy[v] < 0 || p.y + dy[v] > n-1)
    							continue;
    						if(land[p.x + dx[v]][p.y + dy[v]] == 1 && visited[p.x + dx[v]][p.y + dy[v]] == false) {
    							visited[p.x + dx[v]][p.y + dy[v]] = true;
    							q.add(new Point(p.x + dx[v], p.y + dy[v]));
    								
    						}
    					}
    				}
    				arrList.add(tmp);
    			}
    		}
    	
    		
    		
    	}
   		sb.append(cnt + "\n");
		Collections.sort(arrList);
		for(int i=0; i<arrList.size(); i++) {
			sb.append(arrList.get(i) + "\n");
		}
   		
    	System.out.println(sb);
    	
    	
    }
}   