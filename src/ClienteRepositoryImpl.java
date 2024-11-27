import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {
    
    private List<Clientes> clientes = new ArrayList<>();

    @Override
    public void adicionar(Clientes cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado: " + cliente.retornar());
    }

    @Override
    public Clientes buscarPorEmail(String email) {
        for (Clientes cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;  
    }

    @Override
    public List<Clientes> buscarTodos() {
        return clientes;
    }

    @Override
    public void atualizar(Clientes cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getEmail().equals(cliente.getEmail())) {
                clientes.set(i, cliente); 
                System.out.println("Cliente atualizado: " + cliente.retornar());
                return;
            }
        }
        System.out.println("Cliente não encontrado para atualização.");
    }

    @Override
    public void excluir(String email) {
        Clientes cliente = buscarPorEmail(email);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente excluído: " + cliente.retornar());
        } else {
            System.out.println("Cliente não encontrado para exclusão.");
        }
    }
}
