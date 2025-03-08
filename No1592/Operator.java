import java.util.Scanner;

public class Operator {

	// 입력 받는 값 N (인원 수), M (게임 종료를 위한 조건 수), L (공을 받았을 때 넘기는 위치)
	static int N,M,L;
	
	public static void main(String[] args) {	
		
		// 입력을 위한 스캐너
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		M = input.nextInt();
		L = input.nextInt();
		
		// 배열 생성 및 초기화
		int[] arr = new int[N];
		for(int i=0;i<N;i++) arr[i]=0;
				
		int count=0;	// 공을 총 몇 번 던졌는지 카운트 값
		int target=0;	// 현재 공을 가지고 있는 대상 > 첫 번째는 반드시 1번 자리
				
		while(true) {
			arr[target]++;
					
			if(arr[target]>=M) break;
			else {
				// 공을 받은 횟수가 짝수면 반시계 방향으로 L만큼
				if(arr[target]%2==0) target = target - L;
				// 공을 받은 횟수가 홀수면 시계 방향으로 L만큼
				else target = target + L;
						
				if(target<0) target = target+N;
				else if(target>=N) target = target-N;
						
				count++;
			}
		}
		
		System.out.println(count);
	}
}
