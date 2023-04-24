public class StackSimulator{
    public Character[] arr; 
    public int tope=1; 
    public int numElemems=0;

    //Constructor 
    public StackSimulator(Character[] arr){
        this.arr=arr;
        this.tope = 1;
        this.numElemems = 0; 
    }

    //Metodos para jugar con el array/pila
    public void anadir(Character c){
        if(numElemems==tope){
            crecer();
        }
        arr[numElemems] = c; 
        numElemems++; 
    }

    public void crecer(){
        Character aux[] = null; 
        if(numElemems==tope){
            aux = new Character[tope+1];
            for(int i=0; i<tope; i++){
                aux[i] = arr[i];
            }
        }
        arr = aux; 
        tope = tope+1; 
        System.out.println("Tope="+tope);
    }

    public void eliminar(){
        if(numElemems>0){
            arr[numElemems-1]=' ';
            numElemems--;
            System.out.println("Tope="+numElemems);
        }
    }

    public String toString() {
        String out = "";
        for(int i=0; i<arr.length;i++){
            out += arr[i] + " ";
        }
        return out;
    }

    //Main
    public static void main(String[] args) throws InterruptedException{
        Character[] test_arr = new Character[1];
        StackSimulator test = new StackSimulator(test_arr); 

        for(int i=0;i<10;i++){
            test.anadir('X');
            System.out.println(test);
            Thread.sleep(1000);
        }
        
        Thread.sleep(2000);
        for(int j=0;j<test.tope;j++){
            test.eliminar();
            System.out.println(test);
            Thread.sleep(1000);
        }

    }
}
