package com.study.design.factorymethod.c1.framework;

/**
 * @author chenyao
 * @date 2017/11/1 15:38
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);


}
