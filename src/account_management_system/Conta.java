package account_management_system;

import java.util.Date;
import java.util.List;

public class Conta {
    private String numero;
    private Double saldo;
    private Usuario usuario;
    private Date dataCadastro;
    private List<Transacao> transacoes;

    public Conta(String numero, Double saldo, Usuario usuario, Date dataCadastro, List<Transacao> transacoes) {
        this.numero = numero;
        this.saldo = saldo;
        this.usuario = usuario;
        this.dataCadastro = dataCadastro;
        this.transacoes = transacoes;
    }
    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
    public void adicionarTransacao(Transacao transacao){
        transacoes.add(transacao);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
