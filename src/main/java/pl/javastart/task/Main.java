package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "Vodka";
        ingredient1.capacity = 100;
        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "Tomato juice";
        ingredient2.capacity = 100;
        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "Water";
        ingredient3.capacity = 100;

        Drink drink = new Drink();
        drink.name = "Bloody Mary";
        drink.isAlcohol = true;
        drink.price = 15.5;
        drink.ingredient1 = ingredient1;
        drink.ingredient2 = ingredient2;
        drink.ingredient3 = ingredient3;

        System.out.println("Drink: " + drink.name);
        System.out.println("Cena: " + drink.price);
        System.out.println("Czy zawiera alkohol? " + drink.isAlcohol);
        System.out.println("Składniki:");
        System.out.println(drink.ingredient1.name);
        System.out.println(drink.ingredient2.name);
        System.out.println(drink.ingredient3.name);

        int capacity = drink.ingredient1.capacity + drink.ingredient2.capacity + drink.ingredient3.capacity;

        System.out.println("Pojemność: " + capacity);
    }
}
