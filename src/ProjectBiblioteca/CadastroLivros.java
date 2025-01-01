package ProjectBiblioteca;

import Entidade.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLivros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> listaLivros = new ArrayList<>();

        System.out.println("\n*** CADASTRO  LIVRARIA ***");
        System.out.println("==========================");

        int user;
        do {
            System.out.println("\n==========================");
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("==========================");
            System.out.println("[1] Adicionar Livro");
            System.out.println("[2] Consultar Inventário");
            System.out.println("[3] Remover Livro");
            System.out.println("[0] Sair");
            System.out.println("==========================");
            System.out.print("Informe um número: ");
            user = sc.nextInt();

            int index;
            switch (user) {
                case 1:
                    System.out.print("Quantos Livros deseja adicionar: ");
                    int livros = sc.nextInt();

                    for (index = 0; index < livros; ++index) {
                        System.out.println("==========================");
                        System.out.print("Título do Livro: ");
                        sc.nextLine();
                        String tituloLivro = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("ISBN: ");
                        int isbn = sc.nextInt();
                        System.out.print("Edição: ");
                        int ed = sc.nextInt();

                        Livro livro = new Livro(tituloLivro, autor, isbn, ed);
                        listaLivros.add(livro);
                    }

                    System.out.println("==========================");
                    System.out.println("Sucessfull!");
                    System.out.println("==========================");
                    break;
                case 2:
                    System.out.println("==========================");
                    System.out.println("\n==========================");
                    System.out.println("Consultando o inventário. . .");

                    if (listaLivros.isEmpty()) {
                        System.out.println("O inventário está vazio!");
                    } else {
                        System.out.println("Livros Cadastrados: ");
                    }

                    index = 0;
                    for (Livro livro : listaLivros) {
                        System.out.println("[" + index + "]: " + livro);
                        index = index + 1;
                    }

                    System.out.println("==========================");
                    break;
                case 3:
                    if (listaLivros.isEmpty()) {
                        System.out.println("ERRO. O usuário não informou nenhum livro!");
                        System.out.println("==========================");
                    } else {
                        System.out.print("Informe qual o Livro deseja remover? ");
                        int removeLivro = sc.nextInt();
                        listaLivros.remove(removeLivro);
                        System.out.println("==========================");
                        System.out.println("Livro informado removido!");
                        System.out.println("==========================");
                    }
                    break;
            }
        } while (user != 0);
            System.out.println("==========================");
            System.out.println("Você finalizou o cadastro. Volte sempre! :)");
    }
}