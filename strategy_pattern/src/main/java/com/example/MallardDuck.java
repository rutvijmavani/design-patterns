package  com.example;

import  com.example.FlyStrategy.FlyWithWings;
import  com.example.QuackStrategy.Quack;

public class MallardDuck extends  Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack(); 
    }
    // this is a comment.

    @Override
    public void display(){
        System.out.println("I am a real Mallard Duck!");
    }
}
