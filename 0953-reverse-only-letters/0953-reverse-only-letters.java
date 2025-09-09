class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while(leftPointer < rightPointer) {
            if(!Character.isLetter(arr[leftPointer])) {
                leftPointer++;
            } else if (!Character.isLetter(arr[rightPointer])) {
                rightPointer--;
            } else {
                char temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }
        return new String(arr);
    }
}