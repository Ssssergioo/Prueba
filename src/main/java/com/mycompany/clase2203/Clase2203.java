/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2203;

/**
 *
 * @author User
 */
//tenemos un tanque de agua, tiene que tener un nivel de temp x segun su capacidad y las condiciones del tiempo
//tiene que tener una temp diferente en los distintos manana tarde noche y cada tiene peligroso, normal, muy bueno momentos del dia y su temperatura actual
//si esta alto warnig y si esta a temp normal too bueno
import java.util.Scanner;
public class Clase2203 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //manana
        int tempPeligrosaManana = 30;
        int tempBuenaManana = 25;
        int tempMuyBuenaManana = 20;
        
        //tarde
        int tempPeligrosaTarde = 50;
        int tempBuenaTarde = 40;
        int tempMuyBuenaTarde = 30;
        
        //noche
        int tempPeligrosaNoche = 20;
        int tempBuenaNoche = 15;
        int tempMuyBuenaNoche = 10;
        
        
        
        try {
        System.out.println("Vamos a medir la condicion del tanque dependiendo de la hora del dia");
        System.out.println("Ingrese el momento del dia que nos encontramos, manana, tarde o noche");
        String momento = sc.nextLine();
        System.out.println("Ahora ingrese la temperatura actual del tanque");
        int temp = sc.nextInt();
        
    switch (momento) {
        case "manana" -> {
            if (temp >= tempPeligrosaManana) {
                System.out.println("La temperatura es muy alta para la mañana, PELIGRO");
            } else if (temp <= tempPeligrosaManana && temp >= tempBuenaManana) {
                System.out.println("La temperatura es buena para la mañana");
            } else if (temp <= tempBuenaManana) {
                System.out.println("La temperatura es muy buena para la mañana");
            }   }
        case "tarde" -> {
            if (temp >= tempPeligrosaTarde) {
                System.out.println("La temperatura es muy alta para la tarde, PELIGRO");
            } else if (temp <= tempPeligrosaTarde && temp >= tempBuenaTarde) {
                System.out.println("La temperatura es buena para la tarde");
            } else if (temp< tempBuenaTarde) {
                System.out.println("La temperatura es muy buena para la tarde");
            }   }
        case "noche" -> {
            if (temp >= tempPeligrosaNoche) {
                System.out.println("La temperatura es muy alta para la Noche, PELIGRO");
            } else if (temp <= tempPeligrosaNoche && temp >= tempBuenaNoche) {
                System.out.println("La temperatura es buena para la Noche");
            } else if (temp <= tempBuenaNoche) {
                System.out.println("La temperatura es muy buena para la Noche");
            }   }
        default -> System.out.println("Ha ingresado un valor incorrecto para el momento del día.");
    }
} catch (Exception e) {
    System.out.println("Ha ingresado un valor que no corresponde al tipo de dato de la temperatura");
}
    }
}
