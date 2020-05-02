package com.lc.sample.override;

/**
 * 重载
 *
 * @description: 重载是一个类中多态性的一种表现
 * 重载要求同名方法的参数列表不同（参数类型，参数个数甚至是参数顺序）
 * 重载的时候，返回值类型可以相同也可以不相同。无法以返回型别作为重载函数的区分标准
 *
 * @author lingchen
 * @date 2020/5/2
 */
public class TestOverload {

    public static void main(String[] args) {

        TestOverload testOverload = new TestOverload();

        testOverload.sayHello();

        testOverload.sayHello("Teddy");

    }

    public void sayHello() {

        System.out.println("Hello");

    }


    public void sayHello(String name) {

        System.out.println("Hello" + " " + name);

    }




}
