import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    public PanelPrincipal(){
        this.setLayout(new BorderLayout());
        com = new PanelComprador();
        this.setBackground(Color.white);
        this.add(com,BorderLayout.EAST);

    }

    public void paint (Graphics g){
        super.paint(g);

    }
}
