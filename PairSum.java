package Top100DSA;

import java.util.Arrays;

public class PairSum {
    
    private static boolean twoSum(int[] arr, int target)
    {
        int n = arr.length;
        int i = 0;
        Arrays.sort(arr);
        while(i < n-1){
            if(arr[i] + arr[n-1] == target)
                return true;
            else if(arr[i] + arr[n-1] > target)
                 n--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        // Test case 1: Pair exists
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        System.out.println(PairSum.twoSum(arr1, target1)); // Expected: true

        // Test case 2: Pair does not exist
        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 10;
        System.out.println(PairSum.twoSum(arr2, target2)); // Expected: false

        // Test case 3: Negative numbers
        int[] arr3 = {-1, 0, 1, 2};
        int target3 = 1;
        System.out.println(PairSum.twoSum(arr3, target3)); // Expected: true

        // Test case 4: Empty array
        int[] arr4 = {};
        int target4 = 5;
        System.out.println(PairSum.twoSum(arr4, target4)); // Expected: false

        // Test case 5: Single element array
        int[] arr5 = {5};
        int target5 = 10;
        System.out.println(PairSum.twoSum(arr5, target5)); // Expected: false

        // Test case 6: Multiple pairs possible
        int[] arr6 = {2, 4, 6, 8};
        int target6 = 10;
        System.out.println(PairSum.twoSum(arr6, target6)); // Expected: true
    }

}
