import java.util.ArrayList;
import java.util.List;

public class Exército {
    private List<Personagem> personagens;

    public Exército() {
        personagens = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        personagens.add(p);
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void removerPersonagem(int index) {
        personagens.remove(index);
    }

    public int tamanho() {
        return personagens.size();
    }

    public Personagem getPersonagem(int index) {
        return personagens.get(index);
    }

    public void removerPersonagemMortos() {
        for (int i = personagens.size() - 1; i >= 0; i--) {
            if (!personagens.get(i).estaVivo()) {
                personagens.remove(i);
            }
        }
    }
}
