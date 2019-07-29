/**
 * Copyright (C), 2018-2019
 * FileName: SingletonForLazy
 * Author:   WXG
 * Date:     2019/7/26 16:14
 * Description: "懒汉"式单例模式
 */
package com.ai.design.Singleton;

/**
 * @Auther: wxg
 * @Date: 2019/7/26 16:14
 * @Description: "懒汉"式单例模式
 */
public class SingletonForLazy {
    // 1. 声明一个存放实例对象的变量
    private static SingletonForLazy instance;
    // 2. 构造方法私有化
    private SingletonForLazy(){}
    // 3. 提供获取当前类型实例对象的静态方法
    public static SingletonForLazy getInstance(){
        instance = instance==null?new SingletonForLazy():instance;
        return instance;
    }
}
