/**
 * Copyright (C), 2018-2019
 * FileName: Part1Component
 * Author:   WXG
 * Date:     2019/7/29 20:48
 * Description: <内聚组件>复杂对象-组成部分1-eg:楼房
 */
package com.ai.design.Builder;

/**
 * @Auther: wxg
 * @Date: 2019/7/29 20:48
 * @Description: 复杂对象-组成部分1-eg:楼房
 */
public class Part1Component {
    private String information;

    public Part1Component(String information){
        this.information = information;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
