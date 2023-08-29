package com.testing.class10.AccessFather;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-17 22:13
 */
public class Father {
    private int age=24;
    private String name ="张三";
    String money="家里的钱";
    public  String voice="说话";

    protected   String caiLi="彩礼";

    private void changeName(){
        System.out.println("只有自己能改名字");

    }

    public Father(String father){
        System.out.println("I am your "+father);
    }



    protected  void giveCaiLi(){
        System.out.println("儿子结婚给"+caiLi);

    }
    void spendMoney(){
        System.out.println("同一个包里的都能花钱");
    }

    public  void speak(){
        System.out.println("所有人都能跟我说话");

    }
}