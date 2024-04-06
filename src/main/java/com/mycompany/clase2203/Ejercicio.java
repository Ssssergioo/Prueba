/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase2203;

/**
 *
 * @author User
 */
import java.util.Scanner;

//ingresar numero de cedula, nombre y salario, cargar en un array precargado, buscar y si no existe diga "Usuario no existe". Luego se multiplica el salario por las horas trabajadas
//ingrese cantidad de horas 
//cuantas horas trabajo para ganar ese salario
//try catch por si no existe
public class Ejercicio {
    public static void main(String[] args){
   String[][] Empleados = { 
    {"Sergio", "4878709", "500000"},
    {"Jesus", "1231232", "60000"},
    {"Pepe", "400000", "20000"}
};

   //System.out.print(Empleados[2][0]);
   int horasTrabajo, salario, sueldoFinal;
   String cedula;
   Scanner sc = new Scanner(System.in);
   System.out.print("Ingrese un numero de cedula para buscarlo en la base de datos: ");
   boolean existe = true;
   cedula = sc.nextLine();
   
      for(int i=0; i<Empleados.length; i++){
       if(cedula.equals(Empleados[i][1])){
           System.out.print("Usuario encontrado, ingrese las horas trabajadas en la semana: "); 
           horasTrabajo = sc.nextInt();
           salario = Integer.parseInt(Empleados[i][2]);
           sueldoFinal = salario * horasTrabajo;
           System.out.println(Empleados[i][0] + " ha recibido de salario: " + sueldoFinal + "Gs en la semana");
           existe = false;
       }
   }
        if(existe){
            System.out.println("El empleado no existe");
        }
    }
}
