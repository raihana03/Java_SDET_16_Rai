package class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog=new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.weight=169;
        actualDog.breed="German";
        actualDog.color="Black";

        actualDog.bark();
        Dog obj=new Dog();

        System.out.println("------------");

        Dog actualDogs=new Dog();
        actualDogs.name="Marshal";
        actualDogs.age=10;
        actualDogs.weight=145;
        actualDogs.breed="German";
        actualDogs.color="Brown";

        actualDogs.sleep();
        Dog objj=new Dog();
    }

}
