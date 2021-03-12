package cn.pdai.pattern.strategy.entity;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-03-12 14:00
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
