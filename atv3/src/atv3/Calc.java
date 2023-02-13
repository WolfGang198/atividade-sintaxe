package atv3;

public class Calc {
    public int numero;
    
    public void soma(){
        System.out.println(this.numero);
        numero = numero + 5;
    }
    
    public int getNumero(){
    return numero;
    }
    
    public void setNumero(int n){
    this.numero = n;
    }
}
