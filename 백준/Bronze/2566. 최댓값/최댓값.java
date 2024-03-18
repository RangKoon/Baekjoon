import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		int max = 0;
		int hang = 0;
		int yeol = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
				if(max<arr[i][j]) {
					max = arr[i][j];
					hang = i;
					yeol = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((hang+1) + " " + (yeol+1));
	}
}
