package CorridaNaSelva;

public class Participante {
    int rg;
    String nome;
    String sobrenome;
    int idade;
    int numeroTelefone;
    int numeroTelefoneEmergencia;
    String grupoSanguineo;

    public Participante(
            int rg,
            String nome,
            String sobrenome,
            int idade,
            int numeroTelefone,
            int numeroTelefoneEmergencia,
            String grupoSanguineo
    ) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroTelefone = numeroTelefone;
        this.numeroTelefoneEmergencia = numeroTelefoneEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }
}
