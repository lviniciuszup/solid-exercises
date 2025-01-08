package liskov_substitution;

public class Retangulo implements Forma {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
    }
    public int getArea(){
        return largura * altura;
    }
}
