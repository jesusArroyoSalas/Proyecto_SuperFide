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
public class Promo {
    private double cupon_1 = 0.10;
    private double cupon_2 = 0.20;
    private int opcion;
    private double precio_cup;
    
    public Promo(){}
    

   
    Producto fide_P =new Producto();
    
    public void precio_promo(){
        int opcion_p = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si el cupon a aplicar es el de 10% de descuento"
                        + "\n ó presione el 2 si el cupon a aplicar es del 20%"));
        
        if(opcion_p==1){
            precio_cup = fide_P.operacion() -(fide_P.operacion()*cupon_1);
        }else if(opcion_p==2){
            precio_cup = fide_P.operacion() -(fide_P.operacion()*cupon_2);
        }
    }
    public void imprimir_promo(){
        JOptionPane.showMessageDialog(null, "El precio total con el descuento del cupon aplicado es de : "+precio_cup);
    }
    

    public double getCupon_1() {
        return cupon_1;
    }

    public void setCupon_1(double cupon_1) {
        this.cupon_1 = cupon_1;
    }

    public double getCupon_2() {
        return cupon_2;
    }

    public void setCupon_2(double cupon_2) {
        this.cupon_2 = cupon_2;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    
}

