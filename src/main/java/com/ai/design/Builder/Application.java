/**
 * Copyright (C), 2018-2019
 * FileName: Application
 * Author:   WXG
 * Date:     2019/7/31 16:12
 * Description:
 */
package com.ai.design.Builder;

import com.alibaba.fastjson.JSON;

/**
 * @Auther: wxg
 * @Date: 2019/7/31 16:12
 * @Description:
 */
public class Application {

    public static void main(String[] args) {
        //获取建造工厂
        Builder<Product> builder = new ConcreteBuilder();
        //获取小区对象
        Product product = builder.retrieveResult();
        System.out.println(JSON.toJSONString(product));
    }



}
