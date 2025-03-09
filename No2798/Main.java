import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N=0,M=0;
        int result=0;
        
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	// 카드의 개수
		M = Integer.parseInt(st.nextToken());	// 카드의 개수
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					if(j!=i&&(k!=i&&k!=j)) {
						int temp = arr[i]+arr[j]+arr[k];
						if(temp>result&&temp<=M) result = temp;
					}
				}
			}
		}
		
		
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
	}
}
