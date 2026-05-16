

public class Main {
    public static void main(String[] args) {
        // 1. Criando os dois grupos distintos
        Grupo defensores = new Grupo("Defensores de Eldoria");
        Grupo invasores = new Grupo("Invasores do Caos");

        // 2. Criando os múltiplos personagens
        Personagem heroi1 = new Guerreiro("Arthus", 6, 120, 15.0, 30);
        Personagem heroi2 = new Mago("Elenara", 8, 70, 37.5,30 ); // 8 * 37.5 = 300 de poder

        Personagem vilao1 = new Guerreiro("Malakar", 7, 130, 14.0, 0);
        Personagem vilao2 = new Mago("Gorgoroth", 5, 65, 30.0, 0);

        // 3. Adicionando-os aos seus respectivos grupos
        defensores.adicionarMembro(heroi1);
        defensores.adicionarMembro(heroi2);

        invasores.adicionarMembro(vilao1);
        invasores.adicionarMembro(vilao2);

        // 4. Listando os personagens de cada grupo
        defensores.listarMembros();
        invasores.listarMembros();

        // 5. Realizando batalhas e exibindo os resultados
        // Pegamos os personagens de dentro dos grupos para o duelo usando o método auxiliar
        Personagem combatenteA = defensores.getMembros().get(1); // Elenara
        Personagem combatenteB = invasores.getMembros().get(1);  // Gorgoroth

        defensores.batalhar(combatenteA, combatenteB);

    }
}
