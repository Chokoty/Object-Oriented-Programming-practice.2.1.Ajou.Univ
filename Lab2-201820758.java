import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int A = 150;
		int B = 0;
		int amount; 
		while(true) {
			System.out.println("Logistics center A : "+A+" containers");
			System.out.println("Logistics center B : "+B+" containers");
			
			if(A == 0)
			{
				 System.out.print("Job done. Good bye!");
				 break;
			}
			
			System.out.println("Please enter the number of containers to move from A to B");
			System.out.print(">> ");
			amount = in.nextInt();
			
			if(amount > A) {
				 System.out.println("You entered more than the number of containers in center A!");
				 continue;
			}
			A = A - amount;
			B = B + amount;
		}
		in.close();
	}
}
