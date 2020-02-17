
package mvc;

import controlador.controlador;


/**
 *
 * @author Milena
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
         modelo model= new modelo();
         Vista view =new Vista();
         controlador ctrl = new controlador(view, model);
         ctrl.iniciar();
         view.setVisible(true);
    }
    
   
}

