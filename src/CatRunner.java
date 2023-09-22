public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 9, 8);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Pepe", 2, 5);
        cat2.printCatInfo();
        cat2.introduce();


        Cat cat3 = new Cat("Fluffy", 5, 8.5);
        cat3.introduce();
    }
}
