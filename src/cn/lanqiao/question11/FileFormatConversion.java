package cn.lanqiao.question11;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <p>文件格式转换</p>
 * <p>题目描述：详见 题目描述.txt</p>
 * <p>难度：中等</p>
 * <p>标签：模拟, 字符串, 2011, 国赛</p>
 * <p>时空限制：1s/256M</p>
 * <p><a href="https://www.lanqiao.cn/problems/296/learning/">题目链接地址</a></p>
 *
 * @author Pengcc
 * @version 1.0 - 2022/9/23
 */

public class FileFormatConversion {

    public static Map<String, String> positionMap;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        initPositionMap();
        StringBuilder line;
        String info, schoolName = "", schoolTell = "", schoolNum = "", position = "", score, group, stuTell, stuName;
        String[] split;
        int schoolNameLength = 0, stuNameLength = 0;
        File file = new File("in.txt");
        OutputStreamWriter out = null;
        try {
            out = new OutputStreamWriter(Files.newOutputStream(file.toPath()), "GB2312");
            while ((info = scan.nextLine()) != null) {
                split = info.split(":");
                System.err.println(Arrays.toString(split));
                if (Character.isAlphabetic(split[0].charAt(0))) {
                    schoolName = split[0];
                    schoolNameLength = getChineseCount(schoolName);
                    schoolTell = split[1];
                    schoolNum = split[2];
                    position = positionMap.containsKey(split[3]) ? positionMap.get(split[3]) : split[3];
                } else {
                    score = split[0];
                    group = split[1];
                    stuTell = split[2];
                    stuName = split[3];
                    stuNameLength = getChineseCount(stuName);
                    line = new StringBuilder().append(String.format("%1$-7s", schoolNum))
                            .append(String.format("%1$-" + (31 - schoolNameLength) + "s", schoolName))
                            .append(String.format("%1$-17s", schoolTell))
                            .append(String.format("%1$-9s", position))
                            .append(String.format("%1$-" + (13 - stuNameLength) + "s", stuName))
                            .append(String.format("%1$-11s", group))
                            .append(String.format("%1$-5s", score))
                            .append(String.format("%1$-17s", stuTell))
                            .append("\r\n");
                    System.err.println(line);
                    out.write(line.toString());
                    out.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scan.close();
    }

    public static void initPositionMap() {
        positionMap = new HashMap<>();
        positionMap.put("xijing", "西京");
        positionMap.put("lushan", "鲁山");
        positionMap.put("pingyang", "平阳");
        positionMap.put("danling", "丹凌");
        positionMap.put("xinyuan", "新元");
    }

    public static int getChineseCount(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if(ch >= 0x4e00 && ch <= 0x9fbb) {
                count ++;
            }
        }
        return count;
    }

}
