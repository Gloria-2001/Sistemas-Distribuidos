import javax.swing.*;
import java. awt.*;
import java.util.*;
import java.util.List;

public class GuiPoligono extends JFrame{
    
    private List<PoligonoReg> poligonos;

    public GuiPoligono(List<PoligonoReg> poligonos, double maxSize) {
        super("Poligonos");
        setSize(getPreferredSize());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        this.poligonos = poligonos;
        init();
    }

    public void init() {
        try {
            Dimension dim = getSize();

            JPanel parent = new JPanel();
            add(parent);

            PanelVariosPoligonos polysPanel = new PanelVariosPoligonos(dim.width, dim.height, this.poligonos);
            add(polysPanel);

            Thread.sleep(3000);

            getContentPane().removeAll();
            repaint();

            Collections.sort(this.poligonos, new OrdenaArea());

            Coordenada center = new Coordenada(dim.width / 2, dim.height / 2);
            for (PoligonoReg pol : poligonos) {
                add(new PanelPoligono(center, pol));
                revalidate();
                repaint();
                Thread.sleep(500);
                getContentPane().removeAll();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
