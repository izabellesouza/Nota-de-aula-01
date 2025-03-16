package questao04;

public class Banco {
    private double saldo;

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente para saque.");
            return false;
        }
    }

    public boolean transferir(double valor, Banco contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente para transferência.");
            return false;
        }
    }
}