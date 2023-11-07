package presentacion;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private void inicializarMenu(){

        JMenuBar barraMenu = new JMenuBar();
        JMenu menuPersonas = new JMenu("Personas");

        barraMenu.add(barraMenu);
    }
    public VentanaPrincipal() {
        inicializarMenu();
        this.setSize(1000, 800);
        this.setVisible(true);
    }
}
