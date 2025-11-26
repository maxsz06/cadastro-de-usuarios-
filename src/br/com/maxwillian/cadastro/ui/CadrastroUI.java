package br.com.maxwillian.cadastro.ui;

import br.com.maxwillian.cadastro.model.Cliente;
import br.com.maxwillian.cadastro.repository.ClienteRepository;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class CadrastroUI {

    public int opcao;

    Scanner sc = new Scanner(System.in);

  public void criarMenu(){

    System.out.println("      Cadastro de clientes      ");
    System.out.println("---------------------");
    System.out.println("");
    System.out.println("1 - Cadastrar");
    System.out.println("2 - Listar Todos");
    System.out.println("3 - Exibir cliente por id");
    System.out.println("4 - Excluir cliente");
    System.out.println("5 - Atualizar cliente");
    System.out.println("6 - Sair");
    System.out.println("");
      System.out.println("---------------------");

    System.out.print("Selecione uma opcao: ");

    opcao = sc.nextInt();

    switch (opcao) {

        case 1:
         cadastrarCliente();
            break;

        case 2:
            System.out.print("Listar todos:");
            break;
        case 3:
            System.out.print("Exibir cliente por id:");
            break;
        case 4:
            System.out.print("Excluir cliente:");
            break;
        case 5:
            System.out.print("Atualizar cliente:");
            break;
        case 6:
            System.out.print("Sair:");
            System.exit(0);

            default:
                System.out.println("Opção invalida escolha entre 1 a 6");
                criarMenu();
                break;

    }

 }
  private void cadastrarCliente(){

      UUID id = UUID.randomUUID();
      ClienteRepository clienteRepository = new ClienteRepository();

      Cliente cliente = new Cliente();
      cliente.id=id.toString();
      Scanner sc = new Scanner(System.in);

      System.out.println("");
      System.out.println("Digite o nome do cliente: ");
      cliente.nome = sc.nextLine();

      System.out.print("Digite o email do cliente: ");
      cliente.email = sc.nextLine();

      //-----------[Obter Data de Nascimento]---------------------------
      System.out.println("Data de nascimento do cliente: ");
      String dataNascimento = sc.nextLine();

      dataNascimento = dataNascimento.replace("-", "/");
      String[] dataNascimentoSplit = dataNascimento.split("/");

      cliente.dataNascimento = LocalDate.of(
              Integer.parseInt(dataNascimentoSplit[2]),
              Integer.parseInt(dataNascimentoSplit[1]),
              Integer.parseInt(dataNascimentoSplit[0])
      );
    //------------------------------------------------------------------

      System.out.println("Salario do Cliente: ");
      cliente.salario = sc.nextDouble();
      sc.nextLine();  //Gambiarra do Scanner para limpar o cache


   ClienteRepository clienteRepositoryy = new ClienteRepository();
   clienteRepositoryy.cadastrar();

  }

}
