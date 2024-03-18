import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		char ch[][] = new char[5][15];

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.next();
			for (int j = 0; j < arr[i].length(); j++) {
				ch[i][j] = arr[i].charAt(j);
			}
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][0] == 0)
				continue;
			System.out.print(ch[i][0]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][1] == 0)
				continue;
			System.out.print(ch[i][1]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][2] == 0)
				continue;
			System.out.print(ch[i][2]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][3] == 0)
				continue;
			System.out.print(ch[i][3]);
		
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][4] == 0)
				continue;
			System.out.print(ch[i][4]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][5] == 0)
				continue;
			System.out.print(ch[i][5]);
	
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][6] == 0)
				continue;
			System.out.print(ch[i][6]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][7] == 0)
				continue;
			System.out.print(ch[i][7]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][8] == 0)
				continue;
			System.out.print(ch[i][8]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][9] == 0)
				continue;
			System.out.print(ch[i][9]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][10] == 0)
				continue;
			System.out.print(ch[i][10]);
		
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][11] == 0)
				continue;
			System.out.print(ch[i][11]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][12] == 0)
				continue;
			System.out.print(ch[i][12]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][13] == 0)
				continue;
			System.out.print(ch[i][13]);
			
		}
		for (int i = 0; i < 5; i++) {
			if ((int)ch[i][14] == 0)
				continue;
			System.out.print(ch[i][14]);
			
		}
		
	}
}
