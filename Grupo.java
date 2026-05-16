import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nomeDoGrupo;
    private List<Personagem> membros;
    
    public Grupo(String nomeDoGrupo){
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeGrupo(){
        return this.nomeDoGrupo;
    }

    public void adicionarMembro(Personagem personagem){
        membros.add(personagem);
    }

    public void listarMembros(){
        System.out.println("\n--- Membros do Grupo "+ nomeDoGrupo + "-----");
        for(Personagem p : membros){
            System.out.println("- " + p.getNome() + " (" + p.getClasse() + " - Nível " + p.getNivel() + ")");
        }
    }

    public void batalhar(Personagem a, Personagem b){
        double poderTotalA = a.getNivel() * a.getPoderBase();
        double poderTotalB = b.getNivel() * b.getPoderBase();

        System.out.println("\nCONFRONTO: " + a.getNome() + " Poder total:" + poderTotalA + " VS " + b.getNome() + " Poder total: "+ poderTotalB +" ---");

        if (poderTotalA > poderTotalB) {
            System.out.println(a.getClasse() + " " + a.getNome() + " venceu! Poder total: " + poderTotalA);
        } else if (poderTotalB > poderTotalA) {
            System.out.println(b.getClasse() + " " + b.getNome() + " venceu! Poder total: " + poderTotalB);
        } else {
            System.out.println("Empate! Ambos possuem o mesmo poder total: " + poderTotalA);
        }
    }

    public ArrayList<Personagem> getMembros() {
        return (ArrayList<Personagem>) membros;
    }
}
