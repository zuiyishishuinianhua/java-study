package com.test;

import java.lang.annotation.*;

/**
 * Created by yao_pc on 2017/9/6.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Param {

    String name();



}
