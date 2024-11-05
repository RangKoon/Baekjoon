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
    	
    	
    	int t = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<t; i++) {
    		String[] input = br.readLine().split(" ");
    		
    		int m = Integer.parseInt(input[0]);
    		int n = Integer.parseInt(input[1]);
    		int k = Integer.parseInt(input[2]);
    		
    		int[][] land = new int[n][m];
    		boolean[][] visited = new boolean[n][m];
    		
    		int[] dx = {1, -1, 0, 0}; // 순서대로 동서남북
    		int[] dy = {0, 0, -1, 1};
    				
    		for(int j=0; j<k; j++) { // 배추밭 1로 변경
    			String[] input1 = br.readLine().split(" ");
    			land[Integer.parseInt(input1[1])][Integer.parseInt(input1[0])] = 1;
    		}
    		
    		Queue<Point> q = new LinkedList<>();
    		int cnt = 0;
    		for(int j=0; j<n; j++) {
    			for(int l=0; l<m; l++) {
    				if(visited[j][l] == false && land[j][l] == 1) {
    					q.add(new Point(j,l));
    					visited[j][l] = true;
    					cnt ++;
    					while(q.size() > 0) {
    						Point p = q.poll();
    						for(int v=0; v<4; v++) {
    							if(p.x + dx[v] < 0 || p.x + dx[v] > n-1 || p.y + dy[v] < 0 || p.y + dy[v] > m-1)
    								continue;
    							if(land[p.x + dx[v]][p.y + dy[v]] == 1 && visited[p.x + dx[v]][p.y + dy[v]] == false) {
    								visited[p.x + dx[v]][p.y + dy[v]] = true;
    								q.add(new Point(p.x + dx[v], p.y + dy[v]));
    								
    							}
    						}
    					}
    				}
    			}
    		}
    		sb.append(cnt + "\n");
    		
    		
    	}
    	System.out.println(sb);
    	
    	
    }
}   