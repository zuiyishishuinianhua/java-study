package com.study.design.prototype.c1.framework;

/**
 * @author chenyao
 * @date 2017/11/3 14:07
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();


}
