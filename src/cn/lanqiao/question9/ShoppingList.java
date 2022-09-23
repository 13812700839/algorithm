package cn.lanqiao.question9;

import java.util.*;

/**
 * 购物单
 * 题目描述：小明刚刚找到工作，老板人很好，只是老板夫人很爱购物。老板忙的时候经常让小明帮忙到商场代为购物。小明很厌烦，但又不好推辞。
 *          这不，大促销又来了！老板夫人开出了长长的购物单（详见 data.txt），都是有打折优惠的。
 *          小明也有个怪癖，不到万不得已，从不刷卡，直接现金搞定。
 *          现在小明很心烦，请你帮他计算一下，需要从取款机上取多少现金，才能搞定这次购物。
 *          取款机只能提供 100 元面额的纸币。小明想尽可能少取些现金，够用就行了。 你的任务是计算出，小明最少需要取多少现金。
 * 难度：简单
 * 标签：填空题, 2017, 省赛
 * 时空限制：1s/128M
 *
 * @author Pengcc
 * @version 1.0 - 2022/9/22
 */

public class ShoppingList {

    public static List<Map<String, Double>> shoppingList;
    public static Map<String, Double> shoppingItem;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        double sum = 0;
        initShoppingList();
        for (Map<String, Double> item : shoppingList) {
            sum += Math.floor(item.get("price") * item.get("discount") * 100) / 100.0;
        }
        System.out.println((int) Math.ceil(sum / 100) * 100);
        scan.close();
    }

    public static void initShoppingList() {
        shoppingList = new ArrayList<>();
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 180.90);
        shoppingItem.put("discount", 0.88);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 10.25);
        shoppingItem.put("discount", 0.65);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 56.14);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 104.65);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 100.30);
        shoppingItem.put("discount", 0.88);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 297.15);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 26.75);
        shoppingItem.put("discount", 0.65);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 130.62);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 240.28);
        shoppingItem.put("discount", 0.58);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 270.62);
        shoppingItem.put("discount", 0.8);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 115.87);
        shoppingItem.put("discount", 0.88);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 247.34);
        shoppingItem.put("discount", 0.95);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 73.21);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 101.00);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 79.54);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 278.44);
        shoppingItem.put("discount", 0.7);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 199.26);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 12.97);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 166.30);
        shoppingItem.put("discount", 0.78);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 125.50);
        shoppingItem.put("discount", 0.58);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 84.98);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 113.35);
        shoppingItem.put("discount", 0.68);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 166.57);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 42.56);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 81.90);
        shoppingItem.put("discount", 0.95);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 131.78);
        shoppingItem.put("discount", 0.8);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 255.89);
        shoppingItem.put("discount", 0.78);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 109.17);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 146.69);
        shoppingItem.put("discount", 0.68);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 139.33);
        shoppingItem.put("discount", 0.65);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 141.16);
        shoppingItem.put("discount", 0.78);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 154.74);
        shoppingItem.put("discount", 0.8);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 59.42);
        shoppingItem.put("discount", 0.8);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 85.44);
        shoppingItem.put("discount", 0.68);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 293.70);
        shoppingItem.put("discount", 0.88);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 261.79);
        shoppingItem.put("discount", 0.65);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 11.30);
        shoppingItem.put("discount", 0.88);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 268.27);
        shoppingItem.put("discount", 0.58);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 128.29);
        shoppingItem.put("discount", 0.88);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 251.03);
        shoppingItem.put("discount", 0.8);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 208.39);
        shoppingItem.put("discount", 0.75);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 128.88);
        shoppingItem.put("discount", 0.75);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 62.06);
        shoppingItem.put("discount", 0.9);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 225.87);
        shoppingItem.put("discount", 0.75);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 12.89);
        shoppingItem.put("discount", 0.75);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 34.28);
        shoppingItem.put("discount", 0.75);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 62.16);
        shoppingItem.put("discount", 0.58);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 129.12);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 218.37);
        shoppingItem.put("discount", 0.5);
        shoppingList.add(shoppingItem);
        shoppingItem = new HashMap<>();
        shoppingItem.put("price", 289.69);
        shoppingItem.put("discount", 0.8);
        shoppingList.add(shoppingItem);
    }

}