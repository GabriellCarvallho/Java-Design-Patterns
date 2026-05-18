import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prepara um carrinho de compras simples (simulado pelo Pedido)
        Pedido pedido = new Pedido(389.90);
        System.out.println("--- CARRINHO DE COMPRAS ---");
        System.out.printf("Valor total do pedido: R$ %.2f\n", pedido.getPedido());
        System.out.println("---------------------------");

        // 2. Pergunta se o usuário deseja realizar o pagamento
        System.out.print("Deseja realizar o pagamento deste pedido? (S/N): ");
        String confirmar = scanner.nextLine().trim().toUpperCase();

        if (!confirmar.equals("S")) {
            System.out.println("Compra cancelada. O carrinho continua aberto.");
            scanner.close();
            return;
        }

        // 3. Oferece as opções de métodos de pagamento disponíveis
        System.out.println("\nSelecione o método de pagamento:");
        System.out.println("1 - PayPal");
        System.out.println("2 - Cartão de Crédito");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        PagamentoEstrategia estrategiaEscolhida = null;

        // 4. Coleta os dados de forma específica para cada estratégia
        if (opcao == 1) {
            System.out.println("\n--- DADOS DO PAYPAL ---");
            System.out.print("Digite o e-mail: ");
            String email = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            // Instancia a estratégia do PayPal
            estrategiaEscolhida = new PagamentoPayPal(email, senha);

        } else if (opcao == 2) {
            System.out.println("\n--- DADOS DO CARTÃO DE CRÉDITO ---");
            System.out.print("Número do cartão: ");
            String numero = scanner.nextLine();
            System.out.print("Data de expiração (mm/aa): ");
            String data = scanner.nextLine();
            System.out.print("Código de segurança (CVV): ");
            String cvv = scanner.nextLine();

            // Instancia a estratégia do Cartão
            estrategiaEscolhida = new PagamentoCartao(numero, data, cvv);
            
        } else {
            System.out.println("Opção inválida! Processo abortado.");
        }

        // 5. Executa o pagamento injetando a estratégia no Contexto
        if (estrategiaEscolhida != null) {
            pedido.fecharPagamento(estrategiaEscolhida);
        
        }

        scanner.close();
    }
}