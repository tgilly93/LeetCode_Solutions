class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            int currentValue = nums[i];
            int pointerValue = i - 1;

            while (pointerValue >= 0 && nums[pointerValue] > currentValue) {
                nums[pointerValue + 1] = nums[pointerValue];
                pointerValue--;
            }
            nums[pointerValue + 1] = currentValue;
        }
        return nums;
    }
}