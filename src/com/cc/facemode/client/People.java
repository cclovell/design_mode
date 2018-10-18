package com.cc.facemode.client;

import com.cc.facemode.face.Computer;

/**
 * client客户角色
 *
 * @author chenchao
 * @date 2018/10/16 上午9:03
 */
public class People {
    public static void main(String args[]) {
        Computer computer = new Computer();
        computer.start();
        computer.stop();
    }
}
