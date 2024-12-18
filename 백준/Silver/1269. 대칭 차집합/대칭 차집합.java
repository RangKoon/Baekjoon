import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashSet<Integer> hs1 = new HashSet<>();
    	HashSet<Integer> hs2 = new HashSet<>();
    	
    	String[] input = br.readLine().split(" ");
    	int intA = Integer.parseInt(input[0]);
    	int intB = Integer.parseInt(input[1]);
    	

    	String[] input2 = br.readLine().split(" ");
       	
    	for(int i=0; i<intA; i++) {	
       		hs1.add(Integer.parseInt(input2[i]));
    	}
       	String[] input3 = br.readLine().split(" ");	
    	
    	
    	for(int i=0; i<intB; i++) {	
       		hs2.add(Integer.parseInt(input3[i]));
       	}
    	
    	
    	HashSet<Integer> hs3 = new HashSet<>(hs1);
    	HashSet<Integer> hs4 = new HashSet<>(hs2);
    	
    	hs3.removeAll(hs2);
    	hs4.removeAll(hs1);
    	
    	hs3.addAll(hs4);
    	System.out.println(hs3.size());
    	
    }
}   