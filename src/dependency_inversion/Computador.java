package dependency_inversion;

public class Computador {
    private DispositivoEntrada dispositivoEntrada;

    public Computador(DispositivoEntrada dispositivoEntrada){
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void usarDispositivo(){
        dispositivoEntrada.usar();
    }

}
