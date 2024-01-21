import java.util.Arrays;
public class Lab2 {
   static int binarySearch(int x, int a[], int size) {
        int start = 0;
        int end = size - 1;
        int midIndex;

        while (start <= end) {
            midIndex = (start + end) / 2;

            if (a[midIndex] == x)
                return midIndex;

            if (x < a[midIndex])
                end = midIndex - 1;
            else
                start = midIndex + 1;
        }

        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int arrSize = 1000;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
	

        // Sorting the array before performing binary search
        Arrays.sort(arr);
	
        long startTime = System.nanoTime();

        int minValueIndex = binarySearch(arr[0], arr, arrSize);
        int maxValueIndex = binarySearch(arr[arrSize - 1], arr, arrSize);

        long endTime = System.nanoTime();

        long runningTime = endTime - startTime;
	double runningTimeSeconds = (double) runningTime / 1_000_000_000;
        System.out.println("MinValue is " + arr[minValueIndex]);
        System.out.println("MaxValue is " + arr[maxValueIndex]);
        System.out.println("Running time: " + runningTime + " nanoseconds");
        System.out.println("Running time: " + runningTimeSeconds + " seconds");
    }
}

