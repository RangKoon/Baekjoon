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
   				land[i][j] = s.charAt(j);
   			}
   		}
    	
    	
   		int[] dx = {1, -1, 0, 0}; // 순서대로 동서남북
   		int[] dy = {0, 0, -1, 1};
    	
   		
    	Queue<Point> q = new LinkedList<>();
   		int cnt = 0;
   		for(int i=0; i<n; i++) {
   			for(int j=0; j<n; j++) {
   				if(visited[i][j] == false && land[i][j] == 'R') {
    				q.add(new Point(i,j));
    				visited[i][j] = true;
    				cnt ++;
    				while(q.size() > 0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x + dx[v] < 0 || p.x + dx[v] > n-1 || p.y + dy[v] < 0 || p.y + dy[v] > n-1)
    							continue;
    						if(land[p.x + dx[v]][p.y + dy[v]] == 'R' && visited[p.x + dx[v]][p.y + dy[v]] == false) {
    							visited[p.x + dx[v]][p.y + dy[v]] = true;
    							q.add(new Point(p.x + dx[v], p.y + dy[v]));
    						}
    					}
    				}
    			}
   				if(visited[i][j] == false && land[i][j] == 'G') {
    				q.add(new Point(i,j));
    				visited[i][j] = true;
    				cnt ++;
    				while(q.size() > 0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x + dx[v] < 0 || p.x + dx[v] > n-1 || p.y + dy[v] < 0 || p.y + dy[v] > n-1)
    							continue;
    						if(land[p.x + dx[v]][p.y + dy[v]] == 'G' && visited[p.x + dx[v]][p.y + dy[v]] == false) {
    							visited[p.x + dx[v]][p.y + dy[v]] = true;
    							q.add(new Point(p.x + dx[v], p.y + dy[v]));
    						}
    					}
    				}
    			}
   				if(visited[i][j] == false && land[i][j] == 'B') {
    				q.add(new Point(i,j));
    				visited[i][j] = true;
    				cnt ++;
    				while(q.size() > 0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x + dx[v] < 0 || p.x + dx[v] > n-1 || p.y + dy[v] < 0 || p.y + dy[v] > n-1)
    							continue;
    						if(land[p.x + dx[v]][p.y + dy[v]] == 'B' && visited[p.x + dx[v]][p.y + dy[v]] == false) {
    							visited[p.x + dx[v]][p.y + dy[v]] = true;
    							q.add(new Point(p.x + dx[v], p.y + dy[v]));
    						}
    					}
    				}
    			}
    		}
    	}
   		sb.append(cnt + "\n");
   		
   		
   		boolean[][] visited_2 = new boolean[n][n];
   		for(int i=0; i<n; i++) {
   			for(int j=0; j<n; j++) {
   				if(land[i][j] == 'G')
   					land[i][j] = 'R';
   			}
   		}
   		
   		
   		int cnt_2 = 0;
   		for(int i=0; i<n; i++) {
   			for(int j=0; j<n; j++) {
   				if(visited_2[i][j] == false && land[i][j] == 'R') {
    				q.add(new Point(i,j));
    				visited_2[i][j] = true;
    				cnt_2 ++;
    				while(q.size() > 0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x + dx[v] < 0 || p.x + dx[v] > n-1 || p.y + dy[v] < 0 || p.y + dy[v] > n-1)
    							continue;
    						if(land[p.x + dx[v]][p.y + dy[v]] == 'R' && visited_2[p.x + dx[v]][p.y + dy[v]] == false) {
    							visited_2[p.x + dx[v]][p.y + dy[v]] = true;
    							q.add(new Point(p.x + dx[v], p.y + dy[v]));
    						}
    					}
    				}
    			}
   				
   				if(visited_2[i][j] == false && land[i][j] == 'B') {
    				q.add(new Point(i,j));
    				visited_2[i][j] = true;
    				cnt_2 ++;
    				while(q.size() > 0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x + dx[v] < 0 || p.x + dx[v] > n-1 || p.y + dy[v] < 0 || p.y + dy[v] > n-1)
    							continue;
    						if(land[p.x + dx[v]][p.y + dy[v]] == 'B' && visited_2[p.x + dx[v]][p.y + dy[v]] == false) {
    							visited_2[p.x + dx[v]][p.y + dy[v]] = true;
    							q.add(new Point(p.x + dx[v], p.y + dy[v]));
    						}
    					}
    				}
    			}
    		}
    	}
   		sb.append(cnt_2);
    	System.out.println(sb);
    	
    	
    }
}   