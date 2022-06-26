package Exemplo001;

public class Temperaturas {
    String cidades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};;
    int temperaturas[][] = new int [10][2];
    private int temperaturaMinima = 0;
    private int temperatraMaxima = 1;

    Temperaturas() {
        this.setTemperaturas();
    }

    public void getCidades() {
        for (int index = 0; index < cidades.length; index += 1) {
            System.out.println(cidades[index]);
            System.out.println("Temperatura Mínima: "
                    + temperaturas[index][temperaturaMinima]
                    + " Temperatura Máxima: "
                    + temperaturas[index][temperatraMaxima]);
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
                    temperaturas[linha][temperatraMaxima] = 33;
                    break;
                case 1:
                    temperaturas[linha][temperaturaMinima] = -3;
                    temperaturas[linha][temperatraMaxima] = 32;
                    break;
                case 2:
                    temperaturas[linha][temperaturaMinima] = -8;
                    temperaturas[linha][temperatraMaxima] = 27;
                    break;
                case 3:
                    temperaturas[linha][temperaturaMinima] = 4;
                    temperaturas[linha][temperatraMaxima] = 37;
                    break;
                case 4:
                    temperaturas[linha][temperaturaMinima] = 6;
                    temperaturas[linha][temperatraMaxima] = 42;
                    break;
                case 5:
                    temperaturas[linha][temperaturaMinima] = 5;
                    temperaturas[linha][temperatraMaxima] = 43;
                    break;
                case 6:
                    temperaturas[linha][temperaturaMinima] = 0;
                    temperaturas[linha][temperatraMaxima] = 39;
                    break;
                case 7:
                    temperaturas[linha][temperaturaMinima] = -7;
                    temperaturas[linha][temperatraMaxima] = 26;
                    break;
                case 8:
                    temperaturas[linha][temperaturaMinima] = -1;
                    temperaturas[linha][temperatraMaxima] = 31;
                    break;
                case 9:
                    temperaturas[linha][temperaturaMinima] = -10;
                    temperaturas[linha][temperatraMaxima] = 35;
                    break;
            }
        }
    }
}
