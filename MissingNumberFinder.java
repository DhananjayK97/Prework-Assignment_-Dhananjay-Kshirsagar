import java.util.Scanner;

class MissingNumberFinder {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		if (size > 0) {
		    int[] arr = new int[size-1];
			for(int i=0; i<size-1; i++){
				arr[i] = in.nextInt();
			}
		System.out.println("Missing Number is " + missingNumberFinder(arr, size));
		}
	}
	static int missingNumberFinder(int array[], int n) {
		// write your code here
		int SumOfArrayNumbers = 0;
		int SumOfArrayRanges = 0;

        for (int i=0; i<array.length; i++){
        	SumOfArrayNumbers += array[i];
        }

        for(int i=1; i<=n; i++){
        	SumOfArrayRanges += i;
        }
        return (SumOfArrayRanges - SumOfArrayNumbers);
	}
}