/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.MostrarCompra; 
import java.util.Scanner; 
/**
 *
 * @author Personal
 */
public class ValorCompra {
         
    //------------------------------Main 

    public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in); 

    System.out.println("Digite el valor de su compra:"); 

    int valorCompra = sc.nextInt(); 

    MostrarCompra compras = new MostrarCompra(valorCompra); 

    compras.Recibo(); 

  } 
}
