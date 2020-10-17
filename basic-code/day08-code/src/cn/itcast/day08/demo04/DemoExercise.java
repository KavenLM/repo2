package cn.itcast.day08.demo04;

import java.util.ArrayList;

public class DemoExercise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.7;
        int count = 0;
        for(int i = (int)min; i < max ; i ++){
            if(Math.abs(i)>=6 || Math.abs(i)<=2){
                count ++;
                System.out.println(i);
            }
        }
        
        System.out.println("绝对值大于6和小于2的整数有："+count+"个");
    }
}
