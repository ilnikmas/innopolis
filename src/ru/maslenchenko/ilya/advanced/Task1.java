package ru.maslenchenko.ilya.advanced;

import java.util.Scanner;

/**
 * 1. Задача о треугольниках.
 * Дано: На вход программы подаётся число 1, 2 или 3, обозначающее, какую группу элементов треугольника пользователь будет вводить:
 *    1: две стороны и угол между ними (стороны вещественные, угол задан целыми градусами и минутами дуги и вещественными секундами дуги)
 * 	  2: одна сторона и два прилежащих к ней угла
 * 	  3: три стороны
 */

public class Task1{
    private static class Triangle {
        double edgeA, edgeB, edgeC; //Стороны треугольника
        double angle_a, angle_b, angle_c; //Углы треугольника
        //три стороны
        private Triangle(double _edgeA, double _edgeB, double _edgeC) {
            edgeA = _edgeA;
            edgeB = _edgeB;
            edgeC = _edgeC;

        }
        //две стороны и угол между ними
        private Triangle(double _edgeA, double _edgeB, int _degrees, int _minutes, double _seconds) {
            edgeA = _edgeA;
            edgeB = _edgeB;
            angle_c = angleInRadians(_degrees, _minutes, _seconds);
            edgeC = Math.sqrt(edgeA * edgeA + edgeB * edgeB - 2 * edgeA * edgeB * Math.cos(angle_c));
        }
        //одна сторона и два прилежащих к ней угла
        private Triangle(double _edgeA, int _degrees1, int _minutes1, double _seconds1, int _degrees2, int _minutes2, double _seconds2) {
            edgeA = _edgeA;
            angle_b = angleInRadians(_degrees1, _minutes1, _seconds1);
            angle_c = angleInRadians(_degrees2, _minutes2, _seconds2);
            angle_a = Math.PI - (angle_b + angle_c);
            edgeB = edgeA * Math.sin(angle_b) / Math.sin(angle_a);
            edgeC = edgeB * Math.sin(angle_c) / Math.sin(angle_b);
        }
        private double getPerimeter() {
            return edgeA + edgeB + edgeC;
        }
        private double angleInRadians(int _degrees, int _minutes, double _seconds) {
            double radian;
            radian = _degrees * Math.PI / 180 + _minutes * Math.PI / (180 * 60) + _seconds * Math.PI / (180 * 3600);
            return radian;
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
    }
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 3, обозначающее, какую группу элементов треугольника нужно вводить:");
        System.out.println("1: две стороны и угол между ними (стороны вещественные, угол задан целыми градусами и минутами дуги и вещественными секундами дуги)");
        System.out.println("2: одна сторона и два прилежащих к ней угла");
        System.out.println("3: три стороны");
        try (Scanner scanner = new Scanner(System.in)) {
            int typeOfInput = Integer.parseInt(scanner.next());
            switch (typeOfInput) {
                case 1: {
                    System.out.println("Введите две стороны и угол между ними.\nВведите первую сторону:");
                    double edgeA = Double.parseDouble(scanner.next());
                    System.out.println("Введите вторую сторону:");
                    double edgeB = Double.parseDouble(scanner.next());
                    System.out.println("Введите градусы угла:");
                    int degrees = Integer.parseInt(scanner.next());
                    System.out.println("Введите минуты угла:");
                    int minutes = Integer.parseInt(scanner.next());
                    System.out.println("Введите секунды угла:");
                    double seconds = Double.parseDouble(scanner.next());
                    Triangle triangle = new Triangle(edgeA, edgeB, degrees, minutes, seconds);
                    triangle.dataPrintOut();
                    break;
                }
                case 2: {
                    System.out.println("Введите одну сторону и два прилежащих к ней угла.\nВведите сторону: ");
                    double edgeA = Double.parseDouble(scanner.next());
                    int degrees1 = Integer.parseInt(scanner.next());
                    int minutes1 = Integer.parseInt(scanner.next());
                    double seconds1 = Double.parseDouble(scanner.next());
                    int degrees2 = Integer.parseInt(scanner.next());
                    int minutes2 = Integer.parseInt(scanner.next());
                    double seconds2 = Double.parseDouble(scanner.next());
                    Triangle triangle = new Triangle(edgeA, degrees1, minutes1, seconds1, degrees2, minutes2, seconds2);
                    triangle.dataPrintOut();
                    break;
                }
                case 3:  {
                    System.out.println("Введите три стороны: ");
                    double edgeA = Double.parseDouble(scanner.next());
                    double edgeB = Double.parseDouble(scanner.next());
                    double edgeС = Double.parseDouble(scanner.next());
                    Triangle triangle = new Triangle(edgeA, edgeB, edgeС);
                    triangle.dataPrintOut();
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода");
            e.printStackTrace();
        }


    }
}
