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
public class Empleado {
    private String nombre_e;
    private String cedula_e;
    private String telefono_e;
    private String codigo_e;
    
    public void Empleado(){}
    public void Empleado(String nom, String ced, String tel,String cod){
        nombre_e=nom;
        cedula_e=ced;
        telefono_e=tel;
        codigo_e=cod;
    }
    
    public void imprimir_E(){
    JOptionPane.showMessageDialog(null, "Nombre del empleado: "+nombre_e+" "
            + "\n Cedula del empleado: "+cedula_e+ ""
                    + "\n Telefono empleado: "+telefono_e+""
                            + "\n CODIGO del empleado: "+codigo_e);
    
    }

    public String getNombre_e() {
        return nombre_e;
    }

    public void setNombre_e(String nombre_e) {
        this.nombre_e = nombre_e;
    }

    public String getCedula_e() {
        return cedula_e;
    }

    public void setCedula_e(String cedula_e) {
        this.cedula_e = cedula_e;
    }

    public String getTelefono_e() {
        return telefono_e;
    }

    public void setTelefono_e(String telefono_e) {
        this.telefono_e = telefono_e;
    }
    
    
}

