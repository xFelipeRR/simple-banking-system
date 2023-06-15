package conta;
import cliente.Cliente;

public class ContaSalário extends Conta {
    private int qtdSaques = Integer.MAX_VALUE;
    private int qtdDepositos = Integer.MAX_VALUE;
    private int qtdExtratos = 2;
    private int qtdSaquesEfetuados = 0;
    private int qtdDepositosEfetuados = 0;
    private double saldo;

    

    public ContaSalário(String conta, String agencia, Cliente cliente, double saldo) {
        super(conta, agencia, cliente, saldo);
        this.saldo = saldo;
    }




    // metodos implementados
    @Override
    public String sacar (double valor) {
            String resultado = "";
            if(qtdSaques > 0) {
                if (saldo >= valor) {
                    saldo = (saldo - valor);
                    qtdSaques -= 1;
                    qtdSaquesEfetuados += 1;
                    resultado = "Saque efetuado com sucesso no valor de: R$" + valor;
               } 
               else {
                    resultado = "Saldo insuficiente";
                }
            }
            else {
                resultado = "Você já ultrapassou sua quantidade de saques!";
            }
            
            return resultado;
    }




    @Override
    public String depositar(double valor) {
        String resultado = "";
        saldo = saldo + valor;
        if(qtdDepositos > 0) {
            qtdDepositos -= 1;
            qtdDepositosEfetuados += 1;
            resultado = ("Depósito efetuado com sucesso no valor de: R$" + valor);
        }
        else {
            resultado = "Você já ultrapassou sua quantidade de depósitos!";
        }
        return resultado;

    }




    @Override
    public void consultarExtrato() {
        System.out.println("------------------------- EXTRATO DA CONTA -------------------------");
        System.out.println("Quantidades de saques feitos: " + qtdSaquesEfetuados);
        System.out.println("Quantidade de depositos feitos: " + qtdDepositosEfetuados);
        System.out.println("Saldo final: " + saldo);

    }

    public int getQtdSaques() {
        return qtdSaques;
    }

    public void setQtdSaques(int qtdSaques) {
        this.qtdSaques = qtdSaques;
    }

    public int getQtdDepositos() {
        return qtdDepositos;
    }

    public void setQtdDepositos(int qtdDepositos) {
        this.qtdDepositos = qtdDepositos;
    }

    public int getQtdExtratos() {
        return qtdExtratos;
    }

    public void setQtdExtratos(int qtdExtratos) {
        this.qtdExtratos = qtdExtratos;
    }

}
