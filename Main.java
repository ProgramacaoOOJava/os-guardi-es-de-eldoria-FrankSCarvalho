import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gerreiro garen = new Gerreiro("Garen", 1, 100, 10, 49.5);
        Mago merlin = new Mago("Merlin", 1, 50, 25, 55);

        garen.exibirStatus();
        garen.usarHabilidadeEspecial();

        merlin.exibirStatus();
        merlin.usarHabilidadeEspecial();

        System.out.println("\n--- Demonstração de Polimerfismo ---");

        List<Personagem> herois = new ArrayList<>();

        herois.add(garen);
        herois.add(merlin);
        herois.add(new Gerreiro("Goku", 1000, 50000000, 1000000, 560000000));

        for(Personagem p : herois){
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("----------------------------------------------------------");
        }

    }
}
