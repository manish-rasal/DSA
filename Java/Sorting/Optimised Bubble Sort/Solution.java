/**
 * Given an array of integers nums, sort the array in ascending order and return it.
 */
class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            boolean isSorted = true;
            for(int j = 0; j < n - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        return nums;
    }
}