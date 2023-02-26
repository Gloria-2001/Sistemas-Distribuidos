import java.util.Scanner;

public class MultiplicacionMatriz {
    public int rows;
    public int cols;
    private int[][] _mat;

    public MultiplicacionMatriz(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this._mat = new int[rows][cols];
    }

    public int get(int row, int col) { return _mat[row][col]; }

    public void set(int row, int col, int value) { _mat[row][col] = value; }

    public MultiplicacionMatriz multiply(MultiplicacionMatriz a) {
        MultiplicacionMatriz mul = new MultiplicacionMatriz(this.rows, a.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < a.cols; j++) {
                int suma = 0;
                for (int k = 0; k < this.cols; k++) 
                    suma += this._mat[i][k] * a.get(k, j);
                mul.set(i, j, suma);
            }
        }
        return mul;
    }

    public static MultiplicacionMatriz multiply(MultiplicacionMatriz a, MultiplicacionMatriz b) {
        MultiplicacionMatriz mul = new MultiplicacionMatriz(a.rows, b.cols);
        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                int suma = 0;
                for (int k = 0; k < a.cols; k++) 
                    suma += a._mat[i][k] * b.get(k, j);
                mul.set(i, j, suma);
            }
        }
        return mul;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < this.rows; i++) {
            out += "|";
            for (int j = 0; j < this.cols; j++) {
                out += " " + this._mat[i][j];
            }
            out += " |";
        }
        return out;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese la dimension de la matriz A");
        System.out.print("Ejemplo 3x2: ");
        String[] dim = (in.nextLine()).split("x");
        MultiplicacionMatriz matA = new MultiplicacionMatriz(Integer.parseInt(dim[0]), Integer.parseInt(dim[1]));
        
        System.out.println("\nIngrese la dimension de la matriz B");
        System.out.print("Ejemplo 2x3: ");
        dim = (in.nextLine()).split("x");
        MultiplicacionMatriz matB = new MultiplicacionMatriz(Integer.parseInt(dim[0]), Integer.parseInt(dim[1]));

        if (matA.cols != matB.rows) {
            System.out.println("No se puede hacer la multiplicacion.");
            System.out.println("El numero de columnas de la matriz A debe ser igual a las filas de la matriz B");
            System.out.printf("A(%dx%d) B(%dx%d)\n", matA.cols, matA.rows, matB.cols, matB.rows);
            System.exit(1);
        }

        System.out.println("\nIngrese los valores de la matriz A:");
        for (int i = 0; i < matA.rows; i++) {
            for (int j = 0; j < matA.cols; j++) {
                System.out.printf("mat[%d][%d] = ", i, j);
                matA.set(i, j, in.nextInt());
            }
        }

        System.out.println("\nIngrese los valores de la matriz B:");
        for (int i = 0; i < matB.rows; i++) {
            for (int j = 0; j < matB.cols; j++) {
                System.out.printf("mat[%d][%d] = ", i, j);
                matB.set(i, j, in.nextInt());
            }
        }

        System.out.println("\nResultado:");
        System.out.println(MultiplicacionMatriz.multiply(matA, matB));

        in.close();

    }
}
