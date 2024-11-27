import java.util.ArrayList;
import java.util.List;

public class ImovelRepositoryImpl implements ImovelRepository {

    private List<Imoveis> imoveis = new ArrayList<>();

    @Override
    public void adicionar(Imoveis imovel) {
        imoveis.add(imovel);
        System.out.println("Imóvel adicionado: " + imovel.retonarImoveis());
    }

    @Override
    public Imoveis buscarPorId(String imovelId) {
        for (Imoveis imovel : imoveis) {
            if (imovel.getImovel().equals(imovelId)) {
                return imovel;
            }
        }
        return null;
    }

    @Override
    public List<Imoveis> buscarTodos() {
        return imoveis;
    }

    @Override
    public void atualizar(Imoveis imovel) {
        for (int i = 0; i < imoveis.size(); i++) {
            if (imoveis.get(i).getImovel().equals(imovel.getImovel())) {
                imoveis.set(i, imovel);
                System.out.println("Imóvel atualizado: " + imovel.retonarImoveis());
                return;
            }
        }
        System.out.println("Imóvel não encontrado para atualização.");
    }

    @Override
    public void excluir(String imovelId) {
        Imoveis imovel = buscarPorId(imovelId);
        if (imovel != null) {
            imoveis.remove(imovel);
            System.out.println("Imóvel excluído: " + imovel.retonarImoveis());
        } else {
            System.out.println("Imóvel não encontrado para exclusão.");
        }
    }
}
