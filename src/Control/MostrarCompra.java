/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Personal
 */
public class MostrarCompra {
    private final int valorCompra; 

//-----------------------Constructor 

    public MostrarCompra(int valor_Compra){ 

        valorCompra = valor_Compra; 

    } 

    //----------------------Métodos 

    public void Recibo(){ 

        double descuento = 0.0; 

            if (this.valorCompra >= 100000 && this.valorCompra <= 500000) { 

                descuento = 0.05; 

            } else if (this.valorCompra > 500000) { 

                descuento = 0.1; 

            } 

        int valorTotal; 

        double valorDescuento = this.valorCompra * descuento; 

        double netoAPagar = this.valorCompra - valorDescuento; 

            System.out.println("Valor de la compra: $" + this.valorCompra +" " +"pesos"); 

            System.out.println("Descuento obtenido: $" + valorDescuento + " "+"pesos"); 

            System.out.println("Neto a pagar: $" + netoAPagar +" "+"pesos"); 

    } 
}
