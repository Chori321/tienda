
package tienda;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        
        //OBJETOS
        Scanner cap = new Scanner(System.in);
        Producto pro = new Producto(123,"Carne Asada","Kg",100,200,10);
        
        
        
        System.out.println("Código del producto: "+pro.getCodeP());
        System.out.println("Descripción del producto: " + pro.getDescriP());
        System.out.println("Unidad de medida: "+ pro.getUnidadMedida());
        System.out.println("Cantidad de producto: "+pro.getCantidadP());
        System.out.println("Precio de compra: $"+pro.getPrecioCompra());
        System.out.println("Precio de venta: $"+pro.getPrecioVenta());
        System.out.println("Total compra: $"+pro.calculaCompra());
        System.out.println("Total venta: $"+pro.calcularVenta());
        System.out.println("Total ganancia: $"+pro.calcularGanancia());
        
        
        
    }
}
