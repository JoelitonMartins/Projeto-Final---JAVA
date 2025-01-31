import java.util.Random;

public class Batalha {
    private Exército heróis;
    private Exército bestas;

    public Batalha(Exército heróis, Exército bestas) {
        this.heróis = heróis;
        this.bestas = bestas;
    }

    public void iniciarBatalha() {
        int turno = 1;

        while (heróis.tamanho() > 0 && bestas.tamanho() > 0) {
            System.out.println("Turno " + turno + ":");

            int tamanho = Math.min(heróis.tamanho(), bestas.tamanho());

            for (int i = 0; i < tamanho; i++) {
                Personagem herói = heróis.getPersonagem(i);
                Personagem besta = bestas.getPersonagem(i);

                // Herói realiza o ataque
                if (herói.estaVivo() && besta.estaVivo()) {
                    if (herói instanceof Mago) {
                        // Se o personagem é um mago, ele pode curar ou atacar
                        Mago mago = (Mago) herói;
                        Random rand = new Random();
                        if (rand.nextBoolean() && heróis.tamanho() > 1) {
                            // Escolhe um aliado aleatório para curar
                            int aliadoIndex = rand.nextInt(heróis.tamanho());
                            Personagem aliado = heróis.getPersonagem(aliadoIndex);
                            if (!aliado.equals(mago)) {
                                mago.curarAliado(aliado);
                            }
                        } else {
                            // Realiza o ataque contra a besta
                            int ataqueHeroi = herói.calcularAtaque(besta);
                            int danoHeroi = Math.max(0, ataqueHeroi - besta.getArmadura());
                            besta.receberDano(danoHeroi);
                            System.out.println(herói.getNome() + " atacou " + besta.getNome() + " causando " + danoHeroi + " de dano!");
                        }
                    } else {
                        // Heróis que não são magos atacam
                        int ataqueHeroi = herói.calcularAtaque(besta);
                        int danoHeroi = Math.max(0, ataqueHeroi - besta.getArmadura());
                        besta.receberDano(danoHeroi);
                        System.out.println(herói.getNome() + " atacou " + besta.getNome() + " causando " + danoHeroi + " de dano!");
                    }

                    // Besta realiza o ataque, caso ainda esteja viva
                    if (besta.estaVivo()) {
                        int ataqueBesta = besta.calcularAtaque(herói);
                        int danoBesta = Math.max(0, ataqueBesta - herói.getArmadura());
                        herói.receberDano(danoBesta);
                        System.out.println(besta.getNome() + " atacou " + herói.getNome() + " causando " + danoBesta + " de dano!");
                    }
                }
            }

            // Remove personagens mortos de ambos os exércitos
            heróis.removerPersonagemMortos();
            bestas.removerPersonagemMortos();

            turno++;
            System.out.println(); // Linha em branco para separar os turnos
        }

        // Verifica quem venceu
        if (heróis.tamanho() > 0) {
            System.out.println("VITÓRIA DOS HERÓIS!!");
        } else {
            System.out.println("VITÓRIA DAS BESTAS!!");
        }
    }
}



