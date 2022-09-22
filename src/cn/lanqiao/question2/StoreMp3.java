package cn.lanqiao.question2;

import java.util.Scanner;

/**
 * MP3存储【蓝桥杯填空题示例题目】
 * 题目描述：如果一个 MP3 文件占用磁盘的大小是 4MB，小蓝的硬盘还剩下 100GB 的空间，请问他还可以放多少个这样的 MP3 文件？
 * 难度：新手教程
 * 时空限制：1s/128M
 * @author Pengcc
 * @version 1.0 - 2022/09/20
 */

public class StoreMp3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        System.out.println(100 * 1024 / 4);
        scan.close();
    }

}
