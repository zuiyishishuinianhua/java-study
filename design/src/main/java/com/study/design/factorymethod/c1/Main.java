package com.study.design.factorymethod.c1;

import com.study.design.factorymethod.c1.framework.Factory;
import com.study.design.factorymethod.c1.framework.Product;
import com.study.design.factorymethod.c1.idcard.IDCardFactory;

/**
 * @author chenyao
 * @date 2017/11/1 15:42
 */
public class Main {

    public static void main(String[] args) {
        Factory idcardFactory = new IDCardFactory();
        Product card1 = idcardFactory.create("zhangsan");
        Product card2 = idcardFactory.create("lisi");
        Product card3 = idcardFactory.create("wangwu");

        card1.use();
        card2.use();
        card3.use();
    }
}
