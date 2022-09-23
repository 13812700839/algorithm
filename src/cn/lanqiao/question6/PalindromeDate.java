package cn.lanqiao.question6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * <p>回文日期</p>
 * <p>题目描述：2020 年春节期间，有一个特殊的日期引起了大家的注意：2020 年 2 月 2 日。因为如果将这个日期按 “yyyymmdd” 的格式写成一个 8 位数是 20200202，恰好是一个回文数。我们称这样的日期是回文日期。</p>
 *          <p>有人表示 20200202 是 “千年一遇” 的特殊日子。对此小明很不认同，因为不到 2 年之后就是下一个回文日期：20211202 即 2021 年 12 月 2 日。</p>
 *          <p>也有人表示 20200202 并不仅仅是一个回文日期，还是一个 ABABBABA 型的回文日期。对此小明也不认同，因为大约 100 年后就能遇到下一个 ABABBABA 型的回文日期：21211212 即 2121 年 12 月 12 日。算不上 “千年一遇”，顶多算 “千年两遇”。</p>
 *          <p>给定一个 8 位数的日期，请你计算该日期之后下一个回文日期和下一个 ABABBABA 型的回文日期各是哪一天。</p>
 * <p>难度：中等</p>
 * <p>标签：模拟, 构造, 2020, 省赛</p>
 * <p>时空限制：1s/256M</p>
 * <p><a href="https://www.lanqiao.cn/problems/498/learning/">题目链接地址</a></p>
 *
 * @author Pengcc
 * @version 1.0 - 2022/09/21
 */

public class PalindromeDate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String inDate = scan.next();
        String year = inDate.substring(0, 4);
        StringBuilder allYear, leftYear, rightYear;
        int count = 0, maxYears = 10000;
        if (inDate.length() == 8) {
            allYear = new StringBuilder(year);
            leftYear = new StringBuilder(allYear.substring(0, 2));
            rightYear = new StringBuilder(allYear.substring(2));
            if (leftYear.toString().equals(rightYear.toString())) {
                String month = inDate.substring(4, 6);
                String date = inDate.substring(6);
                if (leftYear.reverse().toString().equals(date) && rightYear.reverse().toString().equals(month)) {
                    System.out.println(inDate);
                    count ++;
                }
            }
            for (int i = Integer.parseInt(year); count < 1 && i < maxYears; i ++) {
                allYear = new StringBuilder(String.valueOf(i));
                leftYear = new StringBuilder(allYear.substring(0, 2));
                rightYear = new StringBuilder(allYear.substring(2));
                count = isPalindrome(allYear.toString(), leftYear.reverse().toString(), rightYear.reverse().toString()) ? count + 1 : count;
            }
            for (int i = Integer.parseInt(year); count < 2 && i < maxYears; i ++) {
                allYear = new StringBuilder(String.valueOf(i));
                leftYear = new StringBuilder(allYear.substring(0, 2));
                rightYear = new StringBuilder(allYear.substring(2));
                if (!leftYear.substring(0, 1).equals(leftYear.substring(1)) &&
                        leftYear.toString().equals(rightYear.toString())) {
                    count = isPalindrome(allYear.toString(), leftYear.reverse().toString(), rightYear.reverse().toString()) ? count + 1 : count;
                }
            }
        }
        scan.close();
    }

    public static boolean isPalindrome(String allYear, String date, String month) {
        List<Integer> bigMonth = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        int left, right, year, maxDays;
        year = Integer.parseInt(allYear);
        left = Integer.parseInt(date);
        right = Integer.parseInt(month);
        if (right > 0 && right < 13) {
            if (right == 2) {
                maxDays = ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) ? 29 : 28;
            } else {
                maxDays = bigMonth.contains(right) ? 31 : 30;
            }
            if (left > 0 && left < maxDays + 1) {
                System.out.println(allYear + month + date);
                return true;
            }
        }
        return false;
    }

}
