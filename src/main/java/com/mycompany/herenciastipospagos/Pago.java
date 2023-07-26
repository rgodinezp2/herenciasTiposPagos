package com.mycompany.herenciastipospagos;

import java.time.LocalDate;


public class Pago {
    protected int monto;
    protected String persona;
    protected LocalDate fecha;
    protected String metodoPago;
   
    public Pago(int monto, String persona, LocalDate fecha, String metodoPago){
    this.monto = monto;
    this.persona = persona;
    this.fecha = fecha;
    this.metodoPago = metodoPago;
    }

    public int getMonto() {
        return monto;
    }

    public String getPersona() {
        return persona;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
   
    
    
    
    public void Pagar(){    
        System.out.print("Te pago...");
    }
}
