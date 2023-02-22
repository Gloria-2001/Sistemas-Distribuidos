import java.util.Scanner;
public class OrdenarNum {
    //atributos
    int num1,num2,num3; 

    //constructor
    public OrdenarNum(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    //metodo 
    public void ordenar(){
        if(this.num1<=this.num2 && this.num1<=this.num3){
            if(this.num2<=this.num3){
                System.out.println("Los numeros ordenados son:"+this.num3+","+this.num2+","+this.num1);
            }else{
                System.out.println("Los numeros ordenados son:"+this.num2+","+this.num3+","+this.num1);
            }
        }else if(this.num1>=this.num2 && this.num1>=this.num3){
            if(this.num2<=this.num3){
                System.out.println("Los numeros ordenados son:"+this.num1+","+this.num3+","+this.num2);
            }else{
                System.out.println("Los numeros ordenados son:"+this.num1+","+this.num2+","+this.num3);
            }
        }else if(this.num2<=this.num1 && this.num2<=this.num3){
            if(this.num1<=this.num3){
                System.out.println("Los numeros ordenados son:"+this.num3+","+this.num1+","+this.num2);
            }else{
                System.out.println("Los numeros ordenados son:"+this.num1+","+this.num3+","+this.num2);
            }
        }else if(this.num2>=this.num1 && this.num2>=this.num3){
            if(this.num1<=this.num3){
                System.out.println("Los numeros ordenados son:"+this.num2+","+this.num3+","+this.num1);
            }else{
                System.out.println("Los numeros ordenados son:"+this.num2+","+this.num1+","+this.num3);
            }
        }
    }

    //pincipal
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("***ORDENAR NUMEROS****");
        System.out.println("Ingrese 3 numeros enteros");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        OrdenarNum ordenacion = new OrdenarNum(num1, num2, num3);
        ordenacion.ordenar(); 
    }
}
