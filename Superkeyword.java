public class Superkeyword {
    public static void main(String args[]){
        Horse h = new Horse();

    }
    
}
class Animal{
    Animal(){
        System.out.println("Aniaml constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called");
    }

}
