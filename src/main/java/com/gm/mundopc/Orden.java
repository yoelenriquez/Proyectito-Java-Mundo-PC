package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAXCOMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAXCOMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAXCOMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("Ha superado el maximo de : " + Orden.MAXCOMPUTADORAS + " computadoras");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden = " + this.idOrden);
        System.out.println("Cantidad de computadoras = " + this.contadorComputadoras);
        
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Computadora = " + this.computadoras[i]);
        }
    }
}
