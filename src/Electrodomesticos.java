/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *clase padre con atributos de electrodomesticos
 * @author Duvan y David
 */
public abstract class Electrodomesticos implements Interface {
    protected double precio;
    protected Color color;
    protected Consumo consumo;
    protected double peso;
    
    /*constructor valores por defecto*/
    public Electrodomesticos(){
        this.precio=100.0;
        this.color=Color.blanco;
        this.consumo=Consumo.f;
        this.peso=5.0;
}
    /*constructor que solo recibe precio y peso*/
    public Electrodomesticos(double precio, double peso){
        this.precio=precio;
        this.peso=peso;
    }
    /*constructor que recibe todos los atributos*/
    public Electrodomesticos(double precio, Color color, Consumo consumo, double peso){
       
        /*atributos de la clase*/
        this.precio=precio;
        this.color= color;
        this.consumo=consumo;
        this.peso=peso;
    }
    /*metodo que retorna si el consumo energetico es valido*/
    @Override
    public boolean comprobarConsumoEnergetico(){
        return (!"a".equals(consumo)||!"b".equals(consumo)||!"c".equals(consumo)||!"d".equals(consumo)||!"e".equals(consumo)||!"f".equals(consumo));
    }
    /*metodo que verifica si el color es valido*/
    @Override
    public  boolean comprobarColor(){
        return true;
    }
    /*metodo que calcula el precio final del producto*/
    @Override
    public double precioFinal(){
        return precio;
    }
    /*metodos getter and setter*/
    public double getPrecio() {
        return precio;
    }

    public Color getColor() {
        return color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }
    
}