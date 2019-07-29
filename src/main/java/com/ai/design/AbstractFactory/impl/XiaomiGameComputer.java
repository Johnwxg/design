/**
 * Copyright (C), 2018-2019
 * FileName: XiaomiGameComputer
 * Author:   WXG
 * Date:     2019/7/25 20:22
 * Description:
 */
package com.ai.design.AbstractFactory.impl;

import com.ai.design.AbstractFactory.IXiaomi;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 20:22
 * @Description:
 */
public class XiaomiGameComputer implements IXiaomi {
    public String getInformation() {
        return "小米游戏本，最佳性价比";
    }
}
