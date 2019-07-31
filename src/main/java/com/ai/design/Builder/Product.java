/**
 * Copyright (C), 2018-2019
 * FileName: Product
 * Author:   WXG
 * Date:     2019/7/29 20:52
 * Description: 具体产品
 */
package com.ai.design.Builder;

/**
 * @Auther: wxg
 * @Date: 2019/7/29 20:52
 * @Description: 具体产品-小区
 */
public class Product {
    private String information;
    private Part1Component part1;
    private Part2Component part2;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Part1Component getPart1() {
        return part1;
    }

    public void setPart1(Part1Component part1) {
        this.part1 = part1;
    }

    public Part2Component getPart2() {
        return part2;
    }

    public void setPart2(Part2Component part2) {
        this.part2 = part2;
    }
}
