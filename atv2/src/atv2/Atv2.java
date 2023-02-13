package atv2;

public class Atv2 {

    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.setNumero(0);
            while(c1.getNumero() < 100){
                c1.soma();
            }
    }
    
}
