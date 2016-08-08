import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Smallest_K_integers {

	public static void main(String[] args) {
		Smallest_K_integers sk = new Smallest_K_integers();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int k = sc1.nextInt();
		System.out.println("Enter the integers");
		
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			arrayList.add(i);
		}
		System.out.println(arrayList);
		System.out.println("Enter the value of k");
		Collections.sort(arrayList);
		sk.smallest_k_Integers(arrayList, k);
	}

	public void smallest_k_Integers(ArrayList<Integer> arrayList, int k) {

		ArrayList<Integer> temp = new ArrayList<Integer>();
		if (k <= 0 || k > arrayList.size()) {
			System.out
					.println("Enter a positive value less than number of elements");
		} else {
			for (int i = 0; i < k; i++) {
				temp.add(arrayList.get(i));
			}
			System.out.println("k Smallest integers " +temp);
		}
	}
}





















