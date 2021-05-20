package exercicios.lista02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> products = new ArrayList<>();
        Double totalValue = 0.0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Name");
            String productName = sc.next();
            System.out.println("Price");
            Double productPrice = sc.nextDouble();
            System.out.println("Quantity");
            Integer productQuantity = sc.nextInt();
            HashMap<String, Object> product = new HashMap<String, Object>();

            product.put("id", i + 1);
            product.put("Name", productName);
            product.put("Price", String.format("%,.2f", productPrice));
            product.put("Quantity", productQuantity);
            product.put("Value", productPrice * productQuantity);
            totalValue = totalValue + productPrice * productQuantity;
            products.add(product);
        }

        products.forEach( product -> {
            System.out.println("Produto " + product.get("id"));
            System.out.println(product.get("Name"));
            System.out.println("R$" + product.get("Price"));
            System.out.println("Quantidade: "+ product.get("Quantity"));
            System.out.println("\n");
        });

        System.out.println("Total: R$"+ totalValue);
    }
}