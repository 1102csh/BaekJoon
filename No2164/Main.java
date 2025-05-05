import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Queue<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(st.nextToken());
        
        for(int i=1;i<=N;i++) queue.offer(i);
        for(int i=0;i<N-1;i++) {
        	queue.poll();
        	int temp = queue.poll();
        	queue.offer(temp);
        }
        bw.write(String.valueOf(queue.peek()));
		bw.flush();
        bw.close();
	}
}
