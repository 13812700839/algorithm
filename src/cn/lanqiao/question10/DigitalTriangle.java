package cn.lanqiao.question10;

import java.util.Scanner;

/**
 * <p>数字三角形</p>
 * <p>题目描述：如图（图见文件img.png）给出了一个数字三角形。从三角形的顶部到底部有很多条不同的路径。对于每条路径，把路径上面的数加起来可以得到一个和，你的任务就是找到最大的和。</p>
 *          <p>路径上的每一步只能从一个数走到下一层和它最近的左边的那个数或者右边的那个数。此外，向左下走的次数与向右下走的次数相差不能超过 1。</p>
 * <img src="img.png" />
 * <p>难度：简单</p>
 * <p>标签：动态规划, 2020, 省赛</p>
 * <p>时空限制：1s/256M</p>
 * <p><a href="https://www.lanqiao.cn/problems/505/learning/">题目链接地址</a></p>
 *
 * @author Pengcc
 * @version 1.0 - 2022/9/23
 */

public class DigitalTriangle {

    public static int[][] triangle;
    public static int[] dp;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt(), lMid, rMid, mid, max;
        triangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                triangle[i][j] = scan.nextInt();
            }
        }

        dp = new int[n];
        if (n % 2 == 0) {
            lMid = n / 2 - 1;
            rMid = n / 2;
            dp[lMid] = triangle[n - 1][lMid];
            dp[rMid] = triangle[n - 1][rMid];
        } else {
            mid = n / 2;
            dp[mid] = triangle[n - 1][mid];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                max = Math.max(dp[j], dp[j + 1]);
                if (max != 0) {
                    dp[j] = triangle[i][j] + max;
                }
            }
        }
        System.out.println(dp[0]);
        scan.close();
    }
}
