/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

/**
 *
 * @author adria
 */
public class Zona {
    private int entradas;

    public Zona() {
    }

    public Zona(int entrada) {
        this.entradas = entrada;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
     
    public void ventaentradas(){
        if (entradas==0){
            System.out.println("No quedan entradas.");
        }
        
    }
    @Override
    public String toString(){
        return "Estas son las entradas existentes: "+this.entradas;
    }
}
