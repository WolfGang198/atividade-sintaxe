package atv2;

public class Calc {
    public int numero;
    
    public void soma(){
        System.out.print(this.numero);
        System.out.print(" + 1 = ");
        numero++;
        System.out.print(numero);
        System.out.println("");
    }
    
    public int getNumero(){
    return numero;
    }
    
    public void setNumero(int n){
    this.numero = n;
    }
}
