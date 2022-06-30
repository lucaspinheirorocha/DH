package pratica02;

public class AppGaragem {
    public static void main(String[] args) {

//      Veiculo fiesta = new Veiculo("Ford", "Fiesta", 1000);
        Veiculo focus = new Veiculo("Ford", "Focus", 1200);
        Veiculo explorer = new Veiculo("Ford", "Explorer", 2500);
        Veiculo uno = new Veiculo("Fiat", "Uno", 500);
        Veiculo cronos = new Veiculo("Fiat", "Cronos", 1000);
        Veiculo torino = new Veiculo("Fiat", "Torino", 1250);
        Veiculo aveo = new Veiculo("Chevrolet", "Aveo", 1250);
        Veiculo spin = new Veiculo("Chevrolet", "Spin", 2500);
        Veiculo corolla = new Veiculo("Toyota", "Corolla", 1200);
        Veiculo fortuner = new Veiculo("Toyota", "Fortuner", 3000);
        Veiculo logan = new Veiculo("Renault", "Logan", 950);

        Garagem garagem01 = new Garagem(1);

        garagem01.adicionarVeiculo(new Veiculo("Ford", "Fiesta", 1000));
        garagem01.adicionarVeiculo(focus);
        garagem01.adicionarVeiculo(explorer);
        garagem01.adicionarVeiculo(uno);
        garagem01.adicionarVeiculo(cronos);
        garagem01.adicionarVeiculo(torino);
        garagem01.adicionarVeiculo(aveo);
        garagem01.adicionarVeiculo(spin);
        garagem01.adicionarVeiculo(corolla);
        garagem01.adicionarVeiculo(fortuner);
        garagem01.adicionarVeiculo(logan);

        garagem01.getListaDeVeiculos().stream().forEach(System.out::println);
    }
}
