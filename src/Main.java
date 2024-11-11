import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Clientes clientes = new Clientes("", "","","", 0);

         Clientes[] client = new Clientes[1000];
         int i = 1;

         Corretores corretores = new Corretores("","","","",0);

            Corretores[] broker = new Corretores[1000];

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

                        String password = clientes.senha;

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

                    } else if (option1 == 2 || option == 1) {

                        while (true) {
                            //pular linha usando o next.line
                            String pularLinha1 = scanner.nextLine();
                            System.out.println("Login");
                            System.out.println("Digite seu Email: ");
                            String emailCadastrado = scanner.nextLine();
                            System.out.println("Digite sua Senha: ");
                            String senhaCadastrada = scanner.nextLine();
                            if (clientes.getEmail().equals(emailCadastrado) && clientes.senha.equals(senhaCadastrada)) {
                                System.out.println("Login aceito ");
                                System.out.println(clientes.retornar());
                                break;
                            } else {
                                System.out.println("Email ou Senha Incorretos tente novamente: ");
                                System.out.println("Pressione Enter para Tentar Novamente: ");

                            }

                        }

                    }

                }
            }
        } else if (escolha == 2) {
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

                        String password = clientes.senha;

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

                        while (true) {
                            //pular linha usando o next.line
                            String pularLinha1 = scanner.nextLine();
                            System.out.println("Login");
                            System.out.println("Digite seu Email: ");
                            String emailCadastrado = scanner.nextLine();
                            System.out.println("Digite sua Senha: ");
                            String senhaCadastrada = scanner.nextLine();
                            if (clientes.getEmail().equals(emailCadastrado) && clientes.senha.equals(senhaCadastrada)) {
                                System.out.println("Login aceito ");
                                System.out.println(clientes.retornar());
                                break;
                            } else {
                                System.out.println("Email ou Senha Incorretos tente novamente: ");
                                System.out.println("Pressione Enter para Tentar Novamente: ");

                            }
                        }
                    }
                }
            }
        }
    }
}