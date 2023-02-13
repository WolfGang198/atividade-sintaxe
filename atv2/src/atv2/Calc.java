package atv2;

public class Calc {
    public int numero;
    public int a1 = 0;
    public int a2;
    public int soma;
    
    public void soma(){
        soma = a1 + numero;
        a1 = soma;
        numero++; 
    }
    
    public void tot(){
        System.out.println(soma);
    }
    
    public int getNumero(){
    return numero;
    }
    
    public void setNumero(int n){
    this.numero = n;
    }
}
