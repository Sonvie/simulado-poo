// Questão 02:

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(){
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public Retangulo(double largura, double altura) {
        if ((largura > 0) && (altura > 0)) {
            this.largura = largura;
            this.altura = altura;
        } else {
            System.out.println("Valores inválidos!");
        }
    }

    public double getLargura(){
        return largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setLargura(double largura){
        if (largura > 0){
            this.largura = largura;
        } else {
            System.out.println("Valor inválido! Por favor digite um valor positivo.");
        }
    }

      public void setAltura(double altura){
        if (altura > 0){
            this.altura = altura;
        } else {
            System.out.println("Valor inválido! Por favor digite um valor positivo.");
        }
    }

    public double calcularArea(){
        return largura * altura;
    }

    public boolean isQuadrado(){
        if (largura == altura){
            return true;
        } else return false;
    }

    public static void main(String args[]) {
        Retangulo retangulo = new Retangulo(5.0, 5.0);

        if (retangulo.isQuadrado()){
            System.out.println("É quadrado.");
        } else System.out.println("Não é quadrado.");

        System.out.println("Sua área é: " + retangulo.calcularArea());
    }

}