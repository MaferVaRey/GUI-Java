package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JTextField textField3;
    private JComboBox cmbIdioma;
    private JLabel txtApellido;
    private JLabel txtIdioma;
    private JCheckBox chbTerminos;
    private JLabel lblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtNoIndicado;
    private JButton btnGuardar;
    private JPanel pnlPrincipal;

    public JLabel getLblCodigo() {
        return lblCodigo;
    }

    private String getGenero() {
        return (rbtMasculino.isSelected()) ? "Masculino" :
                (rbtFemenino.isSelected()) ? "Femenino" :
                        (rbtOtro.isSelected()) ? "Otro" :
                                (rbtNoIndicado.isSelected()) ? "Prefiero no decir" :
                                        "No indicado";
    }

    public IngresarPersona() {
        this.setContentPane(pnlPrincipal);
        // Se asigna el tamaño por defecto
        this.setSize(500, 300);
        // Se asigna la posición por defecto
        this.setLocation(100, 100);
        // No se permite redimensionar la ventana
        this.setResizable(false);
        // Se muestra la ventana como visible
        this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptaTerminos = (chbTerminos.isSelected() == true) ? "Sí" : "No";
                String genero = getGenero();

                String mensaje = "Tus datos son: \n" +
                        "Código: " + codigo + "\n" +
                        "Nombre: " + nombre + "\n" +
                        "Apellido: " + apellido + "\n" +
                        "Idioma:" + idioma + "\n" +
                        "Género: " + genero + "\n" +
                        "Acepta términos y condiciones: " + aceptaTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
