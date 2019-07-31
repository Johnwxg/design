/**
 * Copyright (C), 2018-2019
 * FileName: ConcreteBuilder
 * Author:   WXG
 * Date:     2019/7/29 20:56
 * Description: 具体建造者
 */
package com.ai.design.Builder;

/**
 * @Auther: wxg
 * @Date: 2019/7/29 20:56
 * @Description: 具体建造者
 */
public class ConcreteBuilder implements Builder<Product> {
    private Product product;
    public void builderPart1() {
        //builder part1
        Part1Component part1 = new Part1Component("国际工厂-盖楼");
        // other business procedure 其他业务流程
        // aggregation 聚合
        product.setPart1(part1);
    }

    public void builderPart2() {
        //builder part2
        Part2Component part2 = new Part2Component("中原物业-管理");
        // other business procedure 其他业务流程
        // aggregation 聚合
        product.setPart2(part2);
    }

    public Product retrieveResult() {
        //builder product
        product = new Product();
        product.setInformation("翰林国际城");
        //step1
        this.builderPart1();
        //step2
        this.builderPart2();
        return product;
    }
}
