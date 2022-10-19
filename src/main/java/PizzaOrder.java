import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        //Task #1
        String customerName = "Gray" ;
        String customerEmail =  "gary@123.com";
        long phoneNo = 412312345L;
        String address = "20, Marble Drive, Eville";
        float pizzaPriceIn$ = 12.99f;
        char pizzaSize = 'M';
        float garlicBreadPriceIn$ = 5.99f;
        float beveragePriceIn$ = 1.99f;
        //Task #2
        System.out.println("Sl No \t Item Category");
        System.out.println("------------------------");
        System.out.println("1) \t\t Pizza");
        System.out.println("2) \t\t Garlic Bread");
        System.out.println("3) \t\t Beverages");
        System.out.print("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages : ");
        Scanner scanner = new Scanner(System.in);
        int menuItemSlNo = scanner.nextInt();
        System.out.println();
        //Task #3
        switch(menuItemSlNo) {
            case(1):
                System.out.print("Please enter the number of pizza you want to order : ");
                int noOfPizzasOrdered = scanner.nextInt();
                float totalPriceOfPizzasOrdered = pizzaPriceIn$ * noOfPizzasOrdered;
                System.out.println();
                System.out.println("Your total Bill : $" + totalPriceOfPizzasOrdered);
            break;
            case(2):
                System.out.print("Please enter the number of Garlic Bread you want to order : ");
                int noOfGarlicBreadOrdered = scanner.nextInt();
                float totalPriceOfGarlicBreadOrdered = garlicBreadPriceIn$ * noOfGarlicBreadOrdered;
                System.out.println();
                System.out.println("Your total Bill : $" + totalPriceOfGarlicBreadOrdered);
            break;
            case(3):
                System.out.print("Please enter the number of Beverages you want to order : ");
                int noOfBeveragesOrdered = scanner.nextInt();
                float totalPriceOfBeveragesOrdered = beveragePriceIn$ * noOfBeveragesOrdered;
                System.out.println();
                System.out.println("Your total Bill : $" + totalPriceOfBeveragesOrdered);
            break;
            default:
                System.out.println("Invalid Sl No selected for menu");
        }

    }
}
