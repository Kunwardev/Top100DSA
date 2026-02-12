package Top100DSA;

public class StockBuyAndSell {
    
    private static int maxProfit(int[] arr){
        int res = 0;
        int minSoFar = arr[0];
        for(int i=1;i<arr.length;i++){
            res = Math.max(res, arr[i] - minSoFar);
            minSoFar = Math.min(minSoFar, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1: Expected 5, Got " + maxProfit(test1));

        int[] test2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2: Expected 0, Got " + maxProfit(test2));

        int[] test3 = {1, 2, 3, 4, 5};
        System.out.println("Test 3: Expected 4, Got " + maxProfit(test3));

        int[] test4 = {2, 4, 1};
        System.out.println("Test 4: Expected 2, Got " + maxProfit(test4));

        int[] test5 = {3, 3, 3, 3};
        System.out.println("Test 5: Expected 0, Got " + maxProfit(test5));
    }

}
