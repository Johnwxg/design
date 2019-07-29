/**
 * Copyright (C), 2018-2019
 * FileName: Application
 * Author:   WXG
 * Date:     2019/7/25 20:27
 * Description:
 */
package com.ai.design.AbstractFactory;

import com.ai.design.AbstractFactory.impl.GameComputerFactory;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 20:27
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        GameComputerFactory factory = new GameComputerFactory();
        IProduct xiaomiProduct = factory.productXiaomi();
        System.out.println(xiaomiProduct.getInformation());


        IProduct dellProduct = factory.productDell();
        System.out.println(dellProduct.getInformation());
    }
}
