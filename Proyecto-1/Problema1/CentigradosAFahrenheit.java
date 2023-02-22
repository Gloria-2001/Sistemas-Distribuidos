import java.util.Scanner;
public class CentigradosAFahrenheit {
    //Atributos
    public float centigrados; 

    //Constructor
    public CentigradosAFahrenheit(float centigrados){
        this.centigrados = centigrados; 
    }

    //Metodo
    public float calcular(){
        float res = (float)Math.abs(this.centigrados*1.8+32);
        System.out.println("Grados Fahrenheit = "+res);
        return res;
    }

    //principal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float cent;
        System.out.println("****CONVERTOR CENTIGRADOS A FARENHEIT****");
        System.out.println("Inserte los grados centigrados para convertir a farenheit");
        cent = sc.nextFloat();
        CentigradosAFahrenheit gradCent = new CentigradosAFahrenheit(cent);
        gradCent.calcular();
    }
}
