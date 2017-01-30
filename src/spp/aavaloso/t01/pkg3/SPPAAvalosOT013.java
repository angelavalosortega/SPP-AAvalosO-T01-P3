/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.t01.pkg3;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOT013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double x1,x2,y1,y2,dis,x,y;
       Scanner kb=new Scanner(System.in);
        System.out.println("Calculadora de distancia entre dos coordenadas");
        System.out.println("Introduzca los datos de la primer coordenada");
        System.out.println("X1");
        x1=kb.nextDouble();
        System.out.println("Y1");
        y1=kb.nextDouble();
        System.out.println("Introduzca los datos de la segunda coordenada");
        System.out.println("X2");
        x2=kb.nextDouble();
        System.out.println("Y2");
        y2=kb.nextDouble();
        x=Math.pow(x1-x2,2);
        y=Math.pow(y1-y2,2);
        dis=Math.sqrt(y+x);
        System.out.println("La distancia entre sus dos coordenadas es de "+dis);
        
    }
    
}
