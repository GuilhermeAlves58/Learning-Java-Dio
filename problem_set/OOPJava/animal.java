package problem_set.OOPJava;


public class animal{
    String name;
    public void sound(){
        System.out.println("Roar");
    }
}

class dog extends animal{
    public void sound(){
        System.out.println("The dog barks ");
    }
}

class cat extends animal{
    public void sound(){
        System.out.println("Meow");
    }
}
