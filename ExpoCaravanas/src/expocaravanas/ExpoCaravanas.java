/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class ExpoCaravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int t;
        int entradas;
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);
        while (n < 3) {
            System.out.println("1.\tMostrar número de entradas libres"
                    + "\n2.\tVender entradas"
                    + "\n3.\tCerrar programa");
            n = sc.nextInt();

            if (n != 3) {
                switch (n) {
                    case 1:
                        System.out.println(principal);
                        System.out.println(compraventa);
                        System.out.println(vip);
                        break;
                    case 2:
                        System.out.println("¿Que tipo de entras desea comprar?"
                                + "\n1.\tEntras principales"
                                + "\n2.\tEntras en la Zona Compra y Venta"
                                + "\n3.\tEntras vip");
                        t = sc.nextInt();
                        switch (t) {
                            case 1:
                                if (principal.getEntradas() <= 0) {
                                    System.out.println("Ya no quedan entradas");
                                } else {
                                    System.out.println(principal);
                                    System.out.println("¿Cuantas entradas desea comprar?");
                                    entradas = sc.nextInt();
                                    if (entradas > principal.getEntradas()) {
                                        System.out.println("No hay existencias disponibles");
                                    } else if (entradas <= principal.getEntradas()) {
                                        principal.ventaentradas(entradas);

                                    }
                                }

                                break;
                            case 2:
                                if (compraventa.getEntradas() <= 0) {
                                    System.out.println("Ya no quedan entradas");
                                } else {
                                    System.out.println(compraventa);
                                    System.out.println("¿Cuantas entradas desea comprar?");
                                    entradas = sc.nextInt();
                                    if (entradas > compraventa.getEntradas()) {
                                        System.out.println("No hay existencias disponibles");
                                    } else if (entradas <= compraventa.getEntradas()) {
                                        compraventa.ventaentradas(entradas);

                                    }
                                }
                                break;
                            case 3:
                                if (vip.getEntradas() <= 0) {
                                    System.out.println("Ya no quedan entradas");
                                } else {
                                    System.out.println(vip);
                                    System.out.println("¿Cuantas entradas desea comprar?");
                                    entradas = sc.nextInt();
                                    if (entradas > vip.getEntradas()) {
                                        System.out.println("No hay existencias disponibles");
                                    } else if (entradas <= vip.getEntradas()) {
                                        vip.ventaentradas(entradas);

                                    }
                                }
                                break;
                        }

                }
            }
        }
    }
}
