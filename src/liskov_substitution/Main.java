package liskov_substitution;

public class Main {
    private Forma forma;

    public Main(Forma forma){
        this.forma = forma;
    }

    public static void main(String args[]){
        Retangulo retangulo = new Retangulo( 2, 2);
        Quadrado quadrado = new Quadrado(5);

        System.out.println(retangulo.getArea());
    }

}
