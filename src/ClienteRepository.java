import java.util.ArrayList;
import java.util.List;

public interface ClienteRepository {
    void adicionar(Clientes cliente);
    Clientes buscarPorEmail(String email);
    List<Clientes> buscarTodos();
    void atualizar(Clientes cliente);
    void excluir(String email);
}


