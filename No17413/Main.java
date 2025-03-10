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

		StringTokenizer st = new StringTokenizer(br.readLine(), "<");

		while(st.hasMoreElements()) {
			String word = st.nextToken();
			int closeIndex = 0;
			boolean flag = false;
			
			for(int i=0;i<word.length();i++) {
				if(word.charAt(i)=='>') {
					flag = true;
					closeIndex = i;
				}
			}
			
			if(flag) sb.append("<"+word.substring(0,closeIndex+1));
			
			StringTokenizer space = new StringTokenizer(word.substring(flag?closeIndex+1:closeIndex,word.length()), " ");
			while(space.hasMoreElements()) {
				String temp = space.nextToken();
				for(int i=temp.length()-1;i>=0;i--) {
					sb.append(temp.charAt(i));
				}
				
				if (space.hasMoreTokens()) {
			        sb.append(" ");
			    }
			}
		}
		
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
	}
}
