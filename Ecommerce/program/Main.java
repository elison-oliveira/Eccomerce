package Ecommerce.program;

import Ecommerce.entities.Client;
import Ecommerce.entities.Order;
import Ecommerce.entities.OrderItem;
import Ecommerce.entities.Product;
import Ecommerce.model.product.entities.enums.Color;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Product bedWhite = new Product("bed", Color.WHITE, 450.00, 5, 1200536);
//      Product bedBlack = new Product("bed", Color.BLACK, 450.00, 10, 1200536);
        Product bedBlack = new Product();

        bedBlack.setProduct("bed");
        bedBlack.setColor(Color.BLACK);
        bedBlack.setPrice(300.00);
        bedBlack.setQuantity(3);
        bedBlack.setCode(140036022);


        Product chairWhite = new Product("chair", Color.WHITE, 20.00, 20, 1200536);
        Client client = new Client("Ana", "ana@gmail.com", "wall street nº 40", 123);

        List<Product> products = new ArrayList<>();

        products.add(bedWhite);
        products.add(bedBlack);
        products.add(chairWhite);

        List<OrderItem> items = new ArrayList<>();

        OrderItem item1 = new OrderItem(products.get(0), 2);
        OrderItem item2 = new OrderItem(products.get(1), 4);

        items.add(item1);
        items.add(item2);

        Order order = new Order(client, items, new Date());

        System.out.println(order);
    }
}
