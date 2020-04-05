package com.catt.decorator;

/**
 * @author zwp
 * @since 2020-04-04 20:11
 */
public class Client {
    public static void main(String[] args) {
        MilkCoffee milkCoffee = new MilkCoffee(new SimpleCoffee());
        System.out.println(String.format("当前咖啡的种类为： %s", milkCoffee.getName()));
        milkCoffee.cost();
    }
}
