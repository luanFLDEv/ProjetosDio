import java.util.Random;

public class ContaTerminal {
    private int NumeroConta;
    private String Agencia;
    private String NomeCliente;
    private double saldo;
    private double deposito;
    private int cpf;

    public int getNumeroConta() {
        return NumeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        NumeroConta =numeroConta;
    }
    public String getAgencia() {
        return Agencia;
    }
    public void setAgencia(String agencia) {
        Agencia = agencia;
    }
    public String getNomeCliente() {
        return NomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void depositar(double deposito){
        setSaldo(saldo+deposito);
    }


    @Override
    public String toString() {
        return "ContaTerminal{" +
                ", NumeroConta=" + NumeroConta +
                ", Agencia='" + Agencia + '\'' +
                ", NomeCliente='" + NomeCliente + '\'' +
                ", saldo=" + saldo +
                ", cpf=" + cpf +
                '}';
    }
}
