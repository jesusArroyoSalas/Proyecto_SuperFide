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
public class Afiliacion {
    private String nombre_c;
    private String cedula_c;
    private String telefono_c;
    private String correo_c;
    private String direccion_c;
    
    public void Afiliacion(){}
    public void Afiliacion(String nom, String ced, String tel, String correo, String direc){
        nombre_c = nom;
        cedula_c = ced;
        telefono_c = tel;
        correo_c = correo;
        direccion_c = direc;        
    }
    public void imprimir_AF (){
    JOptionPane.showMessageDialog(null, "Nombre del cliente afiliado: "+nombre_c+" "
            + "\n Cedula del cliente: "+cedula_c+ ""
                    + "\n Telefono cliente: "+telefono_c+""
                            + "\n Correo del cliente: "+correo_c+" "
                                    + "\n Dirrecion del cliente: "+direccion_c+" "
                                            + "\n El cliente fue afiliado con exito");
    
    }
    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getCedula_c() {
        return cedula_c;
    }

    public void setCedula_c(String cedula_c) {
        this.cedula_c = cedula_c;
    }

    public String getTelefono_c() {
        return telefono_c;
    }

    public void setTelefono_c(String telefono_c) {
        this.telefono_c = telefono_c;
    }

    public String getCorreo_c() {
        return correo_c;
    }

    public void setCorreo_c(String correo_c) {
        this.correo_c = correo_c;
    }

    public String getDireccion_c() {
        return direccion_c;
    }

    public void setDireccion_c(String direccion_c) {
        this.direccion_c = direccion_c;
    }
  
    
}

