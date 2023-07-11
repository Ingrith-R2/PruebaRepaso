import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class vehiculos {
    private static List<vehiculos> autos= new ArrayList();
    public static void main(String[] args){
        JFrame frame = new JFrame("vehiculos");
        frame.setContentPane(new vehiculos().pantallita);
        frame.setBounds(850,400,900,750);
        //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    String Marcas, anios, cilind;

    public JPanel pantallita;
    private JLabel Marca;
    private JLabel anio;
    private JTextField marcacaText;
    private JLabel cilindraje;
    private JTextField anioText;
    private JTextField cilindrajeText;
    private JButton guardar;
    private JButton back;
    private JButton next;

    public vehiculos(String marcas, String anios, String cilind) {
        this.Marcas = marcas;
        this.anios = anios;
        this.cilind = cilind;
    }

    public String getMarcas() {
        return Marcas;
    }

    public void setMarcas(String marcas) {
        Marcas = marcas;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    public String getCilind() {
        return cilind;
    }

    public void setCilind(String cilind) {
        this.cilind = cilind;
    }





    public vehiculos() {
    marcacaText.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Marcas = marcacaText.getText();

        }
    });
    anioText.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            anios = anioText.getText();
        }
    });
    cilindrajeText.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cilind =cilindrajeText.getText();

        }
    });


    guardar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == guardar){
                
            }


        }
    });
    next.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

}
}
