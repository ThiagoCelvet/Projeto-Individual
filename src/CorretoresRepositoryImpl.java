import java.util.ArrayList;
import java.util.List;

public class CorretoresRepositoryImpl implements CorretoresRepository {

    private List<Corretores> corretores = new ArrayList<>();

    @Override
    public void adicionar(Corretores corretor) {
        corretores.add(corretor);
        System.out.println("Corretor adicionado: " + corretor.retonarCorretor());
    }

    @Override
    public Corretores buscarPorEmail(String email) {
        for (Corretores corretor : corretores) {
            if (corretor.getEmailCorretor().equals(email)) {
                return corretor;
            }
        }
        return null;  // Retorna null se o corretor não for encontrado
    }

    @Override
    public List<Corretores> buscarTodos() {
        return corretores;  // Retorna a lista de todos os corretores
    }

    @Override
    public void atualizar(Corretores corretor) {
        for (int i = 0; i < corretores.size(); i++) {
            if (corretores.get(i).getEmailCorretor().equals(corretor.getEmailCorretor())) {
                corretores.set(i, corretor);  // Atualiza o corretor
                System.out.println("Corretor atualizado: " + corretor.retonarCorretor());
                return;
            }
        }
        System.out.println("Corretor não encontrado para atualização.");
    }

    @Override
    public void excluir(String email) {
        Corretores corretor = buscarPorEmail(email);
        if (corretor != null) {
            corretores.remove(corretor);
            System.out.println("Corretor excluído: " + corretor.retonarCorretor());
        } else {
            System.out.println("Corretor não encontrado para exclusão.");
        }
    }
}
