package liskov_substitution;

public class Quadrado implements Forma {
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int getArea(){
        return lado*lado;
    }
}
