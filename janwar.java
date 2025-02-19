class Animal{
    void speak(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Dog bark");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("cat meows");
    }
}
public class janwar{
    public static void main(String args[]){
        Cat c=new Cat();
        Dog d=new Dog();
        c.speak();
        d.speak();
    }
}