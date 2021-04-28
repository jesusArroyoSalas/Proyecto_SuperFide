/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_fide1_1;

/**
 * PROYECTO DE INTRODUCCION A LA PROGRAMACION
 * Profesora: Christy Aguero Valverde
 * Integreantes: Simon Osorio Gutierrez
                 Esteban Ugalde Rojas
 *               Jesus Arroyo Salas
 */
import javax.swing.JOptionPane;
public class Super_Fide1_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Por favor digite su nombre");
        String cedula = JOptionPane.showInputDialog("Por favor digite su cedula");
        String telefono = JOptionPane.showInputDialog("Por favor digite su telefono");
        String codigo = JOptionPane.showInputDialog("Por favor digite su codigo");
        
        Empleado fide = new Empleado();
        fide.Empleado(nombre, cedula, telefono, codigo);
        
        int op;
        
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"***Bienvenid@ "+nombre+" al programa para la atencioan al cliente***"
                + "\n Digite el numero segun la opcion que desee"
                + "\n1 Afiliar cliente"
                + "\n2 Compra de productos"
                + "\n3 Validar cupon"
                + "\n4 Encuesta"
                + "\n5 Factutar"
                + "\n0 Salir"));
        switch(op) {
            case 1:
                String nombre_c = JOptionPane.showInputDialog("Por favor digite el nombre del cliente");
                String cedula_c = JOptionPane.showInputDialog("Por favor digite el numero de cedula del cliente");
                String telefono_c = JOptionPane.showInputDialog("Por favor digite el numero de telefono del cliente");
                String correo_c = JOptionPane.showInputDialog("Por favor digite el correo electronico del cliente");
                String direccion_c = JOptionPane.showInputDialog("Por favor digite la direccion del cliente ");
                
                Afiliacion fide_A = new Afiliacion();
                fide_A.Afiliacion(nombre_c, cedula_c, telefono_c, correo_c, direccion_c);
                
                // code block
            break;
            case 2:
                Producto fide_P =new Producto();
                fide_P.llenar();
                
                
            break;
            case 3:
                Promo fide_promo = new Promo();
                fide_promo.precio_promo();                       
                // code block
            break;
            case 4:
                encuesta uno=new encuesta();
                uno.getpregu_1();
                uno.getpregu_2();   
                uno.getpregu_3();
                // code block
            break;
            case 5:
                facturar fide_Fac  = new facturar();
                fide_Fac.facturar();
                // code block
            break;
            case 0:
                // code block
            break;
            default:
             // code block
        }
        }while(op!=0);
    }
    
}

