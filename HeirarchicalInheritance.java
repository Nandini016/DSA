public class HeirarchicalInheritance{
    public static void main(String args[]){
        Animal a = new Animal();
        Birds b=new Birds();
        Fishes f = new Fishes();
        a.breths();
        a.eat();
        b.breths();
        b.fly();
        f.swim();
        f.eat();

    }
}
class Animal{
    void breths(){
        System.out.println("It breathes");
    }
    void eat(){
        System.out.println("It eats");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("It flies");
    }
}
class Fishes extends Animal{
    void swim(){
        System.out.println("It swims");
    }
}