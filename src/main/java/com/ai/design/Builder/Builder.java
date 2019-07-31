package com.ai.design.Builder;

/**
 * @Auther: wxg
 * @Date: 2019/7/29 20:40
 * @Description: 抽象建造者
 */
public interface Builder<T> {

    /**
     * 第一个构造步骤
     */
    void builderPart1();

    /**
     * 第二个构造步骤
     */
    void builderPart2();
    /**
     * 获取最终产品
     * @return 最终产品
     */
    T retrieveResult();
}
