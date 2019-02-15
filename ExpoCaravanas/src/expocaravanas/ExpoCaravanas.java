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
Zona principal=new Zona(1000);
Zona compraventa=new Zona (200);
Zona vip =new Zona (25);
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

        
                        break;
                }
            }
        }
    }
}