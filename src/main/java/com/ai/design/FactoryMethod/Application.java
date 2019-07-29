/**
 * Copyright (C), 2018-2019
 * FileName: Application
 * Author:   WXG
 * Date:     2019/7/25 16:00
 * Description: TO DO
 */
package com.ai.design.FactoryMethod;

import com.ai.design.FactoryMethod.impl.PhoneFactory;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 16:00
 * @Description:
 */
public class Application {

    public static void main(String[] args) {
        IFactory<IProduct> phoneFactory = new PhoneFactory();
        IProduct phoneProduct = phoneFactory.product();
        System.out.println(phoneProduct.getInformation());
    }
}
