import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        
        int answer = 0;
        int index = 1;
        int len = str.length();
        if(len > 0) {
            char tmp = str.charAt(0);

            while (index < len) {
                if (str.charAt(index) == tmp){
                    index++;
                    continue;
                }

                answer++;
                
                for (int i = index; i < len; i++) {
                    if (str.charAt(i) == tmp) {
                        break;
                    }
                    index++;
                }
            }
        }
        System.out.println(answer);
    }
}
