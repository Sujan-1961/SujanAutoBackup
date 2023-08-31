package dailycodetask;

import java.util.HashSet;

public class HappyNumbers {
	
	public static boolean isHappy(int n) {
        // Keep track of visited numbers to detect cycles
        HashSet<Integer> visited = new HashSet<Integer>();

        // "!=" is the inequality operator, and it returns true if the two operands are not equal and false if they are equal.
        //So, "n != 1" evaluates to true if 'n' is any value other than 1,
        //and it evaluates to false if 'n' is equal to 1.
        //The expression "n != 1" simply checks whether the value of 'n' is not equal to 1.
        while (n != 1) {
            if (visited.contains(n)) {
                // If the number is already visited, it means we are stuck in a cycle
                return false;
            }
            
            // Add the current number to the visited set
            visited.add(n);

            // Calculate the sum of the squares of the digits
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum = sum+(digit * digit);
                n = n/10;
            }

            // Update the number to the new sum
            n = sum;
        }

        // If we reached 1, the number is happy
        return true;
    }

    public static void main(String[] args) {
        int n =29; // Change this number to test other values

        if (isHappy(n)) {
            System.out.println(n+ " is a happy number.");
        } else {
            System.out.println(n+ " is not a happy number.");
        }
    }
}
