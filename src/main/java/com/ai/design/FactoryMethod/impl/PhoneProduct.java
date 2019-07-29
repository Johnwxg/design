/**
 * Copyright (C), 2018-2019
 * FileName: PhoneProduct
 * Author:   WXG
 * Date:     2019/7/25 15:46
 * Description: 产品具体实现
 */
package com.ai.design.FactoryMethod.impl;

import com.ai.design.FactoryMethod.IProduct;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 15:46
 * @Description: 产品具体实现
 */
public class PhoneProduct implements IProduct {
    /**
     *
     * @return
     */
    public String getInformation() {
        return "电视很NB，报纸很NB，杂志很NB，游戏机很NB，小说很NB，最终都被手机干掉了";
    }
}
