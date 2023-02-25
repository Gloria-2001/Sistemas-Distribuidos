import java.util.Scanner;
public class Suma {
    int numero;

    public Suma(int num){
        this.numero = num; 
    }

    public int sumaEnteros(){
        int suma=0;
        for(int i=1;i<=this.numero;i++){ 
            suma=suma+i;
        }
        return suma; 
    }

    public static void main(String[] args){
        int numero; 
        Scanner sc = new Scanner(System.in);

        System.out.println("***SUMA****");
        System.out.println("Ingrese un numero entero");
        numero=sc.nextInt(); 

        Suma sumaNumeros = new Suma(numero);
        System.out.println("La suma desde 1 hasta "+numero+" es: "+sumaNumeros.sumaEnteros());
    }
}
