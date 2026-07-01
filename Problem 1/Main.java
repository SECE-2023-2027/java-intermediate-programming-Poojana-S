import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id=sc.next();
        String name=sc.next();
        double price=sc.nextDouble();
        int stock=sc.nextInt();
        Product p = new Product(id, name, price, stock);
        System.out.println("Input discount");
        double percent=sc.nextDouble();
        p.applyDiscount(percent);
        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());
        sc.close();
    }
}
