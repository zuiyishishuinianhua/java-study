package com.study.design.factorymethod.c1.idcard;

import com.study.design.factorymethod.c1.framework.Product;

/**
 * @author chenyao
 * @date 2017/11/1 15:43
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println("use " + owner + " card");
    }
}
