import java.util.Scanner;
public class ConsumoElectricidad {
    //atributos
    public int kilowatts;

    //Constructor
    public ConsumoElectricidad(int kilowatts){
        this.kilowatts = kilowatts;
    }

    //metodos
    public double calcularHogar(){
        double precio=0; 
        return precio;
    }

    public double calcularNegocio(){
        float precio = this.kilowatts * 5; 
        System.out.println("El precio a pagar es: $"+precio);
        return precio;
    }

    //principal
    public static void main(String[] args){
        int opc, kilowatts=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("***CFE****");
        System.out.println("Seleccione la opcion correcta de acuerdo al tipo de contrato");
        System.out.println("1. Hogar");
        System.out.println("2. Negocio");
        opc = sc.nextInt();

        if(opc==1){
            System.out.println("Ingrese los kilowatts");
            kilowatts = sc.nextInt();
            ConsumoElectricidad precioHogar = new ConsumoElectricidad(kilowatts);
        }else if(opc==2){
            System.out.println("Ingrese los kilowatts");
            kilowatts = sc.nextInt();
            ConsumoElectricidad precioNegocio = new ConsumoElectricidad(kilowatts);
            precioNegocio.calcularNegocio();
        }
    }
}
