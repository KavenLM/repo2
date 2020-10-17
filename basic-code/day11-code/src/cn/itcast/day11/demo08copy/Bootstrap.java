package cn.itcast.day11.demo08copy;

import cn.itcast.day11.red.RedPacketFrame;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("萌萌发的红包");
        red.setOwnerName("王思聪");
       // red.setOpenWay(new NormalMode());
        red.setOpenWay(new RandomMode());
    }
}
