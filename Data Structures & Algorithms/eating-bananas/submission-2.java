class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        
        int[] maxRes = {max, 0};

        return search(piles, h, max, 1, maxRes);

    }

    public int search(int[] piles, int h, int top, int bot, int[] hold) {
        int k = (top + bot) / 2;
        int holder = 0;

        if (top < bot) {
            return hold[0];
        }

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] <= k) {
                holder++;
            } else {
                holder += Math.ceil((double)piles[i] / k);
            }
        }

        if (holder > h) {
            return search(piles, h, top, k + 1, hold);
        }

        if (holder <= h) {
            if (hold[1] <= holder) {
                int[] newHold = {k, holder};
                return search(piles, h, k - 1, bot, newHold);
            }
            return search(piles, h, k - 1, bot, hold);
        }

        return -1;


    }

}
