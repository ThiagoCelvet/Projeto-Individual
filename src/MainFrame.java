import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MainFrame extends JFrame {

    private ClienteRepositoryImpl clienteRepo = new ClienteRepositoryImpl();
    private CorretoresRepositoryImpl corretorRepo = new CorretoresRepositoryImpl();
    private ImovelRepositoryImpl imovelRepo = new ImovelRepositoryImpl();

    private CardLayout cardLayout;
    private JPanel cardsPanel;

    // Components for the client registration
    private JTextField nomeField, cpfField, emailField, senhaField, idadeField;
    private JPasswordField senhaConfirmField;
    private JButton cadastrarButton, loginButton;

    // Components for the corretor registration
    private JTextField nomeCorretorField, cpfCorretorField, emailCorretorField, senhaCorretorField, idadeCorretorField;
    private JPasswordField senhaCorretorConfirmField;
    private JButton cadastrarCorretorButton, loginCorretorButton;

    public MainFrame() {
        setTitle("CELV'TS Corretora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardsPanel = new JPanel(cardLayout);
        add(cardsPanel);

        // Client Panel
        JPanel clientePanel = createClientePanel();
        cardsPanel.add(clientePanel, "Cliente");

        // Corretor Panel
        JPanel corretorPanel = createCorretorPanel();
        cardsPanel.add(corretorPanel, "Corretor");

        // Initial screen
        JPanel initialPanel = createInitialPanel();
        cardsPanel.add(initialPanel, "Initial");

        cardLayout.show(cardsPanel, "Initial");
    }

    private JPanel createInitialPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel welcomeLabel = new JLabel("Bem-vindo à Corretora CELV'TS");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JButton clienteButton = new JButton("Cliente");
        clienteButton.addActionListener(e -> cardLayout.show(cardsPanel, "Cliente"));

        JButton corretorButton = new JButton("Corretor");
        corretorButton.addActionListener(e -> cardLayout.show(cardsPanel, "Corretor"));

        panel.add(welcomeLabel);
        panel.add(clienteButton);
        panel.add(corretorButton);

        return panel;
    }

    private JPanel createClientePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JLabel senhaLabel = new JLabel("Senha:");
        senhaField = new JTextField();

        JLabel senhaConfirmLabel = new JLabel("Confirme a Senha:");
        senhaConfirmField = new JPasswordField();

        JLabel idadeLabel = new JLabel("Idade:");
        idadeField = new JTextField();

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(e -> cadastrarCliente());

        loginButton = new JButton("Login");
        loginButton.addActionListener(e -> realizarLoginCliente());

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(cpfLabel);
        panel.add(cpfField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(senhaLabel);
        panel.add(senhaField);
        panel.add(senhaConfirmLabel);
        panel.add(senhaConfirmField);
        panel.add(idadeLabel);
        panel.add(idadeField);
        panel.add(cadastrarButton);
        panel.add(loginButton);

        return panel;
    }

    private JPanel createCorretorPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel nomeCorretorLabel = new JLabel("Nome:");
        nomeCorretorField = new JTextField();

        JLabel cpfCorretorLabel = new JLabel("CPF:");
        cpfCorretorField = new JTextField();

        JLabel emailCorretorLabel = new JLabel("Email:");
        emailCorretorField = new JTextField();

        JLabel senhaCorretorLabel = new JLabel("Senha:");
        senhaCorretorField = new JTextField();

        JLabel senhaCorretorConfirmLabel = new JLabel("Confirme a Senha:");
        senhaCorretorConfirmField = new JPasswordField();

        JLabel idadeCorretorLabel = new JLabel("Idade:");
        idadeCorretorField = new JTextField();

        cadastrarCorretorButton = new JButton("Cadastrar");
        cadastrarCorretorButton.addActionListener(e -> cadastrarCorretor());

        loginCorretorButton = new JButton("Login");
        loginCorretorButton.addActionListener(e -> realizarLoginCorretor());

        panel.add(nomeCorretorLabel);
        panel.add(nomeCorretorField);
        panel.add(cpfCorretorLabel);
        panel.add(cpfCorretorField);
        panel.add(emailCorretorLabel);
        panel.add(emailCorretorField);
        panel.add(senhaCorretorLabel);
        panel.add(senhaCorretorField);
        panel.add(senhaCorretorConfirmLabel);
        panel.add(senhaCorretorConfirmField);
        panel.add(idadeCorretorLabel);
        panel.add(idadeCorretorField);
        panel.add(cadastrarCorretorButton);
        panel.add(loginCorretorButton);

        return panel;
    }

    private void cadastrarCliente() {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        String email = emailField.getText();
        String senha = senhaField.getText();
        String senhaConfirm = new String(senhaConfirmField.getPassword());
        int idade = Integer.parseInt(idadeField.getText());

        if (senha.equals(senhaConfirm)) {
            Clientes cliente = new Clientes(nome, cpf, email, senha, idade);
            clienteRepo.adicionar(cliente);
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem!");
        }
    }

    private void realizarLoginCliente() {
        String email = emailField.getText();
        String senha = senhaField.getText();

        Clientes cliente = clienteRepo.buscarPorEmail(email);
        if (cliente != null && cliente.getSenha().equals(senha)) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
            cardLayout.show(cardsPanel, "Initial");
        } else {
            JOptionPane.showMessageDialog(this, "Email ou Senha incorretos.");
        }
    }

    private void cadastrarCorretor() {
        String nome = nomeCorretorField.getText();
        String cpf = cpfCorretorField.getText();
        String email = emailCorretorField.getText();
        String senha = senhaCorretorField.getText();
        String senhaConfirm = new String(senhaCorretorConfirmField.getPassword());
        int idade = Integer.parseInt(idadeCorretorField.getText());

        if (senha.equals(senhaConfirm)) {
            Corretores corretor = new Corretores(nome, cpf, email, senha, idade);
            corretorRepo.adicionar(corretor);
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem!");
        }
    }

    private void realizarLoginCorretor() {
        String email = emailCorretorField.getText();
        String senha = senhaCorretorField.getText();

        Corretores corretor = corretorRepo.buscarPorEmail(email);
        if (corretor != null && corretor.getSenhaCorretor().equals(senha)) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
            cardLayout.show(cardsPanel, "Initial");
        } else {
            JOptionPane.showMessageDialog(this, "Email ou Senha incorretos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
