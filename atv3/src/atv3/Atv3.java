package atv3;

public class Atv3 {

    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.setNumero(5);
            while(c1.getNumero() < 101){
                c1.soma();
            }
    }
    
}
