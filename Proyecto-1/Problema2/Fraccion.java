import java.util.Scanner;
public class Fraccion{
    //Atributos
    int numerador; 
    int denominador; 

    //Constructor 
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador; 
    }

    public Fraccion(){
        this.numerador=1;
        this.denominador=1; 
    }

    //metodos
    public void imprimir(){
        System.out.println(this.numerador+"/"+this.denominador);
    }

    public Fraccion multiplicar(Fraccion A, Fraccion B){
        Fraccion prod = new Fraccion();
        prod.numerador = A.numerador * B.numerador;
        prod.denominador = A.denominador * B.denominador;
        System.out.println("El producto en fraccion es: ");
        prod.imprimir();
        return prod; 
    }

    public float decimal(){
        float res = (float)this.numerador/(float)this.denominador;
        System.out.println("El producto en decimal es: " + res);
        return res;
    }

    //principal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fraccion aux00 = new Fraccion();
        int a, b, c, d; 
        System.out.println("****MULTIPLICADOR DE FRACCIONES****");
        System.out.println("Inserte el numerador y el denominador de la primera fraccion");
        a=sc.nextInt();
        b=sc.nextInt(); 
        System.out.println("Inserte el numerador y el denominador de la segunda fraccion");
        c=sc.nextInt();
        d=sc.nextInt(); 
        if(b!=0 && d!=0){
            System.out.println("Las 2 fracciones a multiplicar son: ");
            Fraccion frac01 = new Fraccion(a,b);
            frac01.imprimir();
            Fraccion frac02 = new Fraccion(c,d);
            frac02.imprimir();
            aux00 = frac01.multiplicar(frac01, frac02);
            aux00.decimal();
        }else{
            System.out.println("ERROR! Los denominadores no pueden ser 0");
        }
    }
}