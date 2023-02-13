package atv2;

public class Atv2 {

    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.setNumero(1);
            while(c1.getNumero() < 101){
                c1.soma();
            }
        c1.tot();
    }
    
}
