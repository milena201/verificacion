package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.Vista;
import mvc.modelo;

/**
 *
 * @author Milena
 */
public class controlador implements ActionListener {

    private Vista view;
    private modelo model;

    public controlador(Vista view, modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnCalcular.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        model.setNumero(Double.valueOf(view.txtNumero.getText()));
        model.Seno();
        view.txtResultado.setText(String.valueOf(model.getResultado()));

    }

    public void iniciar() {
        view.setTitle("calcular");
        view.setLocationRelativeTo(null);
    }

   
}
