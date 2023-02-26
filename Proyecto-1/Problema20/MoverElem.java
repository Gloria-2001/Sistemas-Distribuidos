import java.util.Scanner;

public class MoverElem {

    private int[] vector;

    public MoverElem() {
        this.vector = new int[10];
    }

    public void set(int idx, int value) {
        if (idx > 10) return;
        this.vector[idx] = value;
    }

    public int get(int idx) {
        return this.vector[idx];
    }

    public int[] get() {
        return this.vector;
    }


    public void compute() {
        int aux = this.vector[9];
        for (int i = 8; i >= 0; i--) {
            this.vector[i + 1] = this.vector[i];
        }
        this.vector[0] = aux;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < 10; i++) {
            out += this.vector[i] + " ";
        }
        return out;
    }

    public static void main(String[] args) {
        MoverElem mn = new MoverElem();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 valores:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Valor %d: ", i+1);
            mn.set(i, sc.nextInt());
        }

        sc.close();
        
        System.out.println("\n" + mn);
        mn.compute();
        System.out.println(mn);
    }
}
