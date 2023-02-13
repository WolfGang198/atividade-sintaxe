package atv1;

public class Calc {
    public int numero;
    
    public void soma(){
        System.out.println(this.numero++); 
    }
    
    public int getNumero(){
    return numero;
    }
    
    public void setNumero(int n){
    this.numero = n;
    }
}
