import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    /*Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.*/
    // Capturar los precios de las unidades del producto sin iva

    System.out.println("Ingrese el valor de la unidad");
    double valorUnidad = sc.nextDouble();
    
    // Capturar numero de productos vendidos
    System.out.println("Ingrese la cantidad de productos vendidos");
    double productosVendidos =  sc.nextDouble();

    // Capturar el porcentaje de IVA aplicado a los productos vendidos
    System.out.println("Ingrese el porcentaje de IVA");
    double iva = sc.nextDouble();
    
    sc.close();
    // Plantear operacion
    double porcentajeIva = iva/ 100;
    double valorIva = (valorUnidad * productosVendidos) * porcentajeIva;
    double resultado = (valorUnidad * productosVendidos) + valorIva;
    

    // Generar respuesta
    String respuesta = ("El costo del producto con IVA es: " + resultado);
    System.out.println(respuesta);
    

    }
 
}
