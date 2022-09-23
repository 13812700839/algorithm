package cn.lanqiao.question8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 卡片
 * 题目描述：小蓝有很多数字卡片，每张卡片上都是数字 0 到 9。 小蓝准备用这些卡片来拼一些数，他想从 1 开始拼出正整数，每拼一个， 就保存起来，卡片就不能用来拼其它数了。 小蓝想知道自己能从 1 拼到多少。 例如，当小蓝有 30 张卡片，其中 0 到 9 各 3 张，则小蓝可以拼出 1 到 10， 但是拼 11 时卡片 1 已经只有一张了，不够拼出 11。 现在小蓝手里有 0 到 9 的卡片各 2021 张，共 20210 张，请问小蓝可以从 1 拼到多少？
 * 难度：简单
 * 标签：普通填空, 省赛, 2021
 * 时空限制：1s/128M
 *
 * @author Pengcc
 * @version 1.0 - 2022/9/22
 */

public class Card {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int index, max = 1;
        boolean flag = true;
        int[] nums = new int[10];
        Arrays.fill(nums, 2021);
        for (int i = 1; flag; i++) {
            for (char ch : String.valueOf(i).toCharArray()) {
                index = Integer.parseInt(String.valueOf(ch));
                if (nums[index] <= 0) {
                    flag = false;
                    break;
                }
                nums[index] -= 1;
            }
            max = flag ? i : max;
        }
        System.out.println(max);
        scan.close();
    }

}
