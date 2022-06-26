package Exemplo001;

import java.util.Locale;

public class Temperaturas {
    String cidades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};;
    int temperaturas[][] = new int [10][2];
    private int temperaturaMinima = 0;
    private int temperaturaMaxima = 1;
    private String MAIOR = "MAIOR";
    private String MENOR = "MENOR";

    Temperaturas() {
        this.setTemperaturas();
    }

    public void getCidades() {
        int indiceMaiorTemp = this.buscaIndiceTemperatura(this.MAIOR);
        int indiceMenorTemp = this.buscaIndiceTemperatura(this.MENOR);
        int maiorTemperatura = this.getTemperaturaMaxima(indiceMaiorTemp);
        int menorTemperatura = this.getTemperaturaMinima(indiceMenorTemp);

        System.out.println(
                "A cidade com maior temperatura é: "
                + cidades[indiceMaiorTemp]
                + " e tem " + maiorTemperatura + " graus."
                + " A cidade com menor temperatura é: "
                + cidades[indiceMenorTemp]
                + " e tem " + menorTemperatura + " graus."
        );
    }

    private int buscaIndiceTemperatura(String opcao) {
        String opcaoTratada = opcao.toUpperCase(Locale.ROOT);
        int maiorTemperatura = 0;
        int indiceMaiorTemperatura = 0;
        int menorTemperatura = 0;
        int indiceMenorTemperatura = 0;
        for (int i = 0; i < cidades.length; i++) {
            if (temperaturas[i][temperaturaMaxima] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i][temperaturaMaxima];
                indiceMaiorTemperatura = i;
            }

            if (temperaturas[i][temperaturaMinima] < menorTemperatura) {
                menorTemperatura = temperaturas[i][temperaturaMinima];
                indiceMenorTemperatura = i;
            }
        }

        if (opcaoTratada == "MAIOR") {
            return indiceMaiorTemperatura;
        } else {
            return indiceMenorTemperatura;
        }
    }

    private int getTemperaturaMaxima(int index) {
        return this.temperaturas[index][1];
    }

    private int getTemperaturaMinima(int index) {
        return this.temperaturas[index][0];
    }

    private void setTemperaturas() {
        for (int linha = 0; linha < temperaturas.length; linha += 1) {
            switch (linha) {
                case 0:
                    temperaturas[linha][temperaturaMinima] = -2;
                    temperaturas[linha][temperaturaMaxima] = 33;
                    break;
                case 1:
                    temperaturas[linha][temperaturaMinima] = -3;
                    temperaturas[linha][temperaturaMaxima] = 32;
                    break;
                case 2:
                    temperaturas[linha][temperaturaMinima] = -8;
                    temperaturas[linha][temperaturaMaxima] = 27;
                    break;
                case 3:
                    temperaturas[linha][temperaturaMinima] = 4;
                    temperaturas[linha][temperaturaMaxima] = 37;
                    break;
                case 4:
                    temperaturas[linha][temperaturaMinima] = 6;
                    temperaturas[linha][temperaturaMaxima] = 42;
                    break;
                case 5:
                    temperaturas[linha][temperaturaMinima] = 5;
                    temperaturas[linha][temperaturaMaxima] = 43;
                    break;
                case 6:
                    temperaturas[linha][temperaturaMinima] = 0;
                    temperaturas[linha][temperaturaMaxima] = 39;
                    break;
                case 7:
                    temperaturas[linha][temperaturaMinima] = -7;
                    temperaturas[linha][temperaturaMaxima] = 26;
                    break;
                case 8:
                    temperaturas[linha][temperaturaMinima] = -1;
                    temperaturas[linha][temperaturaMaxima] = 31;
                    break;
                case 9:
                    temperaturas[linha][temperaturaMinima] = -10;
                    temperaturas[linha][temperaturaMaxima] = 35;
                    break;
            }
        }
    }
}
