package cn.lanqiao.question4;

import java.util.Scanner;

/**
 * 成绩统计
 * 题目描述：小蓝给学生们组织了一场考试，卷面总分为 100 分，每个学生的得分都是一个 0 到 100 的整数。
 *          如果得分至少是 60 分，则称为及格。如果得分至少为 85 分，则称为优秀。
 *          请计算及格率和优秀率，用百分数表示，百分号前的部分四舍五入保留整数。
 * 难度：简单
 * 标签：数学, 暴力, 2020, 省赛
 * 时空限制：1s/256M
 *
 * @author Pengcc
 * @version 1.0 - 2022/09/20
 */

public class ScoreStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int score;
        int qualifiedCount = 0;
        int excellentCount = 0;
        for (int i = 0; i < n; i ++) {
            score = scan.nextInt();
            if (score >= 85) {
                excellentCount ++;
            }
            if (score >= 60) {
                qualifiedCount ++;
            }
        }
        System.out.println(Math.round((double) qualifiedCount / n * 100) + "%");
        System.out.println(Math.round((double) excellentCount / n * 100) + "%");
        scan.close();
    }

}
