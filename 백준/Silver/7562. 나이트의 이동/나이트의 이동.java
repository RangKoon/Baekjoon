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
    		int n = Integer.parseInt(br.readLine());
    		String[] from = br.readLine().split(" ");
    		int from_x = Integer.parseInt(from[0]);
    		int from_y = Integer.parseInt(from[1]);
    		
    		String[] to = br.readLine().split(" ");
    		int to_x = Integer.parseInt(to[0]);
    		int to_y = Integer.parseInt(to[1]);
    		
    		int[][] land = new int[n][n];
    		boolean[][] visited = new boolean[n][n];
    		int[][] cnt = new int[n][n];
    		
    		Queue<Point> q = new LinkedList<>();
    		
    		int[] dx = {1,2,2,1,-1,-2,-2,-1};
    		int[] dy = {2,1,-1,-2,-2,-1,1,2};
    		q.add(new Point(from_x, from_y));
    		visited[from_x][from_y] = true;
    		while(q.size()>0) {
    			Point p = q.poll();
    			for(int v=0; v<8; v++) {
    				if(p.x+dx[v]<0 || p.x+dx[v]>n-1 || p.y+dy[v]<0 || p.y+dy[v]>n-1) continue;
    				if(visited[p.x+dx[v]][p.y+dy[v]] == false) {
    					q.add(new Point(p.x+dx[v], p.y+dy[v]));
    					visited[p.x+dx[v]][p.y+dy[v]] = true;
    					cnt[p.x+dx[v]][p.y+dy[v]] = cnt[p.x][p.y]+ 1; 
    				}
    			}
    		}
    		sb.append(cnt[to_x][to_y] + "\n");
    		
    	}
    	System.out.println(sb);
    }      
}   