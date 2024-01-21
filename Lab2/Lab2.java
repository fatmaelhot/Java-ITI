public class Lab2 {
    public static void main(String[] args) {
        int arrSize = 1000;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        int minValue = arr[0];
        int maxValue = arr[0];

        long startTime = System.nanoTime();
        

        for (int i = 1; i < arrSize; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        long endTime = System.nanoTime();

        long runningTime = endTime - startTime;
        double runningTimeSeconds = (double) runningTime / 1_000_000_000;

        System.out.println("MinValue is " + minValue);
        System.out.println("MaxValue is " + maxValue);
        System.out.println("Running time: " + runningTime + " nanoseconds");
        System.out.println("Running time: " + runningTimeSeconds + " seconds");
    }
}

