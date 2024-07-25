/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1p2;

/**
 *
 * @author Jorge Aguirre
 */
public class RentItem {
    // Atributos
    private int codigoDelItem;
    private String nombreDeItem;
    private double rentaDeItem;

    // Cosntrutctor
    public RentItem(int codigoDelItem, String nombreDeItem, double rentaDeItem) {
        this.codigoDelItem = codigoDelItem;
        this.nombreDeItem = nombreDeItem;
        this.rentaDeItem = rentaDeItem;
    }

    // Getters y Setters
    public void setCodigoDeItem(int codigoDelItem) {
        this.codigoDelItem = codigoDelItem;
    }
    public void setNombreDeItem(String nombreDeItem) {
        this.nombreDeItem = nombreDeItem;
    }
    public void setRentalPrice(double rentalPrice) {
        this.rentaDeItem = rentaDeItem;
    }
    
    
    public int getCodigoDelItem() {
        return codigoDelItem;
    }
    public String getNombreDeItem() {
        return nombreDeItem;
    }
    public double getRentaDeItem() {
        return rentaDeItem;
    }

    
    
    //Aqui le doy override al toString para imprimir los atributos
    @Override
    public String toString() {
        return "El codigo del item: " + codigoDelItem + "\nEl nombre del Item: " + nombreDeItem + "\n El precio de renta del item es: " + rentaDeItem;  
    }
    
    public double pagoRenta(int dias){
    
    
        return 0;
    }
    
    public String subMenu(){
        System.out.println("Estas son las opciones disponible para el item:");
        System.out.println();
        return null;
    }
    
    void ejecutarOpcion(int opcion){
        if(opcion == 1){
            toString();
        }
        else{}
        System.out.println("Opcion no valida");
    }
    
}
