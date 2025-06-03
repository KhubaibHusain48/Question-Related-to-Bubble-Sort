public class Question1 {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        int swap = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Total Number of swaps are: " + swap);
        System.out.print("Sorted Array (Descending Order): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
