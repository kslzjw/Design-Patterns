/**
//饿汉式
public class Singleton{

    private static final Singleton singleton=new Singleton();
    private Singleton(){}
    public static Singleton getSingleton(){
        return singleton;
    }


}

//懒汉式
public class Singleton{

    private static final Singleton singleton;
    private Singleton(){}
    public static synchronized Singleton getSingleton(){
        if(singleton==null){
            synchronized(singleton){
                if(singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

}

//静态内部类
public class IdGenerator{

    private IdGenerator(){}

    private static class SingletonHolder{
        private static final IdGenerator  instance=new Singleton();
    }

    public static IdGenerator getInstance(){
        return SingletonHolder.instance;
    }
}
 */

//枚举
public enum IdGenerator{
    INSTANCE;
}




