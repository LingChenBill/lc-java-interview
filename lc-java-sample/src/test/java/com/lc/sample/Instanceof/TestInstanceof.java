package com.lc.sample.Instanceof;

/**
 * instanceof 关键字的作用。
 *
 * @author lingchen
 * @description:
 * @date 2020/4/25
 */
public class TestInstanceof {

    public static void main(String[] args) {

        int i = 0;

        // 编译不通过i必须是引用类型，不能是基本类型
//        System.out.println(i instanceof Integer);

        // 编译不通过
//        System.out.println(i instanceof Object);

        Integer integer = new Integer(1);
        // true
        System.out.println(integer instanceof Integer);

        // 在JavaSE规范中对instanceof运算符的规定就是，如果obj是null，那将返回false
        // false
        System.out.println(null instanceof Object);

    }

}
