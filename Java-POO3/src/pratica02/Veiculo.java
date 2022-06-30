package pratica02;

public class Veiculo{
    private String modelo;
    private String marca;
    private int preco;

    public Veiculo(String modelo, String marca, int preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo " +
                "modelo = '" + modelo + '\'' +
                ", marca = '" + marca + '\'' +
                ", preco = " + preco;
    }
}
