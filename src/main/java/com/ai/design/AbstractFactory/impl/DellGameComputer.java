/**
 * Copyright (C), 2018-2019
 * FileName: DellGameComputer
 * Author:   WXG
 * Date:     2019/7/25 20:25
 * Description:
 */
package com.ai.design.AbstractFactory.impl;

import com.ai.design.AbstractFactory.IDell;

/**
 * @Auther: wxg
 * @Date: 2019/7/25 20:25
 * @Description:
 */
public class DellGameComputer implements IDell {
    public String getInformation() {
        return "Dell游戏，Alienware，王者归来";
    }
}
