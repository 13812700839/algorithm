package cn.lanqiao.question1;

import java.util.Scanner;

/**
 * <p>A和B问题【OJ示例题目】</p>
 * <p>描述：输入两个正整数 A,B，请你计算 A+B，并输出</p>
 * <p>难度：简单</p>
 * <p>标签：新手教程</p>
 * <p>时空限制：1s/256M</p>
 * <p><a href="https://www.lanqiao.cn/problems/254/learning/">题目链接地址</a></p>
 *
 * @author Pengcc
 * @version 1.0 - 2022/09/20
 */

public class AandB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a + b);
        scan.close();
    }

}
