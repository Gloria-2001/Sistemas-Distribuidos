import java.util.Scanner;

public class NombreLargo {
    private String[] arr;

    public NombreLargo() {
        this.arr = new String[10];
    }

    public NombreLargo(String[] arr) {
        this.arr = arr;
    }

    //metodos
    public void set(int idx, String value) {
        if (idx > 10)
            return;
        this.arr[idx] = value;
    }

    public String get(int idx) {
        return this.arr[idx];
    }

    public String[] get() {
        return this.arr;
    }

    public String obtenerLargo(){
        String name = this.arr[0];
        for(int i=1; i<10; i++){
            if(name.length()<this.arr[i].length()){
                name=this.arr[i];
            }
        }
        return name; 
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < 10; i++)
            out += this.arr[i] + " ";
        return out;
    }

    public static void main(String[] args) {
        NombreLargo arreglo = new NombreLargo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 nombres para el arreglo");
        for (int i = 0; i < 10; i++) {
            arreglo.set(i, sc.nextLine());
        }

        sc.close();

        System.out.println("\n\nNombre mas largo: " + arreglo.obtenerLargo());
    }
}
