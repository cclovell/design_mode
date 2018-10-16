package com.cc.facemode.face;

import com.cc.facemode.chirldren.Cpu;
import com.cc.facemode.chirldren.Disk;
import com.cc.facemode.chirldren.Memory;

/**
 * 门面角色
 *
 * @author chenchao
 * @date 2018/10/16 上午9:02
 */
public class Computer {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        System.out.println("computer start begin ...");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("computer start end ...");
    }

    public void stop() {
        System.out.println("computer stop begin...");
        cpu.stop();
        disk.stop();
        memory.stop();
        System.out.println("computer stop end...");
    }
}
