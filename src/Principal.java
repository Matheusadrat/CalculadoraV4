import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int continuar;
        do {
            double resultado = 0;
            double num1 = EntradaSaida.solicitaNumero("1º");
            double num2 = EntradaSaida.solicitaNumero("2º");
            int operacao = EntradaSaida.solicitaOperacao();
            switch (operacao) {
                case 1:
                    Soma soma = new Soma();
                    resultado = soma.calculaSoma();
                    break;
                case 2:
                    Subtracao sub = new Subtracao();
                    resultado = sub.calculaSubtracao();
                    break;
                case 3:
                    Multiplicacao multi = new Multiplicacao();
                    resultado = multi.calculaMultiplicacao();
                    break;
                case 4:
                    while (num2 == 0) {
                        num2 = EntradaSaida.solicitaNumero("2º");
                    }
                    Divisao divi = new Divisao();
                    resultado = divi.calculaDivisao();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada!");
                    System.exit(0);
            }
            EntradaSaida.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1 - Sim | 2- Não"));
        } while (continuar == 1);
    }
}