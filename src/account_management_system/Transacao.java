package account_management_system;

import java.util.Date;

public class Transacao {
    private TipoTransacao tipoTransacao;
    private Date data;

    public Transacao(TipoTransacao tipoTransacao, Date data) {
        this.tipoTransacao = tipoTransacao;
        this.data = data;
    }

    public void efetuarTransacao(Conta conta, Double valor){
        if (this.tipoTransacao.equals(TipoTransacao.DEBITO)){
            //TODO implementar validacao de saldo
            conta.setSaldo(conta.getSaldo()-valor);
        } else if (this.tipoTransacao.equals(TipoTransacao.CREDIDO)){
            conta.setSaldo(conta.getSaldo()+valor);
            System.out.println("Dinhiero foi creditado");
        }
    }
}
