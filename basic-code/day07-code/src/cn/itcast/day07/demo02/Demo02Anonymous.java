package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        int num = new Scanner(System.in).nextInt();

//        methodParam(new Scanner(System.in));

    Scanner sc = methodReturn();
    int num = sc.nextInt();
        System.out.println("输入的数字为："+num);

    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }


//    public static void methodParam(Scanner sc){
//        int num = sc.nextInt();
//        System.out.println("输入的数字是："+num);
//    }

        /*// 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        // 使用匿名对象来进行传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
*/
}
