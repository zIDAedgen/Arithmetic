package practice;

public class Solution {
    public static void main(String[] args) {
        PeakElement peakElement = new PeakElement();
        int[] arr = {1,2,1,3,5,6,4};
        int result = peakElement.findPeak(arr);
        System.out.println(result);
    }
}
