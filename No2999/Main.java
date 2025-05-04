import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String input = st.nextToken();
        int strlen = input.length();
        int R = 0;
        int C = 0;
        
        for(int i=1;i<=strlen;i++) {
        	for(int j=i;j<=strlen;j++) {
        		if(i*j==strlen) {
        			if(i>R) {
        				R = i;
        				C = j;
        			}
        		}
        	}
        }
        
        for(int i=0;i<R;i++) {
        	for(int j=0;j<C;j++) {
        		sb.append(input.charAt(i+(R*j)));
        	}
        }
        
        bw.write(String.valueOf(sb));
		bw.flush();
        bw.close();
	}
}
