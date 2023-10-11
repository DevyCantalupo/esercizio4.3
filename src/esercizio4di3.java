public class esercizio4di3 {
    public static int moltiplicazione(int a, int b){
        a*=2;
        b*=3;
        return a * b;
    }
    public static void main(String[] args) {
        int risultato = moltiplicazione(1, 1);
        System.out.println("risultato = " + risultato);
    }
}
