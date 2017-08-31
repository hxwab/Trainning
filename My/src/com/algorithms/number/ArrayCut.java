package com.algorithms.number;

/**
 * Created by sunny on 16/3/24.
 */

/**
 * 编程之美 2.18
 * 在一个没有排序�?元素个数�?n的正整数数组，如何能把这个数组分割成元素为n的两个数组，使两个子数组和最接近
 * DP
 * opt(i,k,w)表示前i个元素中的任意k个元素和为w是否存在
 * opt(i,k,w)   = opt(i-1, k-1, w-a[i]) || opt(i-1, k, w)  if w > a[i]
 *              = opt[i-1][k][w]                           if w <= a[i]
 */
public class ArrayCut {

    //version 1
    public static int cut(final int[] a) {
        int n = a.length / 2;
        int sum = 0;
        for (int i = 0; i < 2*n; i++) {
            sum += a[i];
        }
        boolean[][][] opt = new boolean[2*n+1][n+1][sum / 2 + 1];
        for (int i = 0; i < opt.length; i++) {
            opt[i][0][0] = true;
        }

        for (int i = 1; i <= 2*n; i++) {
            for (int k = 1; k <= i && k <= n; k++) {
                for (int w = 1; w <= sum/2; w++) {
                    if (w >= a[i-1]){
                        opt[i][k][w] = opt[i-1][k-1][w-a[i-1]] || opt[i-1][k][w];
                    }else {
                        opt[i][k][w] = opt[i-1][k][w];
                    }
                }
            }
        }

        //寻找�?��近sum/2的和
        int w;
        for (w = sum/2; w >= 0; w--){
            if (opt[2*n][n][w])
                break;
        }
        return w;
    }

    /**
     * opt[i][k][w]只与opt[i-1][][]有关,因此可以省去第一维度
     */
    public static int cut2(final int[] a) {
        int n = a.length / 2;
        int sum = 0;
        for (int i = 0; i < 2 * n; i++) {
            sum += a[i];
        }
        boolean[][] opt = new boolean[n + 1][sum / 2 + 1];
        opt[0][0] = true;

        for (int i = 1; i <= 2 * n; i++) {
            for (int k = Math.min(i,n); k >= 1; k--) {
                for (int w = 1; w <= sum / 2; w++) {
                    if (w >= a[i-1] && opt[k - 1][w - a[i-1]]) {
                        opt[k][w] = true;
                    }
                }
            }
        }
        //寻找�?��近sum/2的和
        int w;
        for (w = sum / 2; w >= 0; w--) {
            if (opt[n][w])
                break;
        }
        return w;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,2,9,4,30,1};
        System.out.println(cut(a));
        System.out.println(cut2(a));
    }
}
