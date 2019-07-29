/**
 * Copyright (C), 2018-2019
 * FileName: ComputerProduct
 * Author:   WXG
 * Date:     2019/7/25 15:52
 * Description: 产品具体实现
 */
package com.ai.design.FactoryMethod.impl;

import com.ai.design.FactoryMethod.IProduct;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 15:52
 * @Description:
 */
public class ComputerProduct implements IProduct {

    public String getInformation() {
        return "电脑，官方称呼计算机，主要用于进行数据运算的一台机器。";
    }
}
