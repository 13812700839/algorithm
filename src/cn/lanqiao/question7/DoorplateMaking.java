package cn.lanqiao.question7;

import java.util.Scanner;

/**
 * 门牌制作
 * 题目描述：小蓝要为一条街的住户制作门牌号。
 *          这条街一共有 20202020 位住户，门牌号从 11 到 20202020 编号。
 *          小蓝制作门牌的方法是先制作 00 到 99 这几个数字字符，最后根据需要将字符粘贴到门牌上，例如门牌 1017 需要依次粘贴字符 1、0、1、71、0、1、7，即需要 11 个字符 00，22 个字符 11，11 个字符 77。
 *          请问要制作所有的 11 到 20202020 号门牌，总共需要多少个字符 22？
 * 难度：简单
 * 标签：填空题, 2020, 省赛
 * 时空限制：1s/128M
 * @author Pengcc
 * @version 1.0 - 2022/09/21
 */

public class DoorplateMaking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int count = 0;
        for (int i = 1; i < 2021; i ++) {
            for (char ch : String.valueOf(i).toCharArray()) {
                count = ch == '2' ? count + 1 : count;
            }
        }
        System.out.println(count);
        scan.close();
    }

}
