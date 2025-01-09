package dependency_inversion;

public class Teclado implements DispositivoEntrada {
    public void usar(){
        System.out.println("Digitando ...");
    }
}
