class MainMethod {

    public static void main(String[] args) {

        int[] sortArr = {4, 2, 1, 5, 3};

        InsertionSort.sortBy(sortArr, true);

        for (int i : sortArr) {
            System.out.println(i);
        }
    }
}
