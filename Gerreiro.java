public class Gerreiro extends Personagem {
    double forca;

    public Gerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca){
        super(nome, "Gerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public void usarHabilidadeEspecial(){
        System.out.println(this.nome + " atacou com Espada dos Deuses e causou "+ this.forca + " de dano.");
    }
}
