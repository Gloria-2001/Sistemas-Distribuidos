import java.util.*;

public class Promedio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero=1, cont=0, suma=0; 
        while(numero!=0){
            System.out.println("Introduce un numero de 1 a 10, 0 cuando termines de introducir numeros");
            numero = sc.nextInt(); 
            suma=suma+numero;
            cont=cont+1;
        }
        sc.close();
        if(numero==0){
            double promedio = suma/(cont-1); 
            System.out.println("El promedio de los numeros introducidos es: "+ promedio);
        }
    }
}
