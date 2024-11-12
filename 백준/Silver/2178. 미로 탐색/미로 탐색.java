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
    	String[] input = br.readLine().split(" ");
    	int n = Integer.parseInt(input[0]);
    	int m = Integer.parseInt(input[1]);
    	
    	int[][] land = new int[n][m];
    	boolean[][] visited = new boolean[n][m];
    	int[][] cnt = new int[n][m];
    	for(int i=0; i<n; i++) {
    		String s = br.readLine();
    		for(int j=0; j<m; j++) {
    			land[i][j] = s.charAt(j) - '0';
    		}
    	}
    	
    	int[] dx = {1,-1,0,0};
    	int[] dy = {0,0,1,-1};
    	Queue<Point> q = new LinkedList<>();
    	int counter = 1;
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<m; j++) {
    			if(land[i][j] == 1 && visited[i][j] == false) {
    				q.add(new Point(i,j));
    				visited[i][j] = true;
    				cnt[i][j] = counter;
    				while(q.size()>0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x+dx[v]<0 || p.x+dx[v]>n-1 || p.y+dy[v]<0 || p.y+dy[v]>m-1) continue;
    						if(land[p.x+dx[v]][p.y+dy[v]] == 1 && visited[p.x+dx[v]][p.y+dy[v]] == false) {
    							q.add(new Point(p.x+dx[v],p.y+dy[v]));
    							visited[p.x+dx[v]][p.y+dy[v]] = true;
    							cnt[p.x+dx[v]][p.y+dy[v]] = cnt[p.x][p.y]+ 1;
    						}
    					}
    				}
    			}
    		}
    	}
    	System.out.println(cnt[n-1][m-1]);
    }
}   