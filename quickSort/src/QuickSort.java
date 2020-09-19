import java.util.Arrays;
import java.util.Random;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 8, 1, 2, 9, 4, 7, 6};
        quick(arr,0,arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr, int left, int right) {
        //1 __ i, j exchange for the partition
        //2 __ pivot exchange to the middle place
        //3 __ recursion to do the same thing
        if (left >= right) {
            return;
        }
        int temp, i, j, pivot;

        pivot = arr[left];
        i = left;
        j = right;

        while (i < j) {
            while (arr[j] >= pivot && i < j) {
                j--;
            }

            while (arr[i] <= pivot && i < j) {
                i++;
            }

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        arr[left] = arr[j];
        arr[j] = pivot;

        quick(arr, left, j - 1);
        quick(arr, j + 1, right);




    }












    public static void quickSort(int[] arr,int low,int high) {
        int p,i,j,temp;

        if(low >= high) {
            return;
        }
        //p就是基准数,这里就是每个数组的第一个
        p = arr[low];
        i = low;
        j = high;
        while(i < j) {
            //右边当发现小于p的值时停止循环
            while(arr[j] >= p && i < j) {
                j--;
            }

            //这里一定是右边开始，上下这两个循环不能调换（下面有解析，可以先想想）

            //左边当发现大于p的值时停止循环
            while(arr[i] <= p && i < j) {
                i++;
            }

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        //exchange the pivot and arr[low/high]
        arr[low] = arr[j];
        System.out.println("arr : " + arr[low]);//这里的arr[i]一定是停小于p的，经过i、j交换后i处的值一定是小于p的(j先走)
        arr[j] = p;
        System.out.println("p : " + p);



        quickSort(arr,low,j-1);  //对左边快排
        quickSort(arr,j+1,high); //对右边快排

    }
}











    /**
     * 快速排序，使得整数数组 arr 有序
     */
    /*
    public static void main(String args[]) {
        //int a[] = {2, 1, 0, 8, 6, 4};
        int a[] = {3, 5, 8, 1, 2, 9, 4, 7, 6};
        quickSort(a);
        //System.out.println(Arrays.toString(a));


    }
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }


        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * 快速排序，使得整数数组 arr 的 [L, R] 部分有序
     */

    /*
    public static void quickSort(int[] arr, int L, int R) {
        if(L < R) {
            // 把数组中随机的一个元素与最后一个元素交换，这样以最后一个元素作为基准值实际上就是以数组中随机的一个元素作为基准值
            //swap(arr, new Random().nextInt(R - L + 1) + L, R);
            int[] p = partition(arr, L, R);
            System.out.println(Arrays.toString(p));
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    /**
     * 分区的过程，整数数组 arr 的[L, R]部分上，使得：
     *   大于 arr[R] 的元素位于[L, R]部分的右边，但这部分数据不一定有序
     *   小于 arr[R] 的元素位于[L, R]部分的左边，但这部分数据不一定有序
     *   等于 arr[R] 的元素位于[L, R]部分的中间
     * 返回等于部分的第一个元素的下标和最后一个下标组成的整数数组
     */
    /*
    public static int[] partition(int[] arr, int L, int R) {

        int basic = arr[R];
        int less = L - 1;
        int more = R + 1;
        while(L < more) {
            if(arr[L] < basic) {
                swap(arr, ++less, L++);
            } else if (arr[L] > basic) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }

        return new int[] { less + 1, more - 1 };

    }

    /*
     * 交换数组 arr 中下标为 i 和下标为 j 位置的元素
     */

    /*
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    */



