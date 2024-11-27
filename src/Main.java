import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClienteRepositoryImpl clienteRepo = new ClienteRepositoryImpl();
        CorretoresRepositoryImpl corretorRepo = new CorretoresRepositoryImpl();
        ImovelRepositoryImpl imovelRepo = new ImovelRepositoryImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("#####                        #####");
        System.out.println("#####         CELV'TS        #####");
        System.out.println("#####                        #####");
        System.out.println("##################################");
        System.out.println("##################################");

        System.out.println("Bem-vindo à Corretora CELV'TS");

        System.out.println("Você é cliente ou corretor?");
        System.out.println("[1] Cliente");
        System.out.println("[2] Corretor");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Você já tem uma conta?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            int option = scanner.nextInt();

            if (option == 2) {
                while (true) {
                    scanner.nextLine();

                    System.out.println("Digite seu Nome: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Digite seu CPF: ");
                    String cpfCliente = scanner.nextLine();
                    System.out.println("Digite seu Email: ");
                    String emailCliente = scanner.nextLine();
                    System.out.println("Digite uma Senha: ");
                    String senhaCliente = scanner.nextLine();

                    while (true) {
                        System.out.println("Confirme Sua senha: ");
                        String senhaConfirmada = scanner.nextLine();
                        if (!senhaCliente.equals(senhaConfirmada)) {
                            System.out.println("A senha não confere. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    System.out.println("Digite sua idade: ");
                    int idadeCliente = scanner.nextInt();

                    Clientes cliente = new Clientes(nomeCliente, cpfCliente, emailCliente, senhaCliente, idadeCliente);
                    clienteRepo.adicionar(cliente);

                    System.out.println("Digite o número desejado: ");
                    System.out.println("[1] Novo Cadastro");
                    System.out.println("[2] Login");
                    int option1 = scanner.nextInt();

                    if (option1 == 1) {
                        System.out.println("Cadastro realizado com sucesso!");
                    } else if (option1 == 2) {
                        scanner.nextLine();

                        boolean continuar = true;
                        while (continuar) {
                            System.out.println("Login");
                            System.out.println("Digite seu Email: ");
                            String emailCadastrado = scanner.nextLine();
                            System.out.println("Digite sua Senha: ");
                            String senhaCadastrada = scanner.nextLine();
                            if (clienteRepo.buscarPorEmail(emailCadastrado) != null &&
                                    clienteRepo.buscarPorEmail(emailCadastrado).getSenha().equals(senhaCadastrada)) {
                                System.out.println("Login aceito. Bem-vindo!");

                                System.out.println("Vamos comprar seu primeiro imóvel?");
                                System.out.println("Digite o Valor do Imóvel que Você Deseja:");
                                float valorImovel = scanner.nextFloat();
                                System.out.println("Digite a Quantidade Máxima de Parcelas:");
                                int parcelas = scanner.nextInt();
                                System.out.println("Digite o Valor de Entrada:");
                                float valorEntrada = scanner.nextFloat();

                                Random random = new Random();
                                String imovelId = String.valueOf(random.nextInt(1000000));
                                System.out.println("O ID do Imóvel que Você Está Procurando é: " + imovelId);

                                float valorParcelas = (valorImovel - valorEntrada) / parcelas;
                                System.out.println("O valor das Prestações é: " + valorParcelas + " R$");

                                System.out.println("Você deseja comprar?");
                                System.out.println("[1] Sim");
                                System.out.println("[2] Não");
                                int compraImovel = scanner.nextInt();

                                if (compraImovel == 1) {
                                    System.out.println("Compra efetuada com sucesso!");
                                } else {
                                    System.out.println("Compra cancelada. Até a próxima!");
                                }

                                System.out.println("Deseja realizar outra operação?");
                                System.out.println("[1] Sim");
                                System.out.println("[2] Não");
                                int opcao = scanner.nextInt();
                                if (opcao == 2) {
                                    continuar = false;
                                    System.out.println("Encerrando o programa. Obrigado por usar nosso sistema!");
                                }
                            } else {
                                System.out.println("Email ou Senha incorretos. Tente novamente.");
                            }
                        }
                    }
                }
            }
        } else if (escolha == 2) {
            System.out.println("Você já tem uma conta?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            int optionCo = scanner.nextInt();

            if (optionCo == 2) {
                while (true) {
                    scanner.nextLine();

                    System.out.println("Digite seu Nome: ");
                    String nomeCorretor = scanner.nextLine();
                    System.out.println("Digite seu CPF: ");
                    String cpfCorretor = scanner.nextLine();
                    System.out.println("Digite seu Email: ");
                    String emailCorretor = scanner.nextLine();
                    System.out.println("Digite uma Senha: ");
                    String senhaCorretor = scanner.nextLine();

                    while (true) {
                        System.out.println("Confirme Sua senha: ");
                        String senhaDigitadaCo = scanner.nextLine();
                        if (!senhaCorretor.equals(senhaDigitadaCo)) {
                            System.out.println("A senha não confere. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    System.out.println("Digite sua idade: ");
                    int idadeCorretor = scanner.nextInt();

                    Corretores corretor = new Corretores(nomeCorretor, cpfCorretor, emailCorretor, senhaCorretor, idadeCorretor);
                    corretorRepo.adicionar(corretor);

                    System.out.println("Digite o número desejado: ");
                    System.out.println("[1] Novo Cadastro");
                    System.out.println("[2] Login");
                    int option1Co = scanner.nextInt();

                    if (option1Co == 1) {
                        System.out.println("Cadastro realizado com sucesso!");
                    } else if (option1Co == 2) {
                        scanner.nextLine();

                        boolean continuarC = true;
                        while (continuarC) {
                            System.out.println("Login");
                            System.out.println("Digite seu Email: ");
                            String emailCadastradoCo = scanner.nextLine();
                            System.out.println("Digite sua Senha: ");
                            String senhaCadastradaCo = scanner.nextLine();
                            if (corretorRepo.buscarPorEmail(emailCadastradoCo) != null &&
                                    corretorRepo.buscarPorEmail(emailCadastradoCo).getSenhaCorretor().equals(senhaCadastradaCo)) {
                                System.out.println("Login aceito. Bem-vindo, Corretor!");

                                System.out.println("Cadastre um imóvel");
                                System.out.println("Digite o ID do Imóvel:");
                                String imovelId = scanner.nextLine();
                                System.out.println("Digite o Valor do Imóvel:");
                                float valorImovel = scanner.nextFloat();
                                System.out.println("Digite a Quantidade Máxima de Parcelas:");
                                int parcelas = scanner.nextInt();
                                System.out.println("Digite o Valor de Entrada:");
                                float valorEntrada = scanner.nextFloat();

                                Imoveis imovel = new Imoveis(imovelId, valorImovel, parcelas, valorEntrada);
                                imovelRepo.adicionar(imovel);

                                System.out.println("Deseja cadastrar outro imóvel?");
                                System.out.println("[1] Sim");
                                System.out.println("[2] Não");
                                int opcaoC = scanner.nextInt();
                                if (opcaoC == 2) {
                                    continuarC = false;
                                    System.out.println("Encerrando o programa. Obrigado por usar nosso sistema!");
                                }
                            } else {
                                System.out.println("Email ou Senha incorretos. Tente novamente.");
                            }
                        }
                    }
                }
            }
        }
    }
}
