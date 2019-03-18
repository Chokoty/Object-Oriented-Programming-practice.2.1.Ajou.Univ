//물류센터 관리 프로그램
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//컨테이너 A B , 입력받는 정수
		int A = 150;
		int B = 0;
		int amount; 
		//무한루프
		while(true) {
			System.out.println("Logistics center A : "+A+" containers");
			System.out.println("Logistics center B : "+B+" containers");
			
			//종료조건
			if(A == 0)
			{
				 System.out.print("Job done. Good bye!");
				 break;
			}
			
			//종료되기전까지 반복
			System.out.println("Please enter the number of containers to move from A to B");
			System.out.print(">> ");
			amount = in.nextInt();
			
			//예외처리 A보다 클때 오류창, 다시입력
			if(amount > A) {
				 System.out.println("You entered more than the number of containers in center A!");
				 continue;
			}
			
			//연산
			A = A - amount;
			B = B + amount;
		}
		in.close();
	}
}
