/**
 * Copyright (C), 2018-2019
 * FileName: SingletonForHungry
 * Author:   WXG
 * Date:     2019/7/26 16:04
 * Description: "饿汉"式单例模式
 */
package com.ai.design.Singleton;

/**
 * @Auther: wxg
 * @Date: 2019/7/26 16:04
 * @Description: "饿汉"式单例模式
 */
public class SingletonForHungry {
    //1. 内部属性中直接实例化当前对象
    private static SingletonForHungry instance = new SingletonForHungry();
    // 2. 构造方法私有化，屏蔽外界实例化途径
    private SingletonForHungry(){}
    // 3. 提供获取实例对象的静态方法
    public static SingletonForHungry getInstance(){
        return instance;
    }

}
