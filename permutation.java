import java.util.*;

class UniquePermutations {
    
    // Function to generate unique permutations
    public static Set<String> generateUniquePermutations(String numberStr) {
        Set<String> uniquePerms = new HashSet<>();
        // Convert numberStr to char array
        char[] digits = numberStr.toCharArray();
        // Generate permutations using backtracking
        generatePermutations(digits, 0, uniquePerms);
        return uniquePerms;
    }
    
    // Helper function to generate permutations using backtracking
    private static void generatePermutations(char[] digits, int index, Set<String> uniquePerms) {
        if (index == digits.length - 1) {
            // Convert char array to string
            String perm = new String(digits);
            uniquePerms.add(perm);
        } else {
            for (int i = index; i < digits.length; i++) {
                // Swap characters
                swap(digits, index, i);
                // Recursively generate permutations
                generatePermutations(digits, index + 1, uniquePerms);
                // Backtrack (swap back)
                swap(digits, index, i);
            }
        }
    }
    
    // Helper function to swap characters in char array
    private static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
    
    // Function to print unique permutations
    public static void printUniquePermutations(int number) {
        // Convert number to string and handle negative sign
        String numberStr = Integer.toString(number);
        if (numberStr.charAt(0) == '-') {
            numberStr = numberStr.substring(1);
        }
        
        // Generate unique permutations
        Set<String> uniquePerms = generateUniquePermutations(numberStr);
        
        // Print permutations
        System.out.println("Permutations are:");
        for (String perm : uniquePerms) {
            if (number < 0) {
                System.out.println("-" + perm);
            } else {
                System.out.println(perm);
            }
        }
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {0, 111, 505, -143, -598};
        
        for (int num : testCases) {
            System.out.println("Given Number: " + num);
            printUniquePermutations(num);
            System.out.println();
        }
    }
}