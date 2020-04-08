package offers.Binaries;


// 面试题11. 旋转数组的最小数字
//[3,4,5,1,2]
public class Eleven {
    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int mid = (i + j) / 2;
            if (numbers[mid] > numbers[j]) {
                i = mid + 1;
            } else if (numbers[mid] < numbers[j]) {
                j = mid;
            } else {
                j = j - 1;
            }
        }
        return i;
    }
}
