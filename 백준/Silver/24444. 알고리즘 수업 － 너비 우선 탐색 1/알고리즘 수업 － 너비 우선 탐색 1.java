import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);
        int r = Integer.parseInt(input1[2]);
        
        int[] count = new int[n+1];
        boolean[] bool = new boolean[n+1];
        int cnt = 1;
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        for(int i=0; i<n+1; i++) {
        	ArrayList<Integer> newarr = new ArrayList<>();
        	arr.add(newarr);
        }
        
        for(int i=0; i<m; i++) {
        	String[] input2 = br.readLine().split(" ");
        	int a = Integer.parseInt(input2[0]);
        	int b = Integer.parseInt(input2[1]);
        	arr.get(a).add(b); arr.get(b).add(a);
        }
        
        for(int i=0; i<n+1; i++) { // 오른차순 정렬
        	arr.get(i).sort(Comparator.naturalOrder());
        }
        
        Queue <Integer> q = new LinkedList<>();
        
        q.add(r);
        bool[r] = true;
        count[r] = cnt;
        cnt ++;
        
        for(int i=0; i<arr.get(r).size(); i++) {
        	q.add(arr.get(r).get(i));
        	bool[arr.get(r).get(i)] = true;
        }
        
        q.remove(); // 초기 정점 제거
        
        while(q.size() != 0) {
        	for(int i=0; i<arr.get(q.peek()).size(); i++) {	
        		if(!bool[arr.get(q.peek()).get(i)]) {
        			q.add(arr.get(q.peek()).get(i));
        			bool[arr.get(q.peek()).get(i)] = true;
        		}
        		else {
        			continue;
        		}
        	}
        	
        	count[q.peek()] = cnt;
        	
        	q.remove();
        	
        	cnt ++;
        	
        }
        
        for(int i=1; i<n+1; i++) {
        	sb.append(count[i] + "\n");
        }
        System.out.println(sb);
    }
}
