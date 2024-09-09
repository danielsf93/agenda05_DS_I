package descontoprogressivo; // Define o pacote onde esta classe está localizada

import java.util.Scanner; // Importa a classe Scanner para permitir a entrada de dados pelo usuário

public class DescontoProgressivo {
    public static void main(String[] args) {
        // Declaração de variáveis
        double valorCompra, desconto, valorFinal; 
        // "valorCompra" armazena o valor total da compra,
        // "desconto" armazena a porcentagem de desconto,
        // "valorFinal" armazena o valor final após aplicar o desconto.

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada de dados do usuário
        
        // Entrada de dados
        System.out.println("Digite o valor total da compra: ");
        valorCompra = scanner.nextDouble(); // Recebe o valor total da compra digitado pelo usuário

        // Cálculo do desconto baseado no valor da compra
        // Verifica em qual faixa de desconto o valor da compra se encaixa
        if (valorCompra < 200) { 
            desconto = 0.05; // Aplica 5% de desconto para compras abaixo de R$ 200
        } else if (valorCompra >= 200 && valorCompra < 300) {
            desconto = 0.10; // Aplica 10% de desconto para compras entre R$ 200 e R$ 299,99
        } else {
            desconto = 0.15; // Aplica 15% de desconto para compras de R$ 300 ou mais
        }

        // Cálculo do valor final após aplicar o desconto
        valorFinal = valorCompra - (valorCompra * desconto); 
        // Subtrai o valor do desconto do valor original da compra

        // Exibição dos resultados
        // Exibe o percentual de desconto aplicado e o valor final a ser pago pelo cliente
        System.out.printf("Desconto aplicado: %.0f%%\n", desconto * 100);
        // A função printf exibe o desconto em porcentagem (%)
        
        System.out.printf("Valor total após desconto: R$ %.2f\n", valorFinal);
        // Exibe o valor final formatado com duas casas decimais (%.2f)

        scanner.close(); // Fecha o objeto Scanner para liberar o recurso
    }
}
