import java.util.List;

public interface CorretoresRepository {
    void adicionar(Corretores corretor);
    Corretores buscarPorEmail(String email);
    List<Corretores> buscarTodos();
    void atualizar(Corretores corretor);
    void excluir(String email);
}
