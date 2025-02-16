public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 2, 4};

        System.out.println("Array before sorting: ");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("Array after sorting: ");
        printArray(numbers);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
