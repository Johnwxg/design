/**
 * Copyright (C), 2018-2019
 * FileName: Application
 * Author:   WXG
 * Date:     2019/7/26 16:08
 * Description:
 */
package com.ai.design.Singleton;

/**
 * @Auther: wxg
 * @Date: 2019/7/26 16:08
 * @Description:
 */
public class Application {

    public static void main(String[] args) {
        runForHungry();

        runForLazy();
    }

    /**
     *  饿汉式单例
     */
    public static void runForHungry(){
        SingletonForHungry hungry = SingletonForHungry.getInstance();
        System.out.println(hungry);

        SingletonForHungry hungry1 = SingletonForHungry.getInstance();
        System.out.println(hungry1);

//        SingletonForHungry hungry2 = new SingletonForHungry(); //Error 私有构造对象禁止创建
//        System.out.println(hungry2);

    }

    /**
     *  懒汉式单例
     */
    public static void runForLazy(){
        SingletonForLazy lazy = SingletonForLazy.getInstance();
        System.out.println(lazy);

        SingletonForLazy lazy1 = SingletonForLazy.getInstance();
        System.out.println(lazy1);

//        SingletonForLazy lazy2 = new SingletonForLazy();
//        System.out.println(lazy2);
    }
}
