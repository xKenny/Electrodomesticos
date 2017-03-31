/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *clase hija de electrodomesticos
 * @author Duvan
 */
public class Lavadora extends Electrodomesticos{
    /*atributos de la clase*/
    protected double carga;
    /*constructor que define valores por defecto*/
    public Lavadora(){
        this.carga=5.0;
    }
    /*constructor que recibe solo precio y peso*/
    public Lavadora(double precio, double peso) {
        super(precio, peso);
    }
    /*construcctor que recibe todos los atributos*/ 
    public Lavadora(double precio, String color, String consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
    /*metodo de la clase padre para calcular el precico final*/
    @Override
    public double precioFinal() {
        double consuPreci=0.0, pesoPreci=0.0;
        switch(consumo){
            case "A":
                consuPreci=100.0;
                break;
            case "B":
                consuPreci=80.0;
                break;
            case "C":
                consuPreci=60.0;
                break;
            case "D":
                consuPreci=50.0;
                break;
            case "E":
                consuPreci=30.0;
                break;
            case "F":
                consuPreci=10.0;
                break;
        }
        if(peso>=0.0&&peso<=19.0)
            pesoPreci=10.0;
        if(peso>=20.0&&peso<=49.0)
            pesoPreci=50.0;
        if(peso>=50.0&&peso<=79.0)
            pesoPreci=80.0;
        if(peso>=80.0)
            pesoPreci=100.0;
        if(carga>30.0)
            pesoPreci+=50;
        return super.precioFinal()+consuPreci+pesoPreci;
     }
    
    public double getCarga() {
        return carga;
    }
    
   
}
