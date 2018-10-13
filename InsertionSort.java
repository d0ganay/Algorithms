public class InsertionSort {

    public static void sortBy(int[] sortedArray, boolean isAsc) {
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (isComparable(i, j, sortedArray, isAsc)) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
    }

    private static boolean isComparable(int firstIndex, int secondIndex, int sortedArray[], boolean isAsc) {
        if (isAsc && sortedArray[firstIndex] > sortedArray[secondIndex]) {
            return true;
        }

        return !isAsc && sortedArray[firstIndex] < sortedArray[secondIndex];
    }

}
