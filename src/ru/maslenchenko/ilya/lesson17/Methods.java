package ru.maslenchenko.ilya.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    public static void printInterface() {
        System.out.println("Программа Библиотека");
        System.out.println("Нажмите 1 для просмотра содержимого библиотеки");
        System.out.println("Нажмите 2 для просмотра добавления книги");
        System.out.println("Нажмите 3 для выхода");
    }

    public static void addBook() {
        List<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        do {
            switch (sc.nextInt()) {
                case 1: {
                    List<Book> bookList = getBook("library.dat");
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                }
                break;
                case 2: {
                    System.out.println("Введите название книги:");
                    String name = sc.next();
                    System.out.println("Введите автора:");
                    String author = sc.next();
                    System.out.println("Введите год издания:");
                    String yearOfPublic = sc.next();
                    books.add(new Book(name, author, yearOfPublic));
                    try (OutputStream os = new FileOutputStream("library.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(os)) {
                        oos.writeObject(books);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                break;
                case 3:
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    private static List<Book> getBook(String fileName) {
        if (new File(fileName).exists()) {
            try (InputStream is = new FileInputStream(fileName);
                 ObjectInputStream ois = new ObjectInputStream(is)) {
                return (List<Book>) ois.readObject();

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Библиотека пуста");
        return new ArrayList<>();
    }
}
