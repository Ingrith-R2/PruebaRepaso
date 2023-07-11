import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main_P extends  vehiculos{
       private static List<vehiculos> autos= new ArrayList();
    public static void main(String[] args){
        JFrame frame = new JFrame("vehiculos");
        frame.setContentPane(new vehiculos().pantallita);
        frame.setBounds(850,400,900,750);
     //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
