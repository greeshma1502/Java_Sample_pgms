import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {

		Median m = new Median();
		System.out.println("Enter the integers");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			arrayList.add(i);
		}
		System.out.println(arrayList);
		Collections.sort(arrayList);
		m.findMedianValue(arrayList);
	}

	// Assuming integers are sorted
	public void findMedianValue(ArrayList<Integer> arrayList) {
		int middle = 0;
		int s = arrayList.size();
		System.out.println("Size is " + arrayList.size());
		System.out.println(arrayList.get(middle)  + " " + arrayList.get(middle+1));
		if (s % 2 == 0) {
			middle = s/2;
			
			double median = (double) (arrayList.get(middle-1) + arrayList.get(middle))/2;
			System.out.print(median);
			System.out.println("Median value is " + median);
			
		} else {
			middle = (s / 2);
			System.out.println("Median value is " + arrayList.get(middle));
		}
	}
}

















