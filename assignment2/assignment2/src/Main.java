public class Main {
    public static void main(String[] args) {
        GroceryList x = new GroceryList();
        GroceryItemOrder y = new GroceryItemOrder("cigarettes", 2, 2);
        y.setQuantity( 3 );
        System.out.println(y.getCost());
        x.add( y );
        GroceryItemOrder z = new GroceryItemOrder("rice", 3, 3);
        x.add( z );
        System.out.println(x.getTotalCost());
    }
}