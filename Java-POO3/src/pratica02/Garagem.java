package pratica02;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> listaDeVeiculos;

    Garagem (int id) {
        this.id = id;
        this.listaDeVeiculos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.listaDeVeiculos.add(veiculo);
    }

    @Override
    public String toString() {
        return "Garagem { " +
                "id = " + id +
                ", listaDeVeiculos = " + listaDeVeiculos +
                " }";
    }
}
