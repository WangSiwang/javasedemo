package com.javase.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * Created by 3 on 2017/11/13.
 */
public class Stream1 {
    static List< Integer > myList = new ArrayList<Integer >();
    public static void main(String[] args) {
        BigDecimal one = BigDecimal.ONE;
        List<Integer> nums = Lists.newArrayList(1,null,3,4,null,6);
        nums.stream().filter(num -> num != null).count();

    }
    
}
