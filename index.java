import java.util.ArrayList;
import java.util.Scanner;



public class index {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Dono> donos = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();

        boolean sair = false;

        System.out.println("========== PETSHOP ==========");

        while (!sair) {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Número para contato");
            System.out.println("2 - Marcar consulta (Cadastrar dono)");
            System.out.println("3 - Descrição do Pet");
            System.out.println("4 - Encerrar atendimento");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:

                    System.out.println("\nCONTATO:");
                    System.out.println("(65) 9 9999-9999");

                    break;

                case 2:

                         if (donos.size() >= 1) {
                        System.out.println("Existem pelo menos 2 candidatos");
                            break;
                    }
                        
                    System.out.println("\n=== CADASTRO DO DONO ===");

                    System.out.println("Nome do dono:");
                    String nome = sc.nextLine();

                    System.out.println("CPF:");
                    String cpf = sc.nextLine();

                    System.out.println("Telefone:");
                    String telefone = sc.nextLine();

                    System.out.println("qual serviço deseja para seu PET");
                    String serviço = sc.nextLine();

                    Dono dono = new Dono();
                    dono.nome = nome;
                    dono.cpf = cpf;
                    dono.telefone = telefone;
                    dono.serviço = serviço;

                    donos.add(dono);

                    for (Dono registra : donos) {
                        System.out.println("====== CADASTRADO COM SUCESSO =======");
                        System.out.println("NOME DA PESSOA: " + dono.nome);
                        System.out.println("CPF : " + dono.cpf);
                        System.out.println("TEFONE : " + dono.telefone);
                        System.out.println("SERVIÇO DE PET : " + dono.serviço);
                        System.out.println("=====================================");
                    }

                   

                    break;

                case 3:

                    System.out.println("\n=== CADASTRO DO PET ===");

                    System.out.println("Digite o CPF do dono:");
                    String cpfBusca = sc.nextLine();

                    Dono donoEncontrado = null;

                    for (Dono d : donos) {

                        if (d.cpf.equals(cpfBusca)) {

                            donoEncontrado = d;
                            break;
                        }
                    }

                    if (donoEncontrado == null) {

                        System.out.println("Dono não encontrado!");
                        break;
                    }

                    System.out.println("Nome do pet:");
                    String nomePet = sc.nextLine();

                    System.out.println("Idade do pet:");
                    int idadePet = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Raça do pet:");
                    String racaPet = sc.nextLine();

                    Pet pet = new Pet();
                    pet.nomePet = nomePet;
                    pet.idadePet = idadePet;
                    pet.racaPet = racaPet;
                    pet.dono = donoEncontrado;

                    pets.add(pet);

                    for (Pet registrar : pets) {
                        System.out.println("====== CADASTRADO COM SUCESSO =======");
                        System.out.println("NOME DA PESSOA: " + pet.nomePet);
                        System.out.println("CPF : " + pet.idadePet);
                        System.out.println("TEFONE : " + pet.racaPet);
                        System.out.println("=====================================");
                    }

                    break;

                case 4:

                    System.out.println("Atendimento encerrado.");
                    sair = true;

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        }
            
                 System.out.println("\n=== LISTA DE PETS CADASTRADOS ===");

        for (Pet p : pets) {

            System.out.println("----------------------------");
            System.out.println("Nome do Pet: " + p.nomePet);
            System.out.println("Idade: " + p.idadePet);
            System.out.println("Raça: " + p.racaPet);
            System.out.println("Dono: " + p.dono.nome);
            System.out.println("CPF: " + p.dono.cpf);
        }
      

    
    }
}