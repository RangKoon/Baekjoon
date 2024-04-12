import java.util.Scanner;
public class Main {
	public static String solve(char c) {
		if(c=='0')
			return "000";
		else if(c=='1')
			return "001";
		else if(c=='2')
			return "010";
		else if(c=='3')
			return "011";
		else if(c=='4')
			return "100";
		else if(c=='5')
			return "101";
		else if(c=='6')
			return "110";
		else 
			return "111";
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()==1)
        	System.out.println("0");
        else {
	        char a = s.charAt(0);
	        if(a=='0')
	        	System.out.print("");
	        else if(a=='1')
	        	System.out.print("1");
	        else if(a=='2')
	        	System.out.print("10");
	        else if(a=='3')
	        	System.out.print("11");
	        else if(a=='4')
	        	System.out.print("100");
	        else if(a=='5')
	        	System.out.print("101");
	        else if(a=='6')
	        	System.out.print("110");
	        else if(a=='7')
	        	System.out.print("111");
	        
	        for(int i=1; i<s.length(); i++) {
	        	char c = s.charAt(i);
	        	System.out.print(solve(c));
	        }
        }       
        
        
    }
}