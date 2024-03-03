package application;

import boardGame.Position;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        Position testPosition;

        System.out.println("Ditite a posição");
        System.out.print("x:");
        int x = get.nextInt();
        get.nextLine();

        System.out.print("y:");
        int y = get.nextInt();
        get.nextLine();

        testPosition = new Position(x,y);

        System.out.println(testPosition);

    }
}
