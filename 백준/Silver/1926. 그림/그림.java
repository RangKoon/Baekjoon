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
    	
    	int[][] draw = new int[n][m];
    	boolean[][] visited = new boolean[n][m];
    	
    	for(int i=0; i<n; i++) {
    		String[] s = br.readLine().split(" ");
    		for(int j=0; j<m; j++) {
    			draw[i][j] = Integer.parseInt(s[j]);
    		}
    	}
    	
    	int[] dx = {1,-1,0,0};
    	int[] dy = {0,0,1,-1};
    	
    	ArrayList<Integer> arr = new ArrayList<>();
    	
    	Queue<Point> q = new LinkedList<>();
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<m; j++) {
    			if(draw[i][j] == 1 && visited[i][j] == false) {
    				q.add(new Point(i,j));
    				visited[i][j] = true;
    				int tmp = 1;
    				while(q.size() > 0) {
    					Point p = q.poll();
    					for(int v=0; v<4; v++) {
    						if(p.x+dx[v]<0 || p.x+dx[v]>n-1 || p.y+dy[v]>m-1 || p.y+dy[v]<0)
    							continue;
    						if(draw[p.x+dx[v]][p.y+dy[v]] == 1 && visited[p.x+dx[v]][p.y+dy[v]] == false) {
    							q.add(new Point(p.x+dx[v], p.y+dy[v]));
    							visited[p.x+dx[v]][p.y+dy[v]] = true;
    							tmp ++;
    						}
    					}
    				}
    				arr.add(tmp);
    			}
    		}
    	}
    	
    	Collections.sort(arr);
    	
    	if(arr.size() == 0) {
    		System.out.println(0);
    		System.out.println(0);    	}
    	else {
    		System.out.println(arr.size());
    		System.out.println(arr.get(arr.size()-1));
    	}
    	
    }
}   