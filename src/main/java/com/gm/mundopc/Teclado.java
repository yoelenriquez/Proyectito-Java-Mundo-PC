package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        return super.toString() + " Teclado{" + "idTeclado=" + idTeclado + '}';
    }
}
