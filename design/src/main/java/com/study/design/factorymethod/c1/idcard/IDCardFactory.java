package com.study.design.factorymethod.c1.idcard;

import com.study.design.factorymethod.c1.framework.Factory;
import com.study.design.factorymethod.c1.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyao
 * @date 2017/11/1 15:45
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
