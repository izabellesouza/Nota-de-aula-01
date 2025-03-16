package questao03;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.setNome(sc.nextLine());

        System.out.print("Digite o preço do produto: ");
        produto.setPreco(sc.nextDouble());

        System.out.print("Digite a quantidade em estoque: ");
        produto.setQuantidade(sc.nextInt());


        System.out.println("\nProduto cadastrado:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());


        System.out.println("\nO que você deseja fazer?");
        System.out.println("1 - Adicionar estoque");
        System.out.println("2 - Vender produto");
        System.out.println("3 - Consultar estoque");
        int opcao = sc.nextInt();

        if (opcao == 1) {

            System.out.print("Quantas unidades deseja adicionar ao estoque? ");
            int quantidadeAdicionar = sc.nextInt();
            produto.adicionarEstoque(quantidadeAdicionar);
            System.out.println("Estoque atualizado. Quantidade atual: " + produto.getQuantidade());
        } else if (opcao == 2) {

            System.out.print("Quantas unidades deseja vender? ");
            int quantidadeVender = sc.nextInt();
            if (produto.venderProduto(quantidadeVender)) {
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Erro: Não há estoque suficiente para a venda.");
            }
        } else if (opcao == 3) {

            System.out.println("Estoque atual: " + produto.getQuantidade());
        } else {
            System.out.println("Opção inválida!");
        }


        System.out.println("\nEstoque final do produto: " + produto.getQuantidade());


        sc.close();
    }
}