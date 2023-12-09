package alex.klimchuk.product.catalog.services;

import alex.klimchuk.product.catalog.domain.Author;
import alex.klimchuk.product.catalog.domain.Product;
import alex.klimchuk.product.catalog.domain.ProductCategory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private final Map<Integer, Product> productMap = new HashMap<>();

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> listProducts() {
        return new ArrayList<>(productMap.values());
    }

    private void loadProducts() {
        Author jt = Author.builder()
                .id(1)
                .firstName("John")
                .lastName("Thompson")
                .image("instructor_jt.jpg")
                .build();

        ProductCategory springIntroCat = ProductCategory.builder()
                .id(1)
                .category("Spring Introduction")
                .build();

        ProductCategory springCoreCat = ProductCategory.builder()
                .id(2)
                .category("Spring Core")
                .build();

        ProductCategory springBootCat = ProductCategory.builder()
                .id(3)
                .category("Spring Boot")
                .build();

        ProductCategory thymeleafCat = ProductCategory.builder()
                .id(4)
                .category("Thymeleaf")
                .build();

        buildProduct(1, "Introduction to Spring", "Start Learning Spring!",
                jt, "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                        "\n" +
                        "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                        "\n" +
                        "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.",
                BigDecimal.ZERO, "SpringIntroThumb.png", springIntroCat, springBootCat);

        buildProduct(2, "Spring Core Ultimate", "Ultimate Bundle of Spring Core!",
                jt, "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                        "\n" +
                        "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                        "\n" +
                        "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.",
                new BigDecimal("199"), "SpringCoreUltimateThumb.png", springCoreCat, springBootCat);

        buildProduct(3, "Thymeleaf", "Thymeleaf and Spring!",
                jt, "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                        "\n" +
                        "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                        "\n" +
                        "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.",
                new BigDecimal("199"), "ThymeleafThumb.png", thymeleafCat);

        buildProduct(4, "Spring Core", "Spring Core - mastering Spring!",
                jt, "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                        "\n" +
                        "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                        "\n" +
                        "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.",
                new BigDecimal("199"), "SpringCoreThumb.png", springCoreCat, springBootCat);

        buildProduct(5, "Spring Core Advanced", "Advanced Spring Core!",
                jt, "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                        "\n" +
                        "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                        "\n" +
                        "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.",
                new BigDecimal("199"), "SpringCoreAdvancedThumb.png", springCoreCat, springBootCat);

        buildProduct(6, "Spring Core Dev-Ops", "Deploying Spring in the Enterprise and the cloud!",
                jt, "Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.\n" +
                        "\n" +
                        "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.\n" +
                        "\n" +
                        "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.",
                new BigDecimal("199"), "SpringCoreDevOpsThumb.png", springCoreCat, springBootCat);
    }

    private void buildProduct(int id, String courseName, String courseSubtitle, Author author, String courseDescription,
                              BigDecimal price, String imageUrl, ProductCategory... categories) {
        Product product = Product.builder()
                .id(id)
                .courseName(courseName)
                .courseSubtitle(courseSubtitle)
                .author(author)
                .courseDescription(courseDescription)
                .price(price)
                .imageUrl(imageUrl)
                .productCategories(List.of(categories))
                .build();

        productMap.put(id, product);
    }
}