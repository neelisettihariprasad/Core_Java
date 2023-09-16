package hari.javaprogramming;

public class SubarrayMedian {

	public static void main(String[] args) {
		int[] array = {5, 3, 2, 1, 4, 5, 4};
        int k = 1;
        int count = countSubarraysWithMedian(array, k);
        System.out.println(count);

	}
	public static int countSubarraysWithMedian(int[] array, int k) {
        int count = 0;
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int medianCount = 0;
            for (int j = i; j < n; j++) {
                medianCount += (array[j] <= k) ? 1 : -1;
                if (medianCount == 0) {
                    count++;
                }
            }
        }

        return count;
    }

}
