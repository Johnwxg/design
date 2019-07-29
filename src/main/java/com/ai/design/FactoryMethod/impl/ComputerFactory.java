/**
 * Copyright (C), 2018-2019
 * FileName: ComputerFactory
 * Author:   WXG
 * Date:     2019/7/25 15:57
 * Description: 工厂具体实现
 */
package com.ai.design.FactoryMethod.impl;

import com.ai.design.*;
import com.ai.design.FactoryMethod.IFactory;
import com.ai.design.FactoryMethod.IProduct;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 15:57
 * @Description:
 */
public class ComputerFactory implements IFactory<IProduct> {

    public ComputerProduct product() {
        // 工厂标准方法中，完成指定产品对象的构建并返回
        return new ComputerProduct();
    }
}
