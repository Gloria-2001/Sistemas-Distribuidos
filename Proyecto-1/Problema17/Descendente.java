import java.util.Scanner;

public class Descendente {
    private int[] arr;

    //constructores 
    public Descendente() {
        this.arr = new int[10];
    }

    public Descendente(int[] arr) {
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

    public Descendente reversa(){
        int [] arr_rev = new int[10];
        for(int i=0;i<10;i++){
            arr_rev[i] = this.arr[10-1-i];
        }
        return new Descendente(arr_rev);
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < 10; i++) {
            out += this.arr[i] + " ";
        }
        return out;
    }

    public static void main(String[] args) {
        Descendente arreglo = new Descendente();
        Scanner sc = new Scanner(System.in); 

        System.out.println("Ingrese 10 valores para el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Valor %d: ", i + 1);
            arreglo.set(i, sc.nextInt());
        }
        sc.close();

        System.out.println("Arreglo nuevo: "+arreglo.reversa());
    }
}
