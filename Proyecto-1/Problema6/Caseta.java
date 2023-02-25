import java.util.Scanner;
public class Caseta {
    //atributos
    int ejes;

    //Constructor 
    public Caseta(int ejes){
        this.ejes = ejes;
    } 

    //metodo
    public int asignarCosto(){
        switch(this.ejes){
            case 1:
                return 20;
            case 2:
                return 40;
            case 3:
                return 60;
            case 4:
            case 5:
            case 6: 
                return 250;
        }
        return 250 + ((this.ejes - 6) * 50);
    }

    //principal
    public static void main(String[] args){
        int ejes=0; 
        Scanner sc = new Scanner(System.in);

        System.out.println("***CASETA****");
        System.out.println("Ingrese la opcion que tiene el tipo de vehiculo deseado");
        System.out.println("1. Motocicleta");
        System.out.println("2. Automovil");
        System.out.println("3. Camioneta");
        System.out.println("4. Camion de carga");
        System.out.println("5. Otro");

        ejes = sc.nextInt();

        if(ejes>5){
            System.out.println("ERROR! Inserte una opcion valida");
        }else if(ejes==5){
            System.out.println("Ingrese el numero de ejes");
            ejes = sc.nextInt();
            Caseta precioExtra = new Caseta(ejes);
            System.out.println("El precio a pagar es: $"+precioExtra.asignarCosto());
        }else{
            Caseta precioNormal = new Caseta(ejes);
            System.out.println("El precio a pagar es: $"+precioNormal.asignarCosto());
        }
    }
}
