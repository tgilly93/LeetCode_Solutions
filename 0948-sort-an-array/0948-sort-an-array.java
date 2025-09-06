class Solution {
    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            int currentValue = nums[i];
            int pointer1 = i - 1;

            while (pointer1 >= 0 && nums[pointer1] > currentValue){
                nums[pointer1 + 1] = nums[pointer1];
                pointer1--;
            }
            nums[pointer1 + 1] = currentValue;
        }
        return nums;
    }
}