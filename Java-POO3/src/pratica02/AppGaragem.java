package pratica02;

public class AppGaragem {
    public static void main(String[] args) {
        Veiculos fiesta = new Veiculos("Ford", "Fiesta", 1000);
        Veiculos focus = new Veiculos("Ford", "Focus", 1200);
        Veiculos explorer = new Veiculos("Ford", "Explorer", 2500);
        Veiculos uno = new Veiculos("Fiat", "Uno", 500);
        Veiculos cronos = new Veiculos("Fiat", "Cronos", 1000);
        Veiculos torino = new Veiculos("Fiat", "Torino", 1250);
        Veiculos aveo = new Veiculos("Chevrolet", "Aveo", 1250);
        Veiculos spin = new Veiculos("Chevrolet", "Spin", 2500);
        Veiculos corolla = new Veiculos("Toyota", "Corolla", 1200);
        Veiculos fortuner = new Veiculos("Toyota", "Fortuner", 3000);
        Veiculos logan = new Veiculos("Renault", "Logan", 950);

        Garagem garagem01 = new Garagem(1);
        garagem01.adicionarVeiculo(fiesta);
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

        System.out.println(garagem01);
    }
}
