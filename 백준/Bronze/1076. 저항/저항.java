import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        if(s1.equals("black"))
        	s1 = "";
        else if(s1.equals("brown"))
        	s1 = "1";
        else if(s1.equals("red"))
        	s1 = "2";
        else if(s1.equals("orange"))
        	s1 = "3";
        else if(s1.equals("yellow"))
        	s1 = "4";
        else if(s1.equals("green"))
        	s1 = "5";
        else if(s1.equals("blue"))
        	s1 = "6";
        else if(s1.equals("violet"))
        	s1 = "7";
        else if(s1.equals("grey"))
        	s1 = "8";
        else if(s1.equals("white"))
        	s1 = "9";
        
        if(s2.equals("black"))
        	s2 = "0";
        else if(s2.equals("brown"))
        	s2 = "1";
        else if(s2.equals("red"))
        	s2 = "2";
        else if(s2.equals("orange"))
        	s2 = "3";
        else if(s2.equals("yellow"))
        	s2 = "4";
        else if(s2.equals("green"))
        	s2 = "5";
        else if(s2.equals("blue"))
        	s2 = "6";
        else if(s2.equals("violet"))
        	s2 = "7";
        else if(s2.equals("grey"))
        	s2 = "8";
        else if(s2.equals("white"))
        	s2 = "9";
        
        if(s1.equals("") && s2.equals("0"))
        	s3 = "";
        else {
	        if(s3.equals("black"))
	        	s3 = "";
	        else if(s3.equals("brown"))
	        	s3 = "0";
	        else if(s3.equals("red"))
	        	s3 = "00";
	        else if(s3.equals("orange"))
	        	s3 = "000";
	        else if(s3.equals("yellow"))
	        	s3 = "0000";
	        else if(s3.equals("green"))
	        	s3 = "00000";
	        else if(s3.equals("blue"))
	        	s3 = "000000";
	        else if(s3.equals("violet"))
	        	s3 = "0000000";
	        else if(s3.equals("grey"))
	        	s3 = "00000000";
	        else if(s3.equals("white"))
	        	s3 = "000000000";
        }
        	
        
        System.out.println(s1+s2+s3);
    }
}