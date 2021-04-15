package edu.game;

import java.util.Scanner;

/**
 * @author wangyibo
 * @date 2021/4/14 22:16
 */
public class Computer {
    public String name;// 电脑名字
    public int points;//   胜利次数
    public String quan;// 出的拳


    public void giveName() {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean flag = true;// 循环判断条件
        do {
            System.out.println("请选择对方角色（1.刘邦 2.孙权 3.曹操）");
            num = scanner.nextInt();
            if ( num == 1 ) {
                name = "刘邦";
                flag = false;
            }else if ( num == 2 ) {
                name = "孙权";
                flag = false;
            }else if ( num == 3 ) {
                name = "曹操";
                flag = false;
            }else {
                System.out.println("输入的值不合法，请重新输入");
                flag = true;
            }
        }while ( flag );
    }


    public void chuquan() {
        int num = (int)(Math.random()*3)+1;
        if ( num == 1 ) {
            quan = "剪刀";
        }else if ( num == 2 ) {
            quan = "石头";
        }else if ( num == 3 ) {
            quan = "布";
        }
    }
}
