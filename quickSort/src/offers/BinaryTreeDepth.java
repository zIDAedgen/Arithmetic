package offers;


import practice.PeakElement;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeDepth {
    public int maxDepth(TreeNode root) {
        return 2;
    }
}

// DFS 543 diameter of bianry tree
//https://article.itxueyuan.com/98xlDA



//BinarySearch should be sorted before using!
class bianrySearch {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 5, 6, 8};
        //int ult = binarySearch(nums, 0, nums.length - 1, 3);
        int res = binary(nums, 3);
        System.out.println("result  : " + res);
    }

    public static int binary(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int rest = binarySearch(arr, left, right, target);
        return rest;
    }
    public static int binarySearch(int[] arr,int left,int right, int target) {



        //while loop version
        while (left < right) {
            //int mid = (right - left) / 2 + left;
            int mid = (right + left) / 2;
            System.out.println(mid);
            if (arr[mid] < target) {
                left = mid + 1;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            }

            if (mid == target) {
                break;
            }
        }
        if (target == arr[left]) {
            return left;
        }

        if (target == arr[right]) {
            return right;
        }
        return -1;

    }

    private static int recur(int[] arr, int left, int right, int target) {
        int mid = (right - left)/2 + left;


        if (arr[mid] == target) {
            return mid;
        }

        if (left >= right) {
            return -1;
        }

        if (arr[mid] > target) {
            return recur(arr, left, mid - 1, target);
        }

        if (arr[mid] < target) {
            return recur(arr, mid + 1, right, target);
        }
        return -1;
    }

}

