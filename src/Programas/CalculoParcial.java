/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author aleca
 */
import java.util.Scanner;
public class CalculoParcial {
public static void main(String args[]){
String empleado;
double horast , tarifahora , sueldobruto , desc , sueldon;
Scanner lectura= new Scanner(System.in);
//Datos
System.out.print("Nombre de empleado:");
empleado=lectura.next();
System.out.print("Horas trabajadas:");
horast=lectura.nextDouble();
System.out.print("Tarifa por hora:");
tarifahora=lectura.nextDouble();
//Proceso
sueldobruto=horast*tarifahora;
desc=sueldobruto*0.13;
sueldon=sueldobruto-desc;
//Salida
System.out.println("Sueldo bruto:"+sueldobruto);
System.out.println("Descuento:"+desc);
System.out.println("Sueldo Neto:"+sueldon);
}
}
