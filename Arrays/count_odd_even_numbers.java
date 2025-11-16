package Arrays;

public class count_odd_even_numbers {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++; // increment even count
            } else {
                oddCount++;  // increment odd count
            }
        }

        System.out.println("Number of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);
    }
    
}
