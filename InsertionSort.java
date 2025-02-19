public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 2, 4};

        System.out.println("Array before sorting: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Array after sorting: ");
        printArray(numbers);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
