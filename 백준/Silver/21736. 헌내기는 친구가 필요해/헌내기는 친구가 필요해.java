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
    	
    	char[][] univ = new char[n][m];
    	boolean[][] visited = new boolean[n][m];
    	
    	for(int i=0; i<n; i++) {
    		String s = br.readLine();
    		for(int j=0; j<m; j++) {
    			univ[i][j] = s.charAt(j);
    		}
    	}
    	
    	int cnt = 0;
    	
    	int[] dx = {1,-1,0,0};
    	int[] dy = {0,0,1,-1};
    	
    	Queue<Point> q = new LinkedList<>();
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<m; j++) {
    			if(univ[i][j] == 'I') {
    				q.add(new Point(i,j));
    				visited[i][j] = true;
    				while(q.size()>0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x + dx[v]<0 || p.x + dx[v]>n-1 || p.y + dy[v]<0 || p.y + dy[v]>m-1)
    							continue;
    						if(univ[p.x+dx[v]][p.y+dy[v]] == 'O' && visited[p.x+dx[v]][p.y+dy[v]]==false) {     
    							q.add(new Point(p.x+dx[v],p.y+dy[v]));
    							visited[p.x+dx[v]][p.y+dy[v]] = true;
    						}
    						if(univ[p.x+dx[v]][p.y+dy[v]] == 'P' && visited[p.x+dx[v]][p.y+dy[v]]==false) {     
    							cnt ++;
    							q.add(new Point(p.x+dx[v],p.y+dy[v]));
    							visited[p.x+dx[v]][p.y+dy[v]] = true;
    						}
    					}
    				}
    			}
    		}
    	}
    	
    	if(cnt==0)
    		System.out.println("TT");
    	else
    		System.out.println(cnt);
    	
    }
}   