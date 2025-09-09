class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        for(int i = 1; i < deck.length; i++){
            int currentValue = deck[i];
            int pointer = i - 1;
            boolean partition = true;

            while (pointer >= 0 && deck[pointer] > currentValue) {
                deck[pointer + 1] = deck[pointer];
                pointer--;
            }
            deck[pointer + 1] = currentValue;
        }

        int count = 1;
        List<Integer> counts = new ArrayList<>();
        for(int i = 1; i < deck.length; i++) {
            if(deck[i] == deck[i - 1]){
                count++;
            } else {
                counts.add(count);
                count = 1;
            }
        }
        counts.add(count);

        int currentGCD = counts.get(0);
        for(int c : counts) {
            currentGCD = gcd(currentGCD, c);
        }
        return currentGCD >= 2;
    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}