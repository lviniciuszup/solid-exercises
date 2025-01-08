package open_closed;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {
    private Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }
    public int operacaoResultado(int a, int b){
       return this.operacao.calcular(2,3);
    }
}