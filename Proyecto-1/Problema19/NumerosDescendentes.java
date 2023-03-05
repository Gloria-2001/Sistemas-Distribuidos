import java.util.Scanner;
public class NumerosDescendentes {
    private int[] arr;

    //constructores
    public NumerosDescendentes() {
        this.arr = new int[10];
    }

    public NumerosDescendentes(int[] arr) {
        this.arr = arr;
    }
    
    //metodos 
    public void set(int idx, int value) {
        if (idx > 10)
            return;
        this.arr[idx] = value;
    }

    public int get(int idx) {
        return this.arr[idx];
    }

    public int[] get() {
        return this.arr;
    }

    public void descendentes(){ 
        boolean order = true;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++)
                order = order & (this.arr[j] >= this.arr[i]);
            if (!order)
                order = false;
        }
        if(order){
            System.out.println("Si es descendente");
        }else{
            System.out.println("No es descente");
        }
    }

    public static void main(String[] args) {
        NumerosDescendentes arreglo = new NumerosDescendentes();
        Scanner sc = new Scanner(System.in); 

        System.out.println("Ingrese 10 valores para el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Valor %d: ", i + 1);
            arreglo.set(i, sc.nextInt());
        }
        sc.close();

        arreglo.descendentes();
    }
}
