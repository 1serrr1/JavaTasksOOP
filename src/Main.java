import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задача 3
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
        //Задача 17
        Weapon sword = new Weapon("Sword", 10);
        Player player = new Player("Hero", 100, sword);
        Enemy orc = new Enemy("Orc", 50);

        player.attack(orc);
        //Задача 18
        Customer customer = new Customer("John Doe");
        Order order = new Order(customer);

        Producd apple = new Producd("Apple", 1.0);
        Producd orange = new Producd("Orange", 1.5);

        order.addProducd(apple);
        order.addProducd(orange);

        System.out.println("Total cost: " + order.getTotalCost());
        //Задача 19
        Smartphone smartphone = new Smartphone("Samsung");
        Laptop laptop = new Laptop("Dell");

        smartphone.turnOn();
        smartphone.takePhoto();

        laptop.turnOn();
        laptop.code();
        //Задача 20
        Player2 player1 = new Player2("Player X", PlayerType.X);
        Player2 player2 = new Player2("Player O", PlayerType.O);

        Game game = new Game();
        game.startGame(player1, player2);

        game.makeMove(0, 0); // Пример хода
        game.makeMove(0, 1);
        game.makeMove(1, 0);
        game.makeMove(1, 0);
    }
}
//Задача 1
class Person {
    private String name;
    private int age;
    private String gender;

     public Person(String name, int age, String gender) {
         this.name = name;
         this.age = age;
         this.gender = gender;
     }
     public void displayInfo() {
         System.out.println("Имя: " + name + ", Возраст: " + age + ", Пол: " + gender);
     }
    public void upAge() {
        age++;
    }

    public void changeName(String newName) {
        name = newName;
    }
}
//Задача 2
class Worker extends Person {
    private double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(String name, int age, String gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
//Задача 3
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Гав");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Мяу");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Му");
    }
}
//Задача 4
abstract class Transport {
    abstract void move();
}

class Car extends Transport {
    void move() {
        System.out.println("Машина едет");
    }
}

class Bike extends Transport {
    void move() {
        System.out.println("Велосипед едет");
    }
}
//Задача 5
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> findByYear(int year) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }
}
//Задача 6
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
//Задача 7
class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
//Задача 8
abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }
}
//Задача 9
class Animal2 {
    void move() {
        System.out.println("Animal is moving");
    }
}

class Fish extends Animal2 {
    void move() {
        System.out.println("рыба плавает");
    }
}

class Bird extends Animal2 {
    void move() {
        System.out.println("птица летает");
    }
}

class Dog2 extends Animal2 {
    void move() {
        System.out.println("собака бегает");
    }
}
//Задача 10
class Student {
    private String name;
    private String group;
    private double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

class University {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    public ArrayList<Student> filterByGrade(double minGrade) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() >= minGrade) {
                result.add(student);
            }
        }
        return result;
    }
}
//Задача 11
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}

class Store {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
//Задача 12
interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentSystem {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class PayPal implements PaymentSystem {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to PayPal");
    }
}
//Задача 13
class UniqueID {
    private static int currentId = 0;

    public static int generateId() {
        return currentId++;
    }
}
//Задача 14
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}

class Rectangle2 {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle2(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        return (bottomRight.getX() - topLeft.getX()) * (topLeft.getY() - bottomRight.getY());
    }
}
//Задача 15
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(real * other.real - imaginary * other.imaginary,
                real * other.imaginary + imaginary * other.real);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new ComplexNumber((real * other.real + imaginary * other.imaginary) / denominator,
                (imaginary * other.real - real * other.imaginary) / denominator);
    }
}
//Задача 16
class Matrix {
    private final int[][] data;

    public Matrix(int rows, int columns) {
        data = new int[rows][columns];
    }

    public Matrix add(Matrix other) {
        int rows = data.length;
        int cols = data[0].length;
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        int rows = data.length;
        int cols = other.data[0].length;
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < data[0].length; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
}
//Задача 17
class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(weapon.getDamage());
        System.out.println(name + " attacked " + enemy.getName() + " with " + weapon.getName());
    }

}

class Enemy {
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage.");
    }

    public String getName() {
        return name;
    }
}

class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
//Задача 18
class Producd {
    private String name;
    private double price;

    public Producd(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
}

class Order {
    private Customer customer;
    private List<Producd> products = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProducd(Producd producd) {
        products.add(producd);
    }

    public double getTotalCost() {
        double total = 0;
        for (Producd producd : products) {
            total += producd.getPrice();
        }
        return total;
    }
}
//Задача 19
class Device {
    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println(brand + " device is now ON.");
    }

    public void turnOff() {
        System.out.println(brand + " device is now OFF.");
    }
}

class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println("Taking a photo with the smartphone.");
    }
}

class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void code() {
        System.out.println("Coding on the laptop.");
    }
}
//Задача 20
enum PlayerType {
    X, O;
}

class Player2 {
    private String name;
    private PlayerType type;

    public Player2(String name, PlayerType type) {
        this.name = name;
        this.type = type;
    }

    public PlayerType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}

class Game {
    private Player2[][] board = new Player2[3][3];
    private Player2 currentPlayer;

    public void startGame(Player2 player1, Player2 player2) {
        currentPlayer = player1;
    }

    public void makeMove(int row, int col) {
        if (board[row][col] == null) {
            board[row][col] = currentPlayer;
            if (checkWin(currentPlayer)) {
                System.out.println(currentPlayer.getName() + " wins!");
            } else {
                currentPlayer = currentPlayer.getType() == PlayerType.X ? new Player2("Player O", PlayerType.O) : new Player2("Player X", PlayerType.X);
            }
        } else {
            System.out.println("\n" +
                    "Эта ячейка уже занята");
        }
    }

    private boolean checkWin(Player2 player) {
        return false;
    }
}