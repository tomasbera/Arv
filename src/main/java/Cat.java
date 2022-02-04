public class Cat extends Dog {

    public static boolean dogCat = true;

    public static void main(String[] args) {

        Dog dog = new Dog();
        if (dogCat) {
            dog.bark();
            dogCat = false;
            System.out.println(dog.type);
        }
    }
}
