public class QuickSort {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1, 9, 2, 4};

        System.out.println("Array before sorting: ");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Array after sorting: ");
        printArray(numbers);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low - 1); 

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
