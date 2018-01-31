package com.company;
import java.util.Scanner;

public class Main {
    private int Skaiciai;

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.Ivedimas();
    }

    public void Ivedimas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite kiek norite irasyti skaiciu: ");
        Skaiciai = sc.nextInt();
        int[] mas = new int[Skaiciai];
        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite " + i + "-a skaiciu: ");
            mas[i]=sc.nextInt();
        }
        System.out.println("Didesni nei 100 skaiciai yra: ");
        for (int i=0; i<mas.length; i++){
            if (mas[i]>100){
                System.out.println(i + " vietoje esantis skaicius: "+mas[i]);
            }
        }
    }
}
