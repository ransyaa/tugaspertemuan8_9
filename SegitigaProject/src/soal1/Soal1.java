package soal1;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi kedua: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi ketiga: ");
        double side3 = input.nextDouble();
        
        System.out.print("Masukkan warna: ");
        String color = input.next();
        
        System.out.print("Apakah segitiga diisi? (true/false): ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Apakah diisi? " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
}
