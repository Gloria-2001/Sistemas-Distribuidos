/**
 * PROYECTO #2
 * NOMBRE: Gloria Oliva Olivares Ménez
 * GRUPO: 4CM12
 */
import java.awt.*;
import javax.swing.JPanel;

public class PanelPoligono extends JPanel{
    private Coordenada center;
    private PoligonoReg poligono;

    public PanelPoligono(Coordenada center, PoligonoReg polygon) {
        this.center = center;
        this.poligono = polygon;
    }

    @Override
    public void paintComponent(Graphics graph) {
            Polygon polygon = new Polygon();

            for (Coordenada coord : this.poligono.vertices) {
                polygon.addPoint(
                    (int) (coord.abcisa() + center.abcisa()), 
                    (int) (coord.ordenada() + center.ordenada())
                );
            }
            graph.setColor(Color.BLACK);
            graph.drawPolygon(polygon);
    }
}
