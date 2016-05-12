package com.algorithms.number;

/**
 * Created by sunny on 16/3/24.
 */

/**
 * 编程之美 2.17 将一个含有N个元素的数组循环右移K�?要求时间复杂度O(N)只允许使用两个临时变�? */
public class CycleRightShift {

    /**
     * Time:2n 右移K本质上是将数组的两部分交换位�?     * abcd1234 K = 4 :1)逆排序abcd, 2)逆排�?234-->dcba4321 3)逆排序整个数�?234abcd
     */
    public static void rightShift(char[] a, int k){
        int n = a.length;
        k = n - k % n;
        reverse(a, 0, k-1);
        reverse(a, k, n-1);
        reverse(a, 0, n-1);
    }

    private static void reverse(char[] a, int beg, int end){
        char tmp;
        while (beg < end) {
            tmp = a[beg];
            a[beg] = a[end];
            a[end] = tmp;

            beg++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] a = new char[]{'a', 'b', 'c', 'd', '1', '2', '3', '4'};
        rightShift(a, 2);
        for (char c : a){
            System.out.print(c + " ");
        }
    }
}
