import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        super();

        this.setTitle("esta Ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,700);
        PanelPrincipal a = new PanelPrincipal();
        this.add(a);
        this.setVisible(true);
    }
}