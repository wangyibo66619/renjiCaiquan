package edu.game;

/**
 * @author wangyibo
 * @date 2021/4/14 22:16
 */
public class Game {
    Computer c = new Computer();
    User u = new User();

    public void start() {
        c.giveName();
        u.giveName();
        System.out.println(u.name + " VS " + c.name);
    }
    // 判断输赢
    public void panduan() {
        c.chuquan();
        u.chuquan();
        System.out.println("你出拳：" + u.quan);
        System.out.println(c.name + "出拳：" + c.quan);

        if (    u.quan.equals("剪刀") && c.quan.equals("布") ||
                u.quan.equals("石头") && c.quan.equals("剪刀")||
                u.quan.equals("布") && c.quan.equals("石头"))   {

            System.out.println("恭喜你获胜了");
            u.count = u.count+1;// 场次加1
            u.points = u.points +1;// 得分加1
        }else if ( u.quan.equals("剪刀") && c.quan.equals("石头") ||
                   u.quan.equals("石头") && c.quan.equals("布")||
                   u.quan.equals("布") && c.quan.equals("剪刀") ) {
            System.out.println("行不行啊你？卧槽 你的");
            u.count = u.count + 1;// 场次加1
            c.points = c.points + 1;// 电脑得分加1
        }else if ( u.quan.equals(c.quan) ) {
            System.out.println("平局");
            u.count = u.count + 1;// 场次加1
        }
    }
    // 打印输出结果
    public void gameOver() {
        System.out.println(u.name + " VS " + c.name);
        System.out.println("对战场次：" + u.count);
        System.out.println();
        System.out.println("姓名 \t 得分");
        System.out.println(u.name + " \t " + u.points);
        System.out.println(c.name + " \t " + c.points);
        System.out.println("GAME OVER!");
    }


}
