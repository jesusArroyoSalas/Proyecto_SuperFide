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
    private float cupon_1 ;
    private float precio_cup;
    
    public Promo(){}
    

   
    Producto fide_P =new Producto();
    
    public void precio_promo(Producto P){
        
        cupon_1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el porcentanje del cupon a canjear"));   // Se le pide al usuario el porcentaje con numeros enteros para despues convertirlo en decimal
        
        cupon_1 = cupon_1/100;
        
              precio_cup = P.operacion() - (P.operacion()*cupon_1);
        
    }
    public void imprimir_promo(){
        if (cupon_1 != 0){
            JOptionPane.showMessageDialog(null, "El precio total con el descuento del cupon aplicado es de : "+precio_cup);
        }else{
            JOptionPane.showMessageDialog(null, "NO SE HA SIDO APLICADO NINGUN TIPO DE DESCUENTO O CUPON");
        }
    }
    

    public float getCupon_1() {
        return cupon_1;
    }

    public float getPrecio_cup() {
        return precio_cup;
    }

    public void setPrecio_cup(float precio_cup) {
        this.precio_cup = precio_cup;
    }

    public void setCupon_1(float cupon_1) {
        this.cupon_1 = cupon_1;
    }
    
    
}