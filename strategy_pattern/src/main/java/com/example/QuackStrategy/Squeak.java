package  com.example.QuackStrategy;

public class Squeak implements  QuackBehavior{
    @Override
    public  void quack(){
        System.out.println("I can squeak!");
    }
}
