/**
 * Given an array of integers nums, sort the array in ascending order and return it.
 */
class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i + 1;
            for(int j = i + 1; j < n; j++) {
                if(nums[j] < nums[smallest]) {
                    smallest = j;
                }
            }
            if(nums[i] > nums[smallest]) {
                int temp = nums[i];
                nums[i] = nums[smallest];
                nums[smallest] = temp;
            }
        }
        return nums;
    }
}