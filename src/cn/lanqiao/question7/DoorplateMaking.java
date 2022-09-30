package cn.lanqiao.question7;

import java.util.Scanner;

/**
 * <p>门牌制作</p>
 * <p>题目描述：小蓝要为一条街的住户制作门牌号。</p>
 *          <p>这条街一共有 2020 位住户，门牌号从 1 到 2020 编号。</p>
 *          <p>小蓝制作门牌的方法是先制作 0 到 9 这几个数字字符，最后根据需要将字符粘贴到门牌上，例如门牌 1017 需要依次粘贴字符 1、0、1、7，即需要 1 个字符 0，2 个字符 1，1 个字符 7。</p>
 *          <p>请问要制作所有的 1 到 2020 号门牌，总共需要多少个字符 2？</p>
 * <p>难度：简单</p>
 * <p>标签：填空题, 2020, 省赛</p>
 * <p>时空限制：1s/128M</p>
 * <p><a href="https://www.lanqiao.cn/problems/592/learning/">题目链接地址</a></p>
 *
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
