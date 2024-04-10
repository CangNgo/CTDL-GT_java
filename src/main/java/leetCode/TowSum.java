package leetCode;

import java.util.Hashtable;

/**
 * TowSum
 */
public class TowSum {

    public int[] twoSum(int[] nums, int target) {
        Hashtable hashtable = new Hashtable();
        for (int i = 0; i < nums.length; i++) {
            final int neededNum = target - i;
            final int index = nums[neededNum];
            if (index >= 0) {
                return new int[neededNum];
            }

        }
        return null;
    }
}