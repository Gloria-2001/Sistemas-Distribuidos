public class CharCounter {
    public char caracter; 
    public int contador; 

    public CharCounter(char caracter){
        this.caracter = caracter; 
        this.contador = 1; 
    }

    public char getCaracter(){
        return caracter;
    }

    public int getContador(){
        return contador; 
    }

    public void incrementarContador(){
        contador++; 
    }
}
