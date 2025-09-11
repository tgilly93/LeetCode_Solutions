class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int namePointer = 0;
        int typedPointer = 0;

        while (typedPointer < typed.length()) {
            if (namePointer < name.length() &&
                name.charAt(namePointer) == typed.charAt(typedPointer)) {
                namePointer++;
                typedPointer++;
            } else if (typedPointer > 0 &&
                typed.charAt(typedPointer) == typed.charAt(typedPointer - 1)) {
                typedPointer++;
            } else {
                return false;
            }
        }
        return namePointer == name.length(); 
    }
}