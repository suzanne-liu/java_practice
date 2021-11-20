package come.testing.class3;

import java.util.Scanner;

/**情人节的死亡游戏：
 * 女生出四道题，男生答题；四道题总分大于30分算过关，否则就自个儿过情人节吧
 * 一共有五次机会
 * 如果得分40分，将得到一个礼物
 */

public class DangerGame {
    public static void main(String[] args) {
        //开场白
        //System.out.println("Game tips:按回车");
        System.out.println("女生：今天情人节，我们玩个游戏吧");
        System.out.println("男生：什么游戏？");
        System.out.println("女生：我出四道题，每题10分，若你得分大于30分算过关，否则你就自个儿过情人节吧！！！" +
                "一共有五次机会哦~ " +
                "如果得分40分，你将有一个惊喜哦");
        System.out.println("男生：我能说不吗？");
        System.out.println("女生：你说呢？？？？");
        System.out.println("男生：开始吧");

        int mode=40;
        int time=0;
        for (int i=1;(i<5)&&(time<6);i++) {
            System.out.println();
            switch (i) {
                case 1: {
                    // 第一题，颜色题
                    System.out.println("女生：我喜欢什么颜色？" +
                            "请输入：");
                    Scanner colour = new Scanner(System.in);
                    String yanse =colour.next();
                    switch (yanse) {
                        case "蓝色":
                            System.out.println("嘻嘻，答对啦");
                            break;
                        case "粉色":
                            mode += -5;
                            System.out.println("勉强吧，这题扣5分");
                            break;
                        default:
                            mode += -10;
                            System.out.println("啊，这你都不知道，这题扣10分！！！");
                            break;
                    }
                    break;
                }
                case 2: {

                    //第二题，明星题
                    System.out.println("女生：第二题：我喜欢哪个明星？给你三个选项：" +
                            "大张伟  撒贝宁  董卿，  " +
                            "请输入：");
                    Scanner Idol = new Scanner(System.in);
                    String mingxing = Idol.next();
                    switch (mingxing) {
                        case "撒贝宁":
                            System.out.println("嘻嘻，答对啦");
                            break;
                        default:
                            mode += -10;
                            System.out.println("啊，这你都不知道，这题扣10分！！！");
                            break;
                    }
                    break;
                }
                case 3: {
                    //第三题，旅游题
                    System.out.println("女生：第三题：下一次旅游，你猜我想去哪？给你三个选项：" +
                            "西安  武汉  新疆，   " +
                            "请输入：");
                    Scanner travel = new Scanner(System.in);
                    String lvyou = travel.next();
                    switch (lvyou) {
                        case "新疆":
                            System.out.println("嘻嘻，答对啦");
                            break;
                        default:
                            mode += -10;
                            System.out.println("啊，这你都不知道，这题扣10分！！！");
                            break;
                    }
                    break;
                }
                case 4: {

                    //第四题，歌曲题
                    System.out.println("女生：第四题：我最喜欢哪首歌？给你三个选项：" +
                            "小王日记  海底  骁，  " +
                            "请输入：");
                    Scanner Song = new Scanner(System.in);
                    String ge = Song.next();
                    switch (ge) {
                        case "小王日记":
                            System.out.println("嘻嘻，答对啦");
                            break;
                        default:
                            mode += -10;
                            System.out.println("啊，这你都不知道，这题扣10分！！！");
                            break;
                    }
                    break;
                }
            }
            System.out.println("女生：当前你的分数是  "+mode);
            if (mode<30) {
                time++;
                System.out.println("女生：你的得分已经低于30分了");
                if (time < 5) {
                    System.out.println("女生：重新来！！！");
                    i=0;
                    mode=40;
                }
                if (time == 5) {
                    System.out.println("女生：你只剩最后一次机会了，好好珍惜");
                    i=0;
                    mode=40;
                }
                if (time == 6) {
                    System.out.println("女生：你一点都不爱我！！！  你就一个人过情人节吧！！！");
                }
            }

        }
        if ((time<6)&&(mode>=30)){
            if (mode==40){
                System.out.println("女生：哥哥，满分耶。 这个新球鞋给你");
            }else {
                System.out.println("女生：很棒，过关了～ 但没有满分，我们去吃饭吧");
            }
        }

    }
}
