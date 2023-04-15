package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculation res = new Calculation();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение в постфиксной форме: ");
        String str = in.nextLine();
        System.out.println(res.calc(str));
    }
}