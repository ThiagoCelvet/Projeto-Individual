import java.util.List;

public interface ImovelRepository {
    void adicionar(Imoveis imovel);
    Imoveis buscarPorId(String imovelId);
    List<Imoveis> buscarTodos();
    void atualizar(Imoveis imovel);
    void excluir(String imovelId);
}
