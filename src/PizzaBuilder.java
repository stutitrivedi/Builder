public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder(String chain) {
        this.pizza = new Pizza(chain);
    }

    public PizzaBuilder size(String size) {
        this.pizza.setSize(size);
        return this;
    }

    public PizzaBuilder pepperoni() {
        this.pizza.addTopping("Pepperoni");
        return this;
    }

    public PizzaBuilder sausage() {
        this.pizza.addTopping("Sausage");
        return this;
    }

    public PizzaBuilder mushrooms() {
        this.pizza.addTopping("Mushrooms");
        return this;
    }

    public PizzaBuilder bacon() {
        this.pizza.addTopping("Bacon");
        return this;
    }

    public PizzaBuilder onions() {
        this.pizza.addTopping("Onions");
        return this;
    }

    public PizzaBuilder extraCheese() {
        this.pizza.addTopping("Extra Cheese");
        return this;
    }

    public PizzaBuilder peppers() {
        this.pizza.addTopping("Peppers");
        return this;
    }

    public PizzaBuilder chicken() {
        this.pizza.addTopping("Chicken");
        return this;
    }

    public PizzaBuilder olives() {
        this.pizza.addTopping("Olives");
        return this;
    }

    public PizzaBuilder spinach() {
        this.pizza.addTopping("Spinach");
        return this;
    }

    public PizzaBuilder tomatoAndBasil() {
        this.pizza.addTopping("Tomato and Basil");
        return this;
    }

    public PizzaBuilder beef() {
        this.pizza.addTopping("Beef");
        return this;
    }

    public PizzaBuilder ham() {
        this.pizza.addTopping("Ham");
        return this;
    }

    public PizzaBuilder pesto() {
        this.pizza.addTopping("Pesto");
        return this;
    }

    public PizzaBuilder spicyPork() {
        this.pizza.addTopping("Spicy Pork");
        return this;
    }

    public PizzaBuilder hamAndPineapple() {
        this.pizza.addTopping("Ham and Pineapple");
        return this;
    }

    public Pizza build() {
        return this.pizza;
    }
}