class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];

        for(int i = 0; i < nums.length - 1; i++) {
            int leftPointer = i;
            int rightPointer = i + 1;

            while(rightPointer < nums.length) {
                if(nums[leftPointer] + nums[rightPointer] == target) {
                    resultArr[0] = leftPointer;
                    resultArr[1] = rightPointer;
                    return resultArr;
                } else {
                    rightPointer++;
                }
            }
        }
        return resultArr;
    }
}