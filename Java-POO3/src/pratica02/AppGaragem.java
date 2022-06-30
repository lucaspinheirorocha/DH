package pratica02;

import java.util.Comparator;

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

        garagem01.getListaDeVeiculos()
                .stream()
                .forEach(System.out::println);

        garagem01.getListaDeVeiculos()
                .stream()
                .sorted(Comparator.comparingInt(Veiculo::getPreco)) // equivalente a (p1, p2) -> p1.getPreco() - p2.getPreco();
                .forEach(System.out::println);

        garagem01.getListaDeVeiculos()
                .stream()
                .sorted(Comparator.comparing(Veiculo::getMarca)) // equivale a (m1, m2) -> m1.getMarca().compareTo(m1.getMarca());
                .forEach(System.out::println);

        garagem01.getListaDeVeiculos()
                .stream()
                .filter(p -> p.getPreco() < 1000)
                .forEach(System.out::println);

        garagem01.getListaDeVeiculos()
                .stream()
                .filter(p -> p.getPreco() >= 1000)
                .forEach(System.out::println);

        System.out.println(garagem01.getListaDeVeiculos()
                .stream()
                .mapToDouble(Veiculo::getPreco)
                .average().getAsDouble());
    }
}
