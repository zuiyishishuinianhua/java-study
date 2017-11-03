package com.study.design.prototype.c1.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @date 2017/11/3 14:17
 */
public class Manager  {

    private Map<String, Product> map = new HashMap<>();

    public void register(String protoName, Product proto) {
        map.put(protoName, proto);
    }

    public Product create(String protoName) {
        Product product = map.get(protoName);
        return product.createClone();
    }











}
