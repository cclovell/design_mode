package com.cc.model;

/**
 * 定义好了调制饮料的模板，也就是步骤
 *
 * @author chenchao
 * @date 2018/10/22 下午5:54
 */
public abstract class Drink {
    //final方法防止子类修改
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (hook()){
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("烧开水");
    }

    public abstract void brew(); //冲泡
    public abstract void pourInCup(); //将开水倒入杯子
    public abstract void addCondiments(); //加调料

    //加入一个钩子方法由子类去控制某一个步骤是否需要
    public boolean hook(){
        return true;
    }
}
