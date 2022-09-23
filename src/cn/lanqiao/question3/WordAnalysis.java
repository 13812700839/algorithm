package cn.lanqiao.question3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * <p>单词分析</p>
 * <p>题目描述：小蓝正在学习一门神奇的语言，这门语言中的单词都是由小写英文字母组成，有些单词很长，远远超过正常英文单词的长度。小蓝学了很长时间也记不住一些单词，他准备不再完全记忆这些单词，而是根据单词中哪个字母出现得最多来分辨单词。</p>
 *          <p>现在，请你帮助小蓝，给了一个单词后，帮助他找到出现最多的字母和这 个字母出现的次数。</p>
 * <p>难度：简单</p>
 * <p>标签：字符串, 暴力, 2020, 省赛</p>
 * <p>时空限制：1s/256M</p>
 * <p><a href="https://www.lanqiao.cn/problems/504/learning/">题目链接地址</a></p>
 *
 * @author Pengcc
 * @version 1.0 - 2022/09/20
 */

public class WordAnalysis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String str = scan.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }
        char maxCh = 'z';
        int max = 0;
        boolean flag;
        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            flag = entry.getValue() > max || (entry.getValue() == max && entry.getKey() <= maxCh);
            if (flag) {
                max = entry.getValue();
                maxCh = entry.getKey();
            }
        }
        System.out.println(maxCh);
        System.out.println(max);
        scan.close();
    }

}
