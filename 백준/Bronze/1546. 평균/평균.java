import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        int N = sc.nextInt();
        float[] grade = new float[N];
        float max = 0;
        float sum = 0;
        for(int i = 0; i<N; i++){
            grade[i] = sc.nextFloat();
            if(grade[i]>max)
            max = grade[i];
        }
        for(int i = 0; i<N; i++){
            grade[i] = grade[i]/max*100;
            sum +=grade[i];
        }
        System.out.println(sum/N);
     }
}