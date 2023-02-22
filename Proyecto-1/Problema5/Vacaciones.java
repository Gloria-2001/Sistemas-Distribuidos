import java.util.Scanner;
public class Vacaciones {
    //atributos 
    public String nombre;
    public int aniosTrabajo; 

    //constructor
    public Vacaciones(String nombre,int aniosTrabajo){
        this.nombre = nombre;
        this.aniosTrabajo = aniosTrabajo;
    }

    //metodos 
    public void imprimirNombre(){
        System.out.println("¡Hola "+this.nombre+", bienvenido!");
    }

    public void asignarVacaciones(){
        if(this.aniosTrabajo>=1 && this.aniosTrabajo<=5){
            System.out.println("Te corresponden 5 dias de vacaciones");
        }else if(this.aniosTrabajo>=6 && this.aniosTrabajo<=10){
            System.out.println("Te corresponden 10 dias de vacaciones");
        }else if(this.aniosTrabajo>=11 && this.aniosTrabajo<=19){
            System.out.println("Te corresponden" + this.aniosTrabajo + "dias de vacaciones");
        }else if(this.aniosTrabajo>=20){
            int aux = this.aniosTrabajo + 2;
            if(aux<=45){
                System.out.println("Te corresponden " + aux + " dias de vacaciones");
            }else{
                System.out.println("Te corresponden 45 dias de vacaciones");
            }
        }
    }

    //principal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int aniosTrabajo; 
        System.out.println("***CALCULADORA DE VACACIONES****");
        System.out.println("Ingrese su nombre"); 
        nombre = sc.nextLine();
        System.out.println("Ingrese sus anios de trabajo");
        aniosTrabajo = sc.nextInt();
        
        Vacaciones empleado = new Vacaciones(nombre, aniosTrabajo);
        empleado.imprimirNombre();
        empleado.asignarVacaciones();
    }
}
