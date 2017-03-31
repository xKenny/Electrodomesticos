
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan y David
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Electrodomesticos[] venta= new Electrodomesticos[10];
        venta[0]= new Lavadora(200.0,"negro","B",20.0,10.0);
        System.out.println("El precio del producto 1 es:");
        System.out.println(venta[0].precioFinal()+" EUROS");
        venta[1]= new Lavadora(220.0,"rojo","A",21.0,12.0);
        System.out.println("El precio del producto 2 es:");
        System.out.println(venta[1].precioFinal()+" EUROS");
        venta[2]= new Television(120.0,"negro","C",15.0,20.0,true);
        System.out.println("El precio del producto 3 es:");
        System.out.println(venta[2].precioFinal()+" EUROS");
        venta[3]= new Lavadora(210.0,"gris","D",18.0,8.0);
        System.out.println("El precio del producto 4 es:");
        System.out.println(venta[3].precioFinal()+" EUROS");
        venta[4]= new Lavadora(230.0,"azul","A",25.0,12.0);
        System.out.println("El precio del producto 5 es:");
        System.out.println(venta[4].precioFinal()+" EUROS");
        venta[5]= new Lavadora(180.0,"blanco","F",20.0,8.0);
        System.out.println("El precio del producto 6 es:");
        System.out.println(venta[5].precioFinal()+" EUROS");
        venta[6]= new Television(100.0,"azul","E",10.0,15.0,false);
        System.out.println("El precio del producto 7 es:");
        System.out.println(venta[6].precioFinal()+" EUROS");
        venta[7]= new Television(110.0,"blanco","A",12.0,16.0,false);
        System.out.println("El precio del producto 8 es:");
        System.out.println(venta[7].precioFinal()+" EUROS");
        venta[8]= new Television(120.0,"negro","F",18.0,20.0,true);
        System.out.println("El precio del producto 9 es:");
        System.out.println(venta[8].precioFinal()+" EUROS");
        venta[9]= new Lavadora(250.0,"gris","E",28.0,15.0);
        System.out.println("El precio del producto 10 es:");
        System.out.println(venta[9].precioFinal()+" EUROS");
        
        System.out.println("el precio total de venta de televisores es:");
        System.out.println(venta[2].precioFinal()+venta[6].precioFinal()+venta[7].precioFinal()+venta[8].precioFinal()+" EUROS");
        System.out.println("el precio total de venta de lavadoras es:");
        System.out.println(venta[0].precioFinal()+venta[1].precioFinal()+venta[3].precioFinal()+venta[4].precioFinal()+venta[5].precioFinal()+venta[9].precioFinal()+" EUROS");
        
        System.out.println("el precio total de venta es:");
        System.out.print(venta[0].precioFinal()+venta[1].precioFinal()+venta[2].precioFinal()+venta[3].precioFinal()+venta[4].precioFinal()+venta[5].precioFinal()+venta[6].precioFinal()+venta[7].precioFinal()+venta[8].precioFinal()+venta[9].precioFinal()+" EUROS");
        
    }
    
}
