import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1[] = br.readLine().split(" ");
        int a = Integer.parseInt(input1[0]);
        int b = Integer.parseInt(input1[1]);
        LinkedList<LinkedList<Integer>> arr = new LinkedList<>();
        for(int i=0; i<=a; i++) {
        	LinkedList<Integer> newarr = new LinkedList<>();
        	arr.add(newarr);
        }
        for(int i=0; i<b; i++) {
        	String[] input2 = br.readLine().split(" ");
        	int c = Integer.parseInt(input2[0]);
        	int d = Integer.parseInt(input2[1]);
        	arr.get(c).add(d);
        	arr.get(d).add(c);
        }
        boolean[] visited = new boolean[a+1];
        int cnt = 0;
        for(int i=1; i<=a; i++) {
        	Queue<Integer> q = new LinkedList<>();
        	if(visited[i] == false) {
        		cnt ++;
        		q.add(i);
        		visited[i] = true;
        		for(int j=0; j<arr.get(i).size(); j++) {
        			q.add(arr.get(i).get(j));
        			visited[i] = false;
        		}
        		q.remove();
        		while(q.size() != 0) {
        			int tmp = q.peek();
        			for(int j=0; j<arr.get(tmp).size(); j++) {
        				if(visited[arr.get(tmp).get(j)] == false) {
        					q.add(arr.get(tmp).get(j));
        					visited[arr.get(tmp).get(j)] = true;
        				}
        			}
        			q.remove();
        		}
        	}
        }
        System.out.println(cnt);
    }
}