import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		SquareRoot squareroot = new SquareRoot();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("Enter positive number");
		}
		squareroot.squareRootBinary(a);
	}
	
	public void squareRootBinary(int number){
		double start = 0;
		double end = number;
		double mid = (start+end)/2;
		double prevMid = 0;
		double diff = Math.abs(mid - prevMid);
		
		while((mid*mid != number)){
			if(mid*mid > number){
				end = mid;
			}
			else{
				start = mid;
			}
			prevMid = mid;
			mid = (start+end)/2;
			diff = Math.abs(mid - prevMid);
		}
		System.out.println("mid " +mid);
	}
}


















