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
        
        int result = 0;
        String input = st.nextToken();
        
        int index = 0;
        while(index < input.length()) {
        	
        	boolean flag = false;
        	if(index + 1 < input.length()) {
        		char temp = input.charAt(index+1);
        	
        		switch(input.charAt(index)) {
        			case 'c':
        				if(temp == '=' ||  temp == '-') flag = true;
        				break;
        			case 'd':
        				if(temp == 'z') {
        					if((index+2) < input.length() && input.charAt(index+2) == '=') {
        						flag = true;
        						index = index + 1;
        					}
        				}
        				else if(temp == '-') flag = true;
        				break;
        			case 'l':
        				if(temp == 'j') flag = true;
        				break;
        			case 'n':
        				if(temp == 'j') flag = true;
        				break;
        			case 's':
        				if(temp == '=') flag = true;
        				break;
        			case 'z':
        				if(temp == '=') flag = true;
        				break;
        		}
        	}
        	
        	if(flag) index = index + 2;
        	else index = index + 1;
        	
        	result = result + 1;
        	
        }
        
        bw.write(String.valueOf(result));
		bw.flush();
        bw.close();
	}
}
