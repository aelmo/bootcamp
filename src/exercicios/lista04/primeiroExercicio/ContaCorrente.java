package exercicios.lista04.primeiroExercicio;

public class ContaCorrente {

    private String numeroConta;

    private String cpfTitular;

    private Double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numeroConta, String cpfTitular, Double saldo) {
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.numeroConta = contaCorrente.getNumeroConta();
        this.cpfTitular = contaCorrente.getCpfTitular();
        this.saldo = contaCorrente.getSaldo();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        if (valor > 0)
            this.saldo += valor;
        else
            System.out.println("O valor deverá ser maior que 0.");
    }

    public void saque(double valor) {
        if (this.saldo >= valor)
            this.saldo -= valor;
        else
            System.out.println("Você não possui saldo suficiente.");
    }

    public void devolucao(double valor) {
        if (this.saldo >= valor)
            this.saldo -= valor;
        else
            System.out.println("Você não possui saldo suficiente para solicitar a devulução.");
    }

    public void transferencia(ContaCorrente contaCorrente, double valor) {
        if (this.saldo >= valor) {
            contaCorrente.setSaldo(contaCorrente.getSaldo() + valor);
            this.saldo -= valor;
        } else {
            System.out.println("Você não tem saldo suficiente!");
        }
    }
}
