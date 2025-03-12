import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        	
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        			
        		if((i*j)>n) break;
        		else result++;
        	}
        }
		
		
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
	}
}
