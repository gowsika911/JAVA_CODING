package Arrays;

public class largestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int largest = arr[0];  // assume first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  // update largest if current element is greater
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
