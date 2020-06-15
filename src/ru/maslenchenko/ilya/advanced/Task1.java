package ru.maslenchenko.ilya.advanced;

import java.util.Locale;
import java.util.Scanner;

/**
 * 1. Задача о треугольниках.
 * Дано: На вход программы подаётся число 1, 2 или 3, обозначающее, какую группу элементов треугольника пользователь будет вводить:
 * 1: две стороны и угол между ними (стороны вещественные, угол задан целыми градусами и минутами дуги и вещественными секундами дуги)
 * 2: одна сторона и два прилежащих к ней угла
 * 3: три стороны
 */

public class Task1 {
    private static class Triangle {
        double edgeA, edgeB, edgeC; //Стороны треугольника
        double angle_a, angle_b, angle_c; //Углы треугольника
        //три стороны
        private Triangle(double edgeA, double edgeB, double edgeC) {
            this.edgeA = edgeA;
            this.edgeB = edgeB;
            this.edgeC = edgeC;
        }
        //две стороны и угол между ними
        private Triangle(double edgeA, double edgeB, int degrees, int minutes, double seconds) {
            this.edgeA = edgeA;
            this.edgeB = edgeB;
            this.angle_c = angleInRadians(degrees, minutes, seconds);
            this.edgeC = Math.sqrt(edgeA * edgeA + edgeB * edgeB - 2 * edgeA * edgeB * Math.cos(angle_c));
        }
        //одна сторона и два прилежащих к ней угла
        private Triangle(double edgeA, int degrees1, int minutes1, double seconds1, int degrees2, int minutes2, double seconds2) {
            this.edgeA = edgeA;
            this.angle_b = angleInRadians(degrees1, minutes1, seconds1);
            this.angle_c = angleInRadians(degrees2, minutes2, seconds2);
            this.angle_a = Math.PI - (angle_b + angle_c);
            this.edgeB = edgeA * Math.sin(angle_b) / Math.sin(angle_a);
            this.edgeC = edgeB * Math.sin(angle_c) / Math.sin(angle_b);
        }
        private double getPerimeter() {
            return edgeA + edgeB + edgeC;
        }
        private double angleInRadians(int degrees, int minutes, double seconds) {
            return degrees * Math.PI / 180 + minutes * Math.PI / (180 * 60) + seconds * Math.PI / (180 * 3600);
        }
        private double getSquare() {
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
        }
        private double getRExcircle() {
            return edgeA * edgeB * edgeC / (getSquare() * 4);
        }
        private double getRIncircle() {
            return 2 * getSquare() / getPerimeter();
        }
        private void dataPrintOut() {
            System.out.printf("Периметр: %.3f", getPerimeter());
            System.out.println();
            System.out.printf("Площадь: %.3f", getSquare());
            System.out.println();
            System.out.printf("Радиус вписанной окружности: %.3f", getRIncircle());
            System.out.println();
            System.out.printf("Радиус описанной окружности: %.3f", getRExcircle());
        }
        static int inputIntWithCheck(int min, int max) {
            boolean flag = true;
            Scanner scanner = null;
            int number = 0;
            System.out.printf("Введите целое число от %d до %d: ", min, max);
            do {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    if (input < min || input > max) {
                        System.out.println("Введёное число находится вне заданного диапазона. Ещё раз: ");
                        flag = true;
                    } else {
                        number = input;
                        flag = false;
                    }
                } else {
                    System.out.println("Вводить нужно целое число. Ещё раз: ");
                    flag = true;
                }
            } while (flag);
            return number;
        }
        static int inputIntWithCheck() {
            boolean flag = true;
            Scanner scanner = null;
            int number = 0;
            System.out.printf("Введите целое число: ");
            do {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                        number = input;
                        flag = false;
                    } else {
                    System.out.println("Вводить нужно целое число. Ещё раз: ");
                    flag = true;
                }
            } while (flag);
            return number;
        }
        static double inputDoubleWithCheck(double min, double max) {
            boolean flag = true;
            Scanner scanner = null;
            double number = 0;
            System.out.printf("Введите вещественное число от %.2f до %.2f: ", min, max);
            do {
                scanner = new Scanner(System.in);
                scanner.useLocale(Locale.US);
                String inputStr = scanner.nextLine();
                try {
                    double input = Double.parseDouble(inputStr.replace(',','.'));
                    if (input < min || input > max) {
                        System.out.println("Введёное число находится вне заданного диапазона. Ещё раз: ");
                        flag = true;
                    } else {
                        number = input;
                        flag = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Вводить нужно число. Ещё раз: ");
                    flag = true;
                }
            } while (flag);
            return number;
        }
        static double inputDoubleWithCheck() {
            boolean flag = true;
            Scanner scanner = null;
            double number = 0;
            System.out.println("Введите вещественное число: ");

            do {
                scanner = new Scanner(System.in);
                scanner.useLocale(Locale.US);
                String inputStr = scanner.nextLine();
                try {
                    double input = Double.parseDouble(inputStr.replace(',','.'));
                    number = input;
                    flag = false;
                } catch (NumberFormatException e) {
                    System.out.println("Вводить нужно число. Ещё раз: ");
                    flag = true;
                }
            } while (flag);
            return number;
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 3, обозначающее, какую группу элементов треугольника нужно вводить:");
        System.out.println("1: две стороны и угол между ними (стороны вещественные, угол задан целыми градусами и минутами дуги и вещественными секундами дуги)");
        System.out.println("2: одна сторона и два прилежащих к ней угла");
        System.out.println("3: три стороны");
        int typeOfInput = Triangle.inputIntWithCheck(1, 3);
        switch (typeOfInput) {
            case 1: {
                System.out.println("Введите две стороны и угол между ними.\nВведите первую сторону:");
                double edgeA = Triangle.inputDoubleWithCheck();
                System.out.println("Введите вторую сторону:");
                double edgeB = Triangle.inputDoubleWithCheck();
                System.out.println("Введите градусы угла:");
                int degrees = Triangle.inputIntWithCheck(0, 180);
                System.out.println("Введите минуты угла:");
                int minutes = Triangle.inputIntWithCheck(0, 60);
                System.out.println("Введите секунды угла:");
                double seconds = Triangle.inputDoubleWithCheck(0, 60);
                Triangle triangle = new Triangle(edgeA, edgeB, degrees, minutes, seconds);
                triangle.dataPrintOut();
                break;
            }
            case 2: {
                System.out.println("Введите одну сторону и два прилежащих к ней угла.\nВведите сторону: ");
                double edgeA = Triangle.inputDoubleWithCheck();
                System.out.println("Введите градусы первого угла:");
                int degrees1 = Triangle.inputIntWithCheck(0, 180);
                System.out.println("Введите минуты первого угла:");
                int minutes1 = Triangle.inputIntWithCheck(0, 60);
                System.out.println("Введите секунды первого угла:");
                double seconds1 = Triangle.inputDoubleWithCheck(0, 60);
                System.out.println("Введите градусы второго угла:");
                int degrees2 = Triangle.inputIntWithCheck(0, 180);
                System.out.println("Введите минуты второго угла:");
                int minutes2 = Triangle.inputIntWithCheck(0, 60);
                System.out.println("Введите секунды второго угла:");
                double seconds2 = Triangle.inputDoubleWithCheck(0, 60);
                Triangle triangle = new Triangle(edgeA, degrees1, minutes1, seconds1, degrees2, minutes2, seconds2);
                triangle.dataPrintOut();
                break;
            }
            case 3: {
                System.out.println("Введите три стороны треугольника.\nВведите первую сторону: ");
                double edgeA = Triangle.inputDoubleWithCheck();
                System.out.println("Введите вторую сторону:");
                double edgeB = Triangle.inputDoubleWithCheck();
                System.out.println("Введите третью сторону:");
                double edgeС = Triangle.inputDoubleWithCheck();
                Triangle triangle = new Triangle(edgeA, edgeB, edgeС);
                triangle.dataPrintOut();
                break;
            }
        }
    }
}
