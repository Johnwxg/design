/**
 * Copyright (C), 2018-2019
 * FileName: GameComputerFactory
 * Author:   WXG
 * Date:     2019/7/25 20:15
 * Description:
 */
package com.ai.design.AbstractFactory.impl;

import com.ai.design.AbstractFactory.IFactory;
import com.ai.design.AbstractFactory.IProduct;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 20:15
 * @Description:
 */
public class GameComputerFactory implements IFactory<IProduct> {

    public IProduct product(Object... objects) {
        return null;
    }

    /** 小米游戏本制造方法
     * @return 小米游戏本
     */
    public IProduct productXiaomi() {
        return new XiaomiGameComputer();
    }

    /**
     * Dell游戏本制造方法
     * @return Dell游戏本
     */
    public IProduct productDell() {
        return new DellGameComputer();
    }
}
