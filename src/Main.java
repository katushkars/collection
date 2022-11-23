import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Кефир", 14.2, 1);
        Product product2 = new Product("Корица", 14.2, 1);
        Product product3 = new Product("Мука", 99.9, 5);
        Product product4 = new Product("Сахар", 69.9, 2);
        ProductList productList = new ProductList();
        productList.addProduct(product1);
        productList.addProduct(product2);
        productList.addProduct(product3);
        productList.addProduct(product4);
        System.out.println(productList.toString());
        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product1);
        Recipe recipe1 = new Recipe(Set.of(product1, product2), "оладушек");
        System.out.println(recipe1.toString());
        Set<Integer> numbers = new LinkedHashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 1001));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);


        //Задание №3

        Set<Task> tasks = new HashSet<>(15);
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            tasks.add(new Task(random.nextInt(10), random.nextInt(10)));
        }
        System.out.println(tasks.toString());


        Passport passport1 = new Passport(6666666, "Иванов", "Dfyz", "Cthuttdbx", "17.11.1991");
        Passport passport2 = new Passport(6666665, "Петров", "Dfyz", "Cthuttdbx", "17.11.1991");
        Set<Passport> passports = new LinkedHashSet<>();
        addPassport(passport1,passports);
        addPassport(passport2, passports);
        findPassport(6666665,passports);
        System.out.println(findPassport(6666665,passports));


        System.out.println(passports.toString());


    }

    public static void addPassport(Passport passport,Set<Passport> passports) {
        passports.add(passport);

    }
    public static Passport findPassport (int numberPassport,Set<Passport> passports){
        for(Passport passport:passports){
            if(passport.getNumberPassport()==numberPassport){
                return passport;
            }
        }
        return null;
    }
}


