package edu.game;

import java.util.Scanner;

/**
 * @author wangyibo
 * @date 2021/4/14 22:16
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*********************");
        System.out.println("*****猜拳    开始*****");
        System.out.println("*********************");
        System.out.println("出拳规则（1.剪刀 2.石头 3.布）");
        System.out.println();
        Game game = new Game();
        game.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("要开始吗？（y/n）");
        String start = scanner.next();
        while ("y".equalsIgnoreCase(start)) {
            game.panduan();
            System.out.println("是否开始下一轮？（y/n）");
            start = scanner.next();
        }
        game.gameOver();


    }
}
