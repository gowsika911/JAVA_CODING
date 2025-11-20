package Digitmanipulation;

public class check_digits_in_asscending {
    public static void main(String[] args) {
        
    int n = 1234;  // you can also take input using Scanner
        boolean ascending = true;
        int prevDigit = 10;  // greater than any single digit (0–9)

        while (n > 0) {
            int currentDigit = n % 10;  // extract last digit
            if (currentDigit > prevDigit) {
                ascending = false;
                break;
            }
            prevDigit = currentDigit;
            n = n / 10;
        }

        if (ascending) {
            System.out.println("Digits are in ascending order");
        } else {
            System.out.println("Digits are not in ascending order");
        }
}
}

