import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        char arr[] = new char[1000];
        int cnt = 0;
        
        while(n>0) {
        	
        	if(n%b==0)
        		arr[cnt] ='0';
        	else if(n%b==1)
        		arr[cnt] = '1';
        	else if(n%b==2)
        		arr[cnt] = '2';
        	else if(n%b==3)
        		arr[cnt] = '3';
        	else if(n%b==4)
        		arr[cnt] = '4';
        	else if(n%b==5)
        		arr[cnt] = '5';
        	else if(n%b==6)
        		arr[cnt] = '6';
        	else if(n%b==7)
        		arr[cnt] = '7';
        	else if(n%b==8)
        		arr[cnt] = '8';
        	else if(n%b==9)
        		arr[cnt] = '9';
        	else if(n%b==10)
        		arr[cnt] = 'A';
        	else if(n%b==11)
        		arr[cnt] = 'B';
        	else if(n%b==12)
        		arr[cnt] = 'C';
        	else if(n%b==13)
        		arr[cnt] = 'D';
        	else if(n%b==14)
        		arr[cnt] = 'E';
        	else if(n%b==15)
        		arr[cnt] = 'F';
        	else if(n%b==16)
        		arr[cnt] = 'G';
        	else if(n%b==17)
        		arr[cnt] = 'H';
        	else if(n%b==18)
        		arr[cnt] = 'I';
        	else if(n%b==19)
        		arr[cnt] = 'J';
        	else if(n%b==20)
        		arr[cnt] = 'K';
        	else if(n%b==21)
        		arr[cnt] = 'L';
        	else if(n%b==22)
        		arr[cnt] = 'M';
        	else if(n%b==23)
        		arr[cnt] = 'N';
        	else if(n%b==24)
        		arr[cnt] = 'O';
        	else if(n%b==25)
        		arr[cnt] = 'P';
        	else if(n%b==26)
        		arr[cnt] = 'Q';
        	else if(n%b==27)
        		arr[cnt] = 'R';
        	else if(n%b==28)
        		arr[cnt] = 'S';
        	else if(n%b==29)
        		arr[cnt] = 'T';
        	else if(n%b==30)
        		arr[cnt] = 'U';
        	else if(n%b==31)
        		arr[cnt] = 'V';
        	else if(n%b==32)
        		arr[cnt] = 'W';
        	else if(n%b==33)
        		arr[cnt] = 'X';
        	else if(n%b==34)
        		arr[cnt] = 'Y';
        	else if(n%b==35)
        		arr[cnt] = 'Z';
        	
        	cnt ++;
        	n /= b;
        	
        }
        
        
        for(int i=cnt-1; i>=0; i--) {
        	System.out.print(arr[i]);
        }
        
        
    }
}