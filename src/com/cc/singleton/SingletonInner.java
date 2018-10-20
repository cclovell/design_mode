package com.cc.singleton;

/**
 * 双重线程检查模式
 *
 * 优点：延时加载，线程安全
 *
 * 缺点：写法复杂
 *
 *
 *
 */
public class SingletonInner {
    //使用volatile，让读取安全  如果不加volatile不一定是线程安全的，指令重排序
    private static volatile SingletonInner instance = null;

    //私有构造方法，防止被实例化
    private SingletonInner() {

    }

    //这种方式效率低下，因为每次调用都要加锁，释放锁
    public static synchronized SingletonInner getInstance2() {
        if (instance == null) {
            instance = new SingletonInner();
        }
        return instance;
    }

    //这种只有在instance为空的时候才会加锁，提高性能
    public static SingletonInner getInstance() {
        if (instance == null){
            synchronized (SingletonInner.class) {
                if (instance == null) {
                    /**
                     * 这一步不是原子操作，如果instance没有加volatile，则发生指令重排序的时候会导致别的线程取回的instance不可用。
                     * 加上volatile会防止指令重排序
                     *
                     *
                     */
                    instance = new SingletonInner();
                    /**
                     *  这一步在jvm中其实大概分为下面三步jvm指令
                     *  memory =allocate();       //1：分配对象的内存空间
                     *  ctorInstance(memory);     //2：初始化对象
                     *  instance =memory;         //3：设置instance指向刚分配的内存地址
                     *
                     *  因为操作2依赖于操作1所以不会重排序，但是操作3不依赖于操作2所以可能指令重排序成这样的执行顺序
                     *  memory =allocate();       //1：分配对象的内存空间
                     *  instance =memory;         //3：设置instance指向刚分配的内存地址
                     *  ctorInstance(memory);     //2：初始化对象
                     *
                     *  如果是按这种指令执行顺序如果jvm在执行到第二步的时候，这个时候外面有其他线程来获取这个实例但是此时instance已经有引用了不为null，
                     *  所以会返回一个instance，但是此时返回的instance还没有实例化，然后就会导致出错了
                     */
                }
            }
        }

        return instance;
    }
}
