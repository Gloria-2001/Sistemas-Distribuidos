/**
 * PROYECTO #2
 * NOMBRE: Gloria Oliva Olivares Ménez
 * GRUPO: 4CM12
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int maxSize = 900;
    public static int minSize = 150;
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Ejecution: java Main n");
            System.out.println("Argumentos:\nn: Numero de poligonos");
            return;
        }

        int sizePol = Integer.parseInt(args[0]);
        List<PoligonoReg> poligonos = new ArrayList<>();
        double superRadio = 0;

        for (int i = 0; i < sizePol; i++) {
            double radio = (Math.random() * (maxSize - minSize)) - minSize;
            int size = (int) (Math.random() * (21 - 3)) + 3; //num lados poligonos 

            if (superRadio < radio) superRadio = radio;

            PoligonoReg polReg = new PoligonoReg(size);

            for (int j = 0; j < size; j++) {
                double x_p = radio * polReg.vertices[j].abcisa();
                double y_p = radio * polReg.vertices[j].ordenada();
                polReg.vertices[j] = new Coordenada(x_p, y_p);
            }

            poligonos.add(polReg);
        }

        new GuiPoligono(poligonos, maxSize);
    }
}