/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_fide1_1;

/**
 *
 * @author arroy
 */
public class facturar {
    Empleado fide = new Empleado();
     
    Afiliacion fide_A = new Afiliacion();
    
    Producto fide_P =new Producto();
    
    Promo fide_promo = new Promo();
    
    public facturar (Empleado la_fide, Afiliacion la_af, Producto la_prod, Promo la_prom){
        fide = la_fide;
        fide_A = la_af;
        fide_P = la_prod;
        fide_promo = la_prom;
    }
    
    public void facturar(){
    fide.imprimir_E();
    fide_A.imprimir_AF();
    fide_P.imprimir_P();
    fide_promo.imprimir_promo();
    }
}

