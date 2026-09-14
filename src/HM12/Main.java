package HM12;

public class Main {
    public static void main(String[] args) {
        // case 1 - 2: Testing products
        System.out.println("=== ТЕСТИРОВАНИЕ ТОВАРОВ ===");
        Product phone1 = new Product(101, "Смартфон", 50000, "Электроника");
        Product phone2 = new Product(101, "Смартфон Pro", 70000, "Электроника");
        Product laptop = new Product(202, "Ноутбук", 100000, "Компьютеры");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(laptop);

        System.out.println("phone1 равен phone2 (одинаковые id и category): " + phone1.equals(phone2)); // true
        System.out.println("phone1 равен laptop: " + phone1.equals(laptop)); // false

        // case 3: Testing orders
        System.out.println("\n=== ТЕСТИРОВАНИЕ ЗАКАЗОВ ===");
        Product[] basket1 = {phone1, laptop};
        Product[] basket2 = {phone2, laptop};
        Product[] basket3 = {laptop, phone1};

        Order order1 = new Order("Иван Иванов", basket1);
        Order order2 = new Order("Иван Иванов", basket2);
        Order order3 = new Order("Иван Иванов", basket3);
        Order order4 = new Order("Петр Петров", basket1);

        System.out.println("Заказ 1: " + order1);
        System.out.println("Заказ 2: " + order2);
        System.out.println("Заказ 3: " + order3);
        System.out.println("Заказ 4: " + order4);

        System.out.println("order1 равен order2 (одинаковый клиент и равные товары по порядку): " + order1.equals(order2)); // true
        System.out.println("order1 равен order3 (разный порядок товаров): " + order1.equals(order3)); // false
        System.out.println("order1 равен order4 (разные клиенты): " + order1.equals(order4)); // false
    }
}