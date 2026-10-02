class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int count = special[0] - bottom;
        int max = count;
        for(int i = 1; i < special.length; i++) {
            count = special[i] - special[i - 1] - 1;
            max = Math.max(count, max);
        }
        count = top - special[special.length - 1];
        max = Math.max(count, max);
        return max;
    }
}