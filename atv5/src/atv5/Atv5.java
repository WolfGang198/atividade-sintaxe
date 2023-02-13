package atv5;

import java.util.Scanner;

public class Atv5 {

    public static void main(String[] args) {
        Scanner gen = new Scanner(System.in);
        Calc c1 = new Calc();
        c1.altura = 1.7f;
        c1.peso = 55.0f;
        
        System.out.println("Informe seu gênero: (M) (F)");
        String g = .next();
        
        c1.imc();
    }
    
}
