class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int total =0;
         for (int[] boxType : boxTypes) {
            int numberOfBoxes = boxType[0];
            int unitsPerBox = boxType[1];
            int boxesToTake = Math.min(truckSize, numberOfBoxes);
            total += unitsPerBox * boxesToTake;
            truckSize -= boxesToTake;
            if (truckSize <= 0) {
                break;
            }
         }
         return total;
    }
}