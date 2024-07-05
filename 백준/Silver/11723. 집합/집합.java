import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
        	String[] input = br.readLine().split(" ");
        	String s = input[0];
        	int x = 0;
        	if(input.length == 2)
        		x = Integer.parseInt(input[1]);
        	
        	if(s.equals("add")) {
        		if(!arr.contains(x)) {
        			arr.add(x);
        		}
        	}
        	else if(s.equals("remove")) {
        		if(arr.contains(x)) {
        			arr.remove(arr.indexOf(x));
        		}
        	}
        	else if(s.equals("check")) {
        		if(arr.contains(x)) {
        			sb.append("1\n");
        		}
        		else {
        			sb.append("0\n");
        		}
        	}
        	else if(s.equals("toggle")) {
        		if(arr.contains(x)) {
        		arr.remove(arr.indexOf(x));
        		}
        		else {
        			arr.add(x);
        		}
        	}
        	else if(s.equals("all")) {
        		for(int j=1; j<=20; j++) {
        			if(!arr.contains(j)) {
        				arr.add(j);
        			}
        		}
        	}
        	else {
        		arr.clear();
        		}
        }
        System.out.println(sb);
    }
}