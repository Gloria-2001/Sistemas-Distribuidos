import java.awt.*;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;

public class PanelVariosPoligonos extends JPanel{
    private int width;
    private int height;
    private List<PoligonoReg> poligonos;

    public PanelVariosPoligonos(int width, int height, List<PoligonoReg> poligonos) {
        this.width = width;
        this.height = height;
        this.poligonos = poligonos;
    }

    @Override
    public void paintComponent(Graphics graph) {
        for (PoligonoReg pol : poligonos) {
            Polygon polygon = new Polygon();

            int x_rand = (int) (Math.random() * (width));
            int y_rand = (int) (Math.random() * (height));

            for (Coordenada coord : pol.vertices)
                polygon.addPoint((int) coord.abcisa() + x_rand, (int) coord.ordenada() + y_rand);

            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            graph.setColor(new Color(r, g, b));
            graph.drawPolygon(polygon);
        }
    }
}
