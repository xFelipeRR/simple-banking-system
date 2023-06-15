package conta;
import cliente.Cliente;

public abstract class Conta implements InterfaceConta {
    private String conta;
    private String agencia;
    private Cliente cliente;
    private double saldo;




    // metodos especiais


    public Conta(String conta, String agencia, Cliente cliente, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }



    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getCliente() {
        return cliente.getNome();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }
}
