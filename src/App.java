import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import modelo.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();
        
        int op = -1;

        do{
            System.out.println("----------------- MENU -----------------");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Relatórios");
            System.out.println("3 - Realizar venda");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.printf("Digite uma opção: ");
            op = ler.nextInt();

            switch(op){

                case 0: 

                return;

                case 1:

                    int opcao = -1;
    
                    System.out.println("----------------- CADASTRO DE PRODUTOS -----------------");

                    System.out.println("1 - Consultar");
                    System.out.println("2 - Incluir");
                    System.out.println("0 - Retornar ao menu");
                    System.out.println();
                    System.out.printf("Digite uma opção: ");
                    opcao = ler.nextInt();
                    ler.nextLine();

                    switch(opcao){

                        case 0:
                        break;

                        case 1: 

                        System.out.printf("Digite o nome do produto que deseja consultar: ");
                        String busca = ler.next();

                        if(listaProdutos.isEmpty()){

                            System.out.println();
                            System.out.println("Não há produtos cadastrados");

                        }else{

                            for(Produto produto : listaProdutos){

                                if(produto.getNome().equalsIgnoreCase(busca)){

                                    System.out.println();
                                    System.out.printf("Nome: " + produto.getNome());
                                    System.out.printf("Codigo: " + produto.getCodigo());
                                    System.out.printf("Valor: " + produto.getValor());
                                    System.out.printf("Quantidade: " + produto.getEstoque());

                                }else{
                                    break;
                                }
                            }
                        }

                        continue;

                        case 2: 

                        Produto produto = new Produto();
                        
                        System.out.println();
                        System.out.printf("Codigo: ");
                        produto.setCodigo(ler.nextInt());
    
                        System.out.printf("Nome: ");
                        produto.setNome(ler.next());
    
                        System.out.printf("Valor: ");
                        produto.setValor(ler.nextFloat());
    
                        System.out.printf("Quantidade: ");
                        produto.setEstoque(ler.nextInt());
                        ler.nextLine();

                        /*System.out.printf("Codigo: ");
                        int pcodigo = ler.nextInt();
    
                        System.out.printf("Nome: ");
                        String pnome = ler.next();
    
                        System.out.printf("Valor: ");
                        float pvalor = ler.nextFloat();;
    
                        System.out.printf("Quantidade: ");
                        int pestoque = ler.nextInt();
                        ler.nextLine();

                        produtos.add(new Produto(pcodigo, pnome, pvalor, pestoque));*/

                        System.out.println();
                        System.out.println("----------------- CADASTRO COMPLETADO! -----------------");

                        break;
                    }


                break;
    
                case 2:
    
                    System.out.println("----------------- RELATORIO DE VENDAS -----------------");
    
                    
    
                break;
    
                case 3:
    
                    System.out.println("----------------- REALIZAR VENDA -----------------");

                    System.out.println("Digite o codigo do produto: ");
                    ler.nextInt();

                    if(listaProdutos.isEmpty()){

                        System.out.println();
                        System.out.println("Não há produtos cadastrados");

                    }else{
                        for(Produto produto : listaProdutos){

                            if(produto.getNome().equalsIgnoreCase(ler)){

                                System.out.println();
                                System.out.printf("Nome: " + produto.getNome());
                                System.out.printf("Codigo: " + produto.getCodigo());
                                System.out.printf("Valor: " + produto.getValor());
                                System.out.printf("Quantidade: " + produto.getEstoque());

                            }else{
                                break;
                            }
                    }
                    
                break;
    
                default:

                    System.out.println();
                    System.out.println("Digite uma opçao valida!");
                    break;
            }

        }while(op != 0);

        System.out.println();
        System.out.println("----------------- PROGRAMA ENCERRADO -----------------");

        ler.close();
    }
}
