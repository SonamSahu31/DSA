import java.util.HashSet;

public class longestConsecutive {

    public static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check every number
        for (int num : set) {

            // Sequence ka starting point
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Next consecutive numbers find karo
                while (set.contains(currentNum + 1)) {

                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int answer = longestConsecutive(arr);

        System.out.println("Longest Consecutive Sequence = " + answer);
    }
}