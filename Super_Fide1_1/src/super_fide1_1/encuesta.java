
package super_fide1_1;

import javax.swing.JOptionPane;
public class encuesta 
{
   
private String pregu_1;
private String pregu_2;
private String pregu_3;





  public String getpregu_1() {

JOptionPane.showInputDialog("¿Le ha gustado nuestra atencion al cliente?");

        return pregu_1;
    }

    public void setpregu_1(String pregu_1) {
        this.pregu_1 = pregu_1;
    }

  public String getpregu_2() {

JOptionPane.showInputDialog("¿Ha encontrado todos los productos que deseaba?");

        return pregu_2;
    }

    public void setpregu_2(String pregu_2) {
        this.pregu_2 = pregu_2;
    }

  public String getpregu_3() {

JOptionPane.showInputDialog("¿Considera que nuestros precios estan en un buen estandar?");

        return pregu_3;
    }

    public void setpregu_3(String pregu_3) {
        this.pregu_3 = pregu_3;
    }


}

