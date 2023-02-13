package atv5;

public class Calc {
    public double peso;
    public double altura;
    public double imc;
    
    public void imc(){
       imc = peso / (Math.pow(altura, 2)); 
        System.out.println(this.imc);
    }
    
    //public int getNumero(){
    //return numero;
    //}
    
    //public void setNumero(int n){
    //this.numero = n;
    //}
}
