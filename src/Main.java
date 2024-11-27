import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Clientes clientes = new Clientes("", "","","", 0);

         Clientes[] client = new Clientes[1000];
         int i = 1;

         Corretores corretores = new Corretores("","","","",0);

            Corretores[] broker = new Corretores[1000];
        Imoveis.Compra compra = new Imoveis.Compra("",0,0,0);
        Imoveis imoveis = new Imoveis("", 0, 0, 0);

            Imoveis[] property = new Imoveis[1000];

        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("#####                        #####");
        System.out.println("#####         CELV'TS        #####");
        System.out.println("#####                        #####");
        System.out.println("###################################");
        System.out.println("###################################");

        System.out.println("Bem vindo a Corretora CELV'TS");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é cliente ou corretor?");
        System.out.println("[1] Cliente");
        System.out.println("[2] Corretor");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Você ja tem uma conta?");
            System.out.println("[1] Sim");
            System.out.println("[2] Não");
            int option = scanner.nextInt();

            if (option == 2) {


                while (i < client.length) {

                    //pular linha usando o next.line
                    String pularLinha = scanner.nextLine();

                    System.out.println("Digite seu Nome: ");
                    clientes.setNome(scanner.nextLine());

                    System.out.println("Digite seu CPF: ");
                    clientes.setCpf(scanner.nextLine());

                    System.out.println("Digite seu Email: ");
                    clientes.setEmail(scanner.nextLine());

                    String email = "";

                    System.out.println("Digite uma Senha: ");
                    clientes.setSenha(scanner.nextLine());
                    String senha = "";

                    while (true) {

                        System.out.println("Confirme Sua senha: ");
                        String senhaDigitada = scanner.nextLine();


                        if (!clientes.getSenha().equals(senhaDigitada)) {
                            System.out.println("A senha não confere com a senha digitada");
                            System.out.println("Tente Novamente");
                        } else {
                            break;

                        }

                    }
                    System.out.println("Digite sua idade: ");
                    clientes.setIdade(scanner.nextInt());


                    System.out.println("Digite o Numero desejado: ");
                    System.out.println("[1] Novo Cadastro");
                    System.out.println("[2] Login");
                    int option1 = scanner.nextInt();

                    if (option1 == 1) {
                        i++;

                    } else if (option1 == 2) {

                        boolean continuar = true;

                        while (continuar) {
                            //pular linha usando o next.line
                            String pularLinha1 = scanner.nextLine();
                            System.out.println("Login");
                            System.out.println("Digite seu Email: ");
                            String emailCadastrado = scanner.nextLine();
                            System.out.println("Digite sua Senha: ");
                            String senhaCadastrada = scanner.nextLine();
                            if (clientes.getEmail().equals(emailCadastrado)
                                    && clientes.getSenha().equals(senhaCadastrada)) {
                                System.out.println("Login aceito ");

                            } else {
                                System.out.println("Email ou Senha Incorretos tente novamente: ");
                                System.out.println("Pressione Enter para Tentar Novamente: ");

                            }

                            System.out.println("Vamos comprar seu primeiro imovel?");

                            System.out.println("Digite o Valor do Imovel que Você Deseja");
                            imoveis.setValor(scanner.nextFloat());

                            System.out.println("Digite a Quantidade Maxima de Parcelas Desejada");
                            imoveis.setParcelas(scanner.nextInt());

                            System.out.println("Digite o Valor de Entrada Que Você preterde pagar");
                            imoveis.setValorEntrada(scanner.nextFloat());

                            Random random = new Random(100000000);
                            int numeroRandom = random.nextInt();
                            System.out.println("O id do Imovel que Você Esta Procurando é: "+ numeroRandom);

                            float ValorParcelas = (imoveis.valor - imoveis.valorEntrada)  / imoveis.parcelas;

                            System.out.println("O valor das Prestações ficam de: " + ValorParcelas +"R$");

                            System.out.println("Você Deseja Compra?");
                            System.out.println("[1] Sim");
                            System.out.println("[2] Não");
                            int compraImovel = scanner.nextInt();

                            if (compraImovel == 1){
                                compra.compraEfetuada();
                            }else {
                                System.out.println("Tudo Bem, Até uma Proxima Compra.");
                            }

                            System.out.println("Deseja realizar outra operação?");
                            System.out.println("[1] Sim");
                            System.out.println("[2] Não");
                            int opcao = scanner.nextInt();
                            scanner.nextLine();
                            if (opcao == 2) {
                                continuar = false;
                                System.out.println("Encerrando o programa. Obrigado por usar nosso sistema!");

                            }

                        }

                    }

                }
            }
        } else if (escolha == 2) {
                        System.out.println("Você ja tem uma conta?");
                        System.out.println("[1] Sim");
                        System.out.println("[2] Não");
                        int optionCo = scanner.nextInt();

                        if (optionCo == 2) {


                            while (i < client.length) {

                                //pular linha usando o next.line
                                String pularLinha = scanner.nextLine();

                                System.out.println("Digite seu Nome: ");
                                corretores.setNomeCorretor(scanner.nextLine());

                                System.out.println("Digite seu CPF: ");
                                corretores.setCpfCorretor(scanner.nextLine());

                                System.out.println("Digite seu Email: ");
                                corretores.setEmailCorretor(scanner.nextLine());

                                String emailCo = "";

                                System.out.println("Digite uma Senha: ");
                                corretores.setSenhaCorretor(scanner.nextLine());
                                String senhaCo = "";

                                while (true) {

                                    System.out.println("Confirme Sua senha: ");
                                    String senhaDigitadaCo = scanner.nextLine();

                                    if (!corretores.getSenhaCorretor().equals(senhaDigitadaCo)) {
                                        System.out.println("A senha não confere com a senha digitada");
                                        System.out.println("Tente Novamente");
                                    } else {
                                        break;

                                    }

                                }
                                System.out.println("Digite sua idade: ");
                                corretores.setIdadeCorretor(scanner.nextInt());

                                System.out.println("Digite o Numero desejado: ");
                                System.out.println("[1] Novo Cadastro");
                                System.out.println("[2] Login");
                                int option1Co = scanner.nextInt();

                                if (option1Co == 1) {
                                    i++;

                                } else if (option1Co == 2) {

                        boolean continuarC = true;

                        while (continuarC) {
                            //pular linha usando o next.line
                            String pularLinha1 = scanner.nextLine();
                            System.out.println("Login");
                            System.out.println("Digite seu Email: ");
                            String emailCadastradoCo = scanner.nextLine();
                            System.out.println("Digite sua Senha: ");
                            String senhaCadastradaCo = scanner.nextLine();
                            if (corretores.getEmailCorretor().equals(emailCadastradoCo)
                                    && corretores.getSenhaCorretor().equals(senhaCadastradaCo)) {
                                System.out.println("Login aceito, Bem-Vindo Corretor");


                            } else {
                                System.out.println("Email ou Senha Incorretos tente novamente: ");
                                System.out.println("Pressione Enter para Tentar Novamente: ");

                            }

                            System.out.println("Cadastre o Imovel");

                            System.out.println("Digite o Id do Imovel");
                            imoveis.setImovel(scanner.nextLine());

                            System.out.println("Digite o Valor do Imovel");
                            imoveis.setValor(scanner.nextFloat());

                            System.out.println("Digite a Quantidade Maxima de Parcelas");
                            imoveis.setParcelas(scanner.nextInt());

                            System.out.println("Digite o Valor de Entrada");
                            imoveis.setValorEntrada(scanner.nextFloat());

                            float ValorParcelas = (imoveis.valor - imoveis.valorEntrada)  / imoveis.parcelas;

                            System.out.println("O valor das Prestações ficam de: " + ValorParcelas +"R$");

                            System.out.println("Deseja Cadastrar Outro Imovel?");
                            System.out.println("[1] Sim");
                            System.out.println("[2] Não");
                            int opcaoC = scanner.nextInt();
                            scanner.nextLine();
                            if (opcaoC == 2) {
                                continuarC = false;
                                System.out.println("Encerrando o programa. Obrigado por usar nosso sistema!");
                            }
                        }
                    }
                }
            }
        }
    }
}