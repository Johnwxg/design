package com.ai.design.AbstractFactory;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 15:39
 * @Description: 抽象工厂接口
 */
public interface IFactory<T> {
    /**
     * 获取具体产品实例的方法
     * @return 返回创建的实例对象
     */
    T product(Object... objects);
}
