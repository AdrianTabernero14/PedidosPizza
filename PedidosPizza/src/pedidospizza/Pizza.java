/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidospizza;

/**
 *
 * @author adria
 */
public class Pizza {
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    private String tipo, tamaño, estado;

    public Pizza() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
        
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

    public void Sirve() {

        if (this.estado.equals("pedida")) {
            estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }

    }

    @Override
    public String toString() {
        return "pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
    }
}
