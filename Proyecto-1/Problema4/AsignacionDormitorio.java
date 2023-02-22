import java.util.Scanner;
public class AsignacionDormitorio {
    //Atributos 
    char sexo; 
    int edad; 

    //Constructor
    public AsignacionDormitorio(char sexo, int edad){
        this.sexo = sexo; 
        this.edad = edad; 
    }

    //métodos 
    public void asignar(){
        switch(this.sexo){
            case 'H':
                if(this.edad==18){
                    System.out.println("Se te asigna el edificio A");
                }else if(this.edad >= 19 && this.edad<=22){
                    System.out.println("Se te asigna el edificio C");
                }else if(this.edad >= 22){
                    System.out.println("Se te asigna el edificio E1");
                }
                break;
            case 'M':
                if(this.edad==18){
                    System.out.println("Se te asigna el edificio B");
                }else if(this.edad >= 19 && this.edad<=22){
                    System.out.println("Se te asigna el edificio D");
                }else if(this.edad >= 22){
                    System.out.println("Se te asigna el edificio E2");
                }
                break;
        }
    }

    //principal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char sexo;
        int edad; 
        System.out.println("***ASIGNACIÓN DE DORMITORIOS****");
        System.out.println("Ingrese su sexo (H/M)");
        sexo = sc.next().charAt(0);
        System.out.println("Ingrese su edad (igual o mayor a 18 anios)");
        edad = sc.nextInt();
        if((sexo != 'H' || sexo != 'M') && (edad<18)){
            System.out.println("ERROR! ingrese datos validos");
        }else{
            AsignacionDormitorio alumno = new AsignacionDormitorio(sexo, edad);
            alumno.asignar();
        }
    }
}