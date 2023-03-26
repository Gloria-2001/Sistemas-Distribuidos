/**
 * PROYECTO #2
 * NOMBRE: Gloria Oliva Olivares Ménez
 * GRUPO: 4CM12
 */
import java.util.*;

public class OrdenaArea implements Comparator <PoligonoReg>{
    @Override
    public int compare(PoligonoReg a, PoligonoReg b)
    {
        int aux = (int)a.calcularArea() - (int)b.calcularArea();
        return aux;
    }
}
