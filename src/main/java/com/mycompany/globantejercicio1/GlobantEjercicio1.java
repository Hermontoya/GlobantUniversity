/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.globantejercicio1;

import java.util.Scanner;

/**
 *
 * @author hernan
 */
public class GlobantEjercicio1 {

    public static void main(String[] args) {
        System.out.println("Ejercicios guia 1");
        
        char letra;
        int num;
        String apellidos;
        boolean bandera;
        
        letra = 'a';
        num = 5;
        apellidos = "Montoya Solarte";
        bandera = true;
        
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("");
        System.out.println("Declaracion de variables: ");
        System.out.println("letra = "+ letra +", num = " + num + ", apellidos = " + apellidos + ", bandera = " + bandera + ".");
        System.out.println("********************************************************************");
        System.out.println("");
        
        boolean flag = false;
        
        System.out.println("flag = " + flag);
        System.out.println("********************************************************************");
        System.out.println("");
        
        System.out.println("Deteccion de errores: ");
        String nombre;
        boolean bandera2;
        char charte;
        
        int numero = 48;
        double decimales = 3.55;
        boolean bandera3 = false;
        System.out.println("********************************************************************");
        System.out.println("");
        
        System.out.println("Uso de operadores: ");
        int suma = 1 + 2;
        System.out.println("suma = 1 + 2 = " + suma);
        
        double num1 = 2.45;
        double num2 = 10;
        boolean mayor = num2 >= num1;
        
        System.out.print("mayor = " + mayor);
        
        num2++;
        
        System.out.println(", num2 = " + num2);
        
        System.out.println("********************************************************************");
        System.out.println("");
        
        System.out.println("Entrada de datos: ");
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese unicamente un numero entero:");
        int numerico = leer.nextInt();
        
        System.out.println("Ingrese unicamente un numero con decimales: (Usar la coma)");
        double numeroConDecimal = leer.nextDouble();
        
        System.out.println("Ingrese unicamente un numero con decimales: (Usar la coma y no el punto como en el codigo)");
        float numeroConDecimal2 = leer.nextFloat();
        System.out.println("numerico = "+ numerico +", numero con decimal = " + numeroConDecimal + ", numero con decimal 2 = " + numeroConDecimal2);
        System.out.println("********************************************************************");
        System.out.println("");
        
        System.out.println("Deteccion de errores:");
        System.out.println("Ingresa tu nombre: ");
        leer.nextLine();
        String nombreSuyo = leer.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edadSuya = leer.nextInt();
        
        System.out.println(nombreSuyo + " tiene " + edadSuya + " anios");
        System.out.println("********************************************************************");
        System.out.println("");
        
        System.out.println("Pedir numeros y saber si alguno es mayor de 25:");
        
        System.out.println("Ingresse el primer numero:");
        int pedirNum1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int pedirNum2 = leer.nextInt();
        
        if (pedirNum1 > 25){
            System.out.println("El primer numero es mayor a 25");
        } else if (pedirNum2 > 25){
            System.out.println("El segundo numero es mayor a 25");
        } else{
            System.out.println("Ningun numero es mayor a 25");
        }
        System.out.println("********************************************************************");
        System.out.println("");
        
        System.out.println("Ejercicio motor:");
        System.out.println("");
        System.out.println("Opciones de bombas");
        System.out.println("1. Bomba de agua.");
        System.out.println("2. Bomba de gasolina.");
        System.out.println("3. Bomba de hormigon.");
        System.out.println("4. Bomba de pasta alimenticia.");
        System.out.println("");
        
        System.out.println("Ingrese la opcion de la bomba que desea:");
        int opcion = leer.nextInt();
        
        System.out.println("");
        switch (opcion){
            case 1:
                System.out.println("Usted escogio la opcion " + opcion + " bomba de agua");
                break;
            case 2:
                System.out.println("Usted escogio la opcion " + opcion + " bomba de gasolina");
                break;
            case 3:
                System.out.println("Usted escogio la opcion " + opcion + " bomba de hormigon");
                break;
            case 4:
                System.out.println("Usted escogio la opcion " + opcion + " bomba de pasta alimenticia");
                break;
            default:
                System.out.println("Usted no selecciono una opcion valida");
        }
        System.out.println("********************************************************************");
        System.out.println("");
        
        System.out.println("Ciclos repetitivos: While");
        
        String respuesta = "s";
        leer.nextLine();
        
        while(respuesta.equalsIgnoreCase("s")){
            System.out.println("Desea continuar? s/n");

            respuesta = leer.nextLine();
        }
        System.out.println("********************************************************************");
        System.out.println("");
        
        Double nota;
        
        System.out.println("Ingrese la nota");
        nota = leer.nextDouble();
        
        while(nota < 0 || nota > 10){
            System.out.println("La nota no es valida, intente de nuevo");
            System.out.println("Ingrese la nota");
            nota = leer.nextDouble();
        }
        System.out.println("********************************************************************");
        System.out.println("");
        
        Double number;
        int contad = 20;
        int sumas = 0;
        
        do{
            System.out.println("Ingrese un numero para sumar");
            number = leer.nextDouble();
            if (number == 0){
                sumas += number;
                contad = 0;
                System.out.println("Se capturo el numero cero.");
                System.out.println("Contador = " + contad);
            }else if(number < 0){
                contad -= 1;
                System.out.println("Contador = " + contad);
            }else{
                sumas += number;
                contad -= 1;
                System.out.println("Contador = " + contad);
            }
        }while(contad > 0);
        System.out.println("El valor de la suma es: " + sumas);
        System.out.println("********************************************************************");
        System.out.println("");
        
    
        
        
        int n,m,l,k;
        System.out.println("Ingrese 4 numeros seguidos de enter");
        
        Scanner sc = new Scanner (System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        l = sc.nextInt();
        k = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i == 0){
                System.out.print(n + " ");
                System.out.print("*");
            }else{
                System.out.print("*");
            }
        }
        System.out.println("");
        
        for (int i = 0; i < m; i++) {
            if (i == 0){
                System.out.print(m + " ");
                System.out.print("*");
            }else{
                System.out.print("*");
            }
        }
        System.out.println("");
       
        for (int i = 0; i < l; i++) {
            if (i == 0){
                System.out.print(l + " ");
                System.out.print("*");
            }else{
                System.out.print("*");
            }
        }
        System.out.println("");
        
        for (int i = 0; i < k; i++) {
            if (i == 0){
                System.out.print(k + " ");
                System.out.print("*");
            }else{
                System.out.print("*");
            }
        }
        System.out.println("");
        
        System.out.println("********************************************************************");
        System.out.println("");
    }
}
