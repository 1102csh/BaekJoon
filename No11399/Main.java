import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());	// 사람 수
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result=0;
		for(int i=0;i<N;i++) {
			int minIndex = i;
			for(int j=i;j<N;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;			
		}
		
		for(int i=0;i<N;i++) {
			int temp=0;
			for (int j=0;j<=i;j++){
				temp = temp + arr[j];
			}
			
			result = result + temp;
		}
		
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
	}

}
