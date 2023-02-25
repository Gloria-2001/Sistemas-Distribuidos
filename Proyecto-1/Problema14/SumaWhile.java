import java.util.Scanner;
public class SumaWhile {
    int x;
    int y; 

    public SumaWhile(int x, int y){
        this.x = x;
        this.y = y; 
    }

    public void mostrarNumeros(){
        System.out.println(this.x);
        while(this.x<200){
            this.x=this.x+this.y;
            System.out.println(this.x);
        }
    }

    public static void main(String[] args){
        int x=0, y=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero donde va a empezar el conteo");
        x=sc.nextInt();
        System.out.println("Introduce de cuanto en cuanto se quiere el conteo");
        y=sc.nextInt();

        SumaWhile conteo = new SumaWhile(x, y);
        System.out.println("***INICIO CONTEO***");
        conteo.mostrarNumeros();
    }
    
}
