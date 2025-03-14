import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] dogs = new int[4];
        for(int i=0;i<4;i++) dogs[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] visitors = new int[3];
        for(int i=0;i<3;i++) visitors[i] = Integer.parseInt(st.nextToken());
        
        int[] result = new int[3];
	
        for(int i=0;i<3;i++) {
        	
        	int temp1 = visitors[i]%(dogs[0]+dogs[1]);
        	int temp2 = visitors[i]%(dogs[2]+dogs[3]);
        	
        	if(temp1<=dogs[0] && temp1!=0) result[i]++;      	
        	if(temp2<=dogs[2] && temp2!=0) result[i]++;
        	
        }
		
		for(int i=0;i<3;i++) {
			bw.write(String.valueOf(result[i]));
			bw.newLine();
		}
		bw.flush();
        bw.close();
	}
}
