package com.lc.sample.override;

/**
 * 重写的父类
 * @description: 发生在父类与子类之间
 * 方法名，参数列表，返回类型必须相同
 * 访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private）
 * 重写方法一定不能抛出新的检查异常或者比被重写方法申明更加宽泛的检查型异常
 *
 * @author lingchen
 * @date 2020/5/2
 */
public class Father {

    public void sayHello() {

        System.out.println("Hello");

    }

    public static void main(String[] args) {

        Son s = new Son();
        s.sayHello();

    }

}

class Son extends Father {

    @Override
    public void sayHello() {

        System.out.println("Hello by ");

    }
}
