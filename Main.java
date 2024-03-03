import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var purchase=new Purchase(Arrays.asList(new Item("Clean code",100,8),new Item("Applying UML and Patterns",300,8),new Item("Shipping",50,23)));
        purchase.calculate_netto();
        purchase.calculate_taxes();
        purchase.calculate_brutto();
        System.out.println(purchase);

        
    }
    
    
}
