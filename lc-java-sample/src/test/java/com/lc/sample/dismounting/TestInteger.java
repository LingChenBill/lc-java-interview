package com.lc.sample.dismounting;

/**
 * 测试拆装箱
 * 装箱就是自动将基本数据类型转换成包装器类型（int -> Integer）
 * Integer.valueOf()
 * 拆箱就是自动将包装器类型转换为基本数据类型（Integer -> int）
 * Integer.intValue()
 *
 * @author lingchen
 * @description:
 * @date 2020/4/25
 */
public class TestInteger {

    public static void main(String[] args) {

        Integer i1 = 100;

        Integer i2 = 100;

        Integer i3 = 200;

        Integer i4 = 200;

        Integer i5 = new Integer(127);

        Integer i6 = new Integer(127);

        // java在编译Integer i = 100 ;时，会翻译成为Integer i = Integer.valueOf(100)
        // true
        System.out.println(i1 == i2);

        // 如果两个变量的值在区间-128到127之间，则比较结果为true，如果两个变量的值不在此区间，则比较结果为false
        // false
        System.out.println(i3 == i4);

        // 两个通过new生成的Integer变量永远是不相等的（因为new生成的是两个对象，其内存地址不同）
        // false
        System.out.println(i5 == i6);

    }
}
