import java.util.*;

public class NumAzar {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        int aux = aleatorio.nextInt(101)+1;
        int numero=0; 
        while(aux!=numero){
            System.out.println("Adivina en que numero estoy pensando, presiona 0 para salir");
            numero = sc.nextInt(); 
            if(numero==0){
                System.out.println("Bye :)");
                System.exit(1);
            }else if(numero<aux){
                System.out.println("Mi numero es mayor");
            }else if(numero>aux){
                System.out.println("Mi numero es menor");
            }
        }
        if(aux==numero){
            System.out.println("Felicidades! Le atinaste :D");
        }
        sc.close();
    }
}
