package com.devsenior;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the E-commerce System!");

        User user = new User("john_doe", "john@email.com", "password123");
        boolean authenticated = user.authenticate("password123");

        if (authenticated) {
            System.out.println("Access granted. You can now shop for cars.");
        } else {
            System.out.println("Authentication failed. Please try again.");
        }

        ProductRepository productRepository = new ProductRepository();
        Product product1 = new Product("1", "Car A", "$20,000");
        Product product2 = new Product("2", "Car B", "$30,000");
        productRepository.addProduct(product1);
        productRepository.addProduct(product2);

        System.out.println("Search product by id = 1: ");
        Product foundProduct = productRepository.getProductById("1");
        System.out.println("Product found: " +
                (foundProduct != null ? foundProduct.getName() + " - " + foundProduct.getPrice() : "No product found")
        );

        System.out.println("Search product by id = 3: ");
        Product notFoundProduct = productRepository.getProductById("3");
        System.out.println("Product found: " +
                (notFoundProduct != null ? notFoundProduct.getName() + " - " + notFoundProduct.getPrice() : "No product found")
        );

        System.out.println("Adding products to the shopping cart...");
        CarShopping carShopping = new CarShopping();
        carShopping.addProduct(product1);
        carShopping.addProduct(product2);

        System.out.println("Products in the shopping cart:");
        for (Product product : carShopping.getProducts()) {
            System.out.println("- " + product.getName() + " - " + product.getPrice());
        }

        System.out.println("Realizar compra...");
        CompraService compraService = new CompraService();
        try {
            ResultCompra resultCompra = compraService.realizarCompra(carShopping);
            if (resultCompra instanceof CompraExitosa) {
                System.out.println(compraService.getMessageCompraExitosa());
            }
        } catch (Exception e) {
            System.out.println("Error al realizar la compra: " + e.getMessage());
        }
    }
}