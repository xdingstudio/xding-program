package DesignPatterns;

// 懒汉式单例类，在第一次调用的时候实例化自己
public class Single {
    private static Single single = null;
    // 限制产生多个对象
    private Single() {}
    // 通过该方法获得实例对象
    public static synchronized Single getSingleton() {
        if(single == null) {
            single = new Single();
        }
        return single;
    }
}

public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized(Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

public class Singleton {
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton() {

    }
    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}

// 饿汉式单例类，在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，
// 所以天生是线程安全的
public class Singleton {
    private Singleton() {}
    private static final Singleton single = new Singleton();
    // 静态工厂方法
    public static Singleton getInstance() {
        return single;
    }
}