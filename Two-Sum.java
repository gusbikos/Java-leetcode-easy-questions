import java.util.HashMap;

// Brute Force
// Time complexity: O n2
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for ( int i = 0; i < nums.length; i++ ) {
            for ( int j = i + 1; j < nums.length; j++ ) {
                if ( nums[i] + nums[j] == target ) {
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }
}


class Solutionz {
    public int[] twoSumz(int[] numz, int targetz) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < numz.length; i++ ) {
            map.put(numz[i], i);
        }

        for ( int i = 0; i < numz.length; i++ ) {
            int difference = targetz - numz[i];
            if ( map.containsKey(difference) && map.get(difference) != i) {
                return new int[] {map.get(difference), i};
            }
        }
        return numz;
    }
}


