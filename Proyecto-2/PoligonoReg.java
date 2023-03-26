/**
 * PROYECTO #2
 * NOMBRE: Gloria Oliva Olivares Ménez
 * GRUPO: 4CM12
 */
public class PoligonoReg extends PoligonoIrreg{
    public double anguloCentral; 

    public PoligonoReg(int lados){
        super(lados);
        this.anguloCentral = (2 * Math.PI) / (double) lados; 
        for(int i=1;i<=lados;i++){
            double x = Math.cos(this.anguloCentral * i);
            double y = Math.sin(this.anguloCentral * i);
            anadeVertice(x, y);
        }
    }

    public double calcularArea(){
        Coordenada punto1 = vertices[0];
        Coordenada punto2 = vertices[1];

        double base = Math.sqrt(Math.pow(punto2.abcisa()-punto1.abcisa(),2)+Math.pow(punto2.ordenada()-punto1.ordenada(), 2));

        double puntoMedio_x = (punto2.abcisa()+punto1.abcisa())/2;
        double puntoMedio_y = (punto2.ordenada()+punto1.ordenada())/2;
        double altura = Math.sqrt(Math.pow(puntoMedio_x, 2)+Math.pow(puntoMedio_y, 2));

        double area = ((base*altura)/2)*tam; 

        return area; 
    }

}
