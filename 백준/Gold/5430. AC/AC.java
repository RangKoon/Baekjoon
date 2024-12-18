import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<t; i++) {
    		String p = br.readLine();
    		int n = Integer.parseInt(br.readLine());
    		String s = br.readLine();
    		StringBuilder s2 = new StringBuilder();
    		boolean isError = false;
    		boolean isReverse = false;
    		
    		ArrayDeque<Integer> arr = new ArrayDeque<>();
    		for(int j=0; j<s.length(); j++) {
    			if(s.charAt(j) == '[' || s.charAt(j) == ']') continue;
    			s2.append(s.charAt(j));
    		}
    		String s3 = "";
    		s3 += s2;
    		if(n>0) {
	    		String[] input = s3.split(",");
	    		
	    		for(int j=0; j<input.length; j++) {
	    			arr.add(Integer.parseInt(input[j]));
	    		}
    		}
    		for(int j=0; j<p.length(); j++) {
    			if(p.charAt(j) == 'D') {
    				if(arr.size() == 0) {
    					sb.append("error\n");
    					isError = true;
    					break;
    				}
    				if(isReverse == false)
    					arr.removeFirst();
    				else
    					arr.removeLast();
    				
    			}
    			else if(p.charAt(j) == 'R') {
    				isReverse = !isReverse;
    			}
    		}
    		if(isError == false) {
	    		sb.append("[");
	    		if(arr.size()>0) {
	    			int k = arr.size();
	    			if(isReverse == false) {
			    		for(int j=0; j<k-1; j++) {
			    			sb.append(arr.removeFirst() + ",");
			    		}
			    		sb.append(arr.removeFirst());
	    			}
	    			else {
	    				for(int j=0; j<k-1; j++) {
			    			sb.append(arr.removeLast() + ",");
			    		}
			    		sb.append(arr.removeLast());
	    			}
	    		}
	    		sb.append("]\n");
    		}
    		
    	}
    	System.out.println(sb);
    	
    }      
}   