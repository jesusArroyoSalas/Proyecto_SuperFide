/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_fide1_1;

import javax.swing.JOptionPane;

/**
 *
 * @author arroy
 */
public class Producto {
    private String nombre[];
    private String codigo[];
    private float precio[];
    private int cantidad[];
    
    
    private String nombre_p;
    private String codigo_p;
    private float precio_p;
    private int cantidad_p;
    private float precio_F = 0;
    
    public void producto(){}
    public void producto(String nom, String cod, float prec, int cant){
        nombre_p = nom;
        codigo_p = cod;
        precio_p = prec;
        cantidad_p = cant;
    }
    
    public void llenar(){       //En este proceso se llenaran los arreglos y tambien se le dará tamaño al arreglo.
        int v = 0;
        v = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos se registraran?"));
        
        nombre = new String[v];
        codigo = new String[v];
        precio = new float[v];
        cantidad = new int[v];
        
       for(int x=0; x<nombre.length; x++){      // Aquí se llenan uno a uno los arreglos
            float suma = 0;
            nombre[x] = JOptionPane.showInputDialog("Por favor digite el nombre del producto");
            codigo[x] = JOptionPane.showInputDialog("Por favor digite el codigo del producto");
            precio[x] = Float.parseFloat(JOptionPane.showInputDialog("Por favor digite el precio de una unidad del producto"));
            cantidad[x] = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la cantidad de unidades del producto"));
            
        }     
    }

    public double operacion(){
    for(int x=0; x<nombre.length; x++){
    precio_F = precio_F +(precio[x]*cantidad[x]);
    }   
    return this.precio_F;
    }

    public void imprimir_P(){
        for(int x=0; x<nombre.length; x++){
           System.out.println("------ "+ (x+1) +" PRODUCTO ------");
           System.out.println("Nombre: "+nombre[x]);
           System.out.println("Codigo: "+codigo[x]);
           System.out.println("Precio: "+precio[x]);
           System.out.println("Cntidad de unidades: "+cantidad[x]);
           System.out.println(" ");
        }
        JOptionPane.showMessageDialog(null, "Precio total SIN descuentos aplicados -->  "+precio_F);
        System.out.println("Precio total sin descuentos: "+precio_F);
    }   
    
    public double getPrecio_F() {
        return precio_F;
    }

    public void setPrecio_F(float precio_F) {
        this.precio_F = precio_F;
    }
    

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getCodigo_p() {
        return codigo_p;
    }

    public void setCodigo_p(String codigo_p) {
        this.codigo_p = codigo_p;
    }

    public float getPrecio_p() {
        return precio_p;
    }

    public void setPrecio_p(float precio_p) {
        this.precio_p = precio_p;
    }

    public int getCantidad_p() {
        return cantidad_p;
    }

    public void setCantidad_p(int cantidad_p) {
        this.cantidad_p = cantidad_p;
    }
    
}

