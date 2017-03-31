/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *clase hija de electrodomesitcos
 * @author Duvan
 */
public class Television extends Electrodomesticos {
    /*atributos de la clase*/
    protected double resolucion;
    protected boolean tdt;
    /*constructor que define valores por defecto*/
    public Television() {
        this.resolucion=20;
        this.tdt=false;
    }
    /*constructor que recibe solo precio y peso*/
    public Television(double precio, double peso) {
        super(precio, peso);
    }
    /*constructor que recibe todos los atributos*/
    public Television(double precio, String color, String consumo, double peso, double resolucion, boolean tdt) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }
    /*metodo de la clase padre para calcular el precio*/
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
        if(resolucion>40)
            pesoPreci +=(super.precioFinal()+consuPreci+pesoPreci)*0.30;
        if(tdt==true)
            consuPreci +=50;
        return super.precioFinal()+consuPreci+pesoPreci;
    }
    /*metodos getter and setter*/
    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }
    
    
    
}
