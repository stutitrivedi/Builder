public class Driver {
    public static void main(String[] args) {
        PizzaBuilder builder = new PizzaBuilder("Pizza Hut");
        PizzaBuilder littleCaesarsBuilder = new PizzaBuilder("Little Caesars");
        PizzaBuilder dominosBuilder = new PizzaBuilder("Dominos");

        System.out.println("create three pizzas one of each size with 3, 6, and 9 toppings");
        Pizza pizza1 = builder.size("Small")
                .pepperoni()
                .mushrooms()
                .onions()
                .build();
        pizza1.eat();

        PizzaBuilder builder2 = new PizzaBuilder("Pizza Hut");
        Pizza pizza2 = builder2.size("Medium")
                .pepperoni()
                .sausage()
                .mushrooms()
                .bacon()
                .onions()
                .extraCheese()
                .build();
        pizza2.eat();

        PizzaBuilder builder3 = new PizzaBuilder("Pizza Hut");
        Pizza pizza3 = builder3.size("Large")
                .pepperoni()
                .sausage()
                .mushrooms()
                .bacon()
                .onions()
                .extraCheese()
                .olives()
                .hamAndPineapple()
                .spinach()
                .build();
        pizza3.eat();

        System.out.println("\nThree different PIZZA CHAIN with respective size and toppings");
        PizzaBuilder builder4 = new PizzaBuilder("Pizza Hut");
        Pizza pizza4 = builder4.size("Large")
                .pepperoni()
                .sausage()
                .mushrooms()
                .build();
        pizza4.eat();

        PizzaBuilder builder5 = new PizzaBuilder("Pizza Hut");
        Pizza pizza5 = builder5.size("Small")
                .spicyPork()
                .onions()
                .build();
        pizza5.eat();

        PizzaBuilder builder6 = new PizzaBuilder("Little Caesars");
        Pizza pizza6 = builder6.size("Medium")
                .spicyPork()
                .onions()
                .hamAndPineapple()
                .extraCheese()
                .pepperoni()
                .peppers()
                .mushrooms()
                .pesto()
                .build();
        pizza6.eat();

        PizzaBuilder builder7 = new PizzaBuilder("Little Caesars");
        Pizza pizza7 = builder7.size("Small")
                .spicyPork()
                .onions()
                .extraCheese()
                .pepperoni()
                .mushrooms()
                .sausage()
                .build();
        pizza7.eat();

        PizzaBuilder builder8 = new PizzaBuilder("Dominos");
        Pizza pizza8 = builder8.size("Small")
                .spicyPork()
                .build();
        pizza8.eat();

        PizzaBuilder builder9 = new PizzaBuilder("Dominos");
        Pizza pizza9 = builder9.size("Large")
                .spicyPork()
                .onions()
                .extraCheese()
                .build();
        pizza9.eat();
    }
}
