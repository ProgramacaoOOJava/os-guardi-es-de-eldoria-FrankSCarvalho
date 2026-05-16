public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;

    }

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Vida: " + this.pontosDeVida);
        System.out.println("Poder: " + this.poderBase);

    }
}

