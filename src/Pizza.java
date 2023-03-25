import java.util.ArrayList;
import java.util.List;
public class Pizza {
    private String chain;
    private String size;
    private List<String> toppings;

    public Pizza(String chain) {
        this.chain = chain;
        this.toppings = new ArrayList<String>();
    }

    public void setSize(String size) {
        this.size = size;

    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public void eat() {
        System.out.println("Eating pizza from " + this.chain + " with size " + this.size + " and toppings:");
        for (String topping : this.toppings) {
            System.out.println("- " + topping);
        }
    }
}
