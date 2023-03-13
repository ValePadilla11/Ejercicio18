/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;
public class Ejercicio18 {

    public static void main(String[] args) {
        double x,y,z,u,r,n;
        
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Codigo del empleado:");
        String c = entrada.next();
        
        System.out.print("Nombre del empleado:");
        String w = entrada.next();        

        System.out.println("Ingrese el numero de horas trabajadas al mes:");
        x = entrada.nextDouble();
        
        System.out.println("Ingrese el precio por hora:");
        y = entrada.nextDouble();
                
        System.out.println("Ingrese el porcentaje de retencion en la fuente:");
        z = entrada.nextDouble();
        
        u = x * y;
        r = u*(z/100);
        n = u - r;

        System.out.println("Código: "+ c);
        System.out.println("Nombre: "+ w);        
        System.out.println("El salario bruto es: "+(long) u);
        System.out.println("El salario neto es: "+(long) n);
    }
    
}