/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rebajas;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Rebajas {

    public static void main(String[] args) {
       //Importo java.util.Scanner para poder pedir que el usuario introduzca datos y lo llamo respuesta.
        Scanner respuesta = new Scanner(System.in);
        
        //Declaro todos los metodos que voy a utilizar en una sola línea.
        double PrecioOriginal, PrecioDescuento, DescubrePorcentaje;
        
        System.out.print("Ingrese el precio original");
        
        PrecioOriginal = respuesta.nextDouble();
        
        System.out.print("Ingrese el precio del producto rebajado");
        
        PrecioDescuento = respuesta.nextDouble();
        //Realizo todos los cárculos en el mismo método
        DescubrePorcentaje = (((PrecioOriginal - PrecioDescuento)/PrecioOriginal)*100);
        
        System.out.println("El porcentaje de rebaja del producto es del " + DescubrePorcentaje + "%");
        
    }
    
}
