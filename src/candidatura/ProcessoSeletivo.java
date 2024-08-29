package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    public static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Julia", "Marcia", "Paulo", "Augusto", "Monica", "Creusa"};
        List<String> candidatosSelecionados = new ArrayList<>();
        double salarioBase = 2000.0;

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            analisarCandidato(candidato, salarioPretendido, salarioBase);

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados.add(candidato);
            }
        }
        System.out.println("Candidatos selecionados:");
        for (String candidatoSelecionado : candidatosSelecionados) {
            System.out.println(candidatoSelecionado);
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(String candidato, double salarioPretendido, double salarioBase) {
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato " + candidato);
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar com contraproposta para o candidato " + candidato);
        } else {
            System.out.println("Aguardando resultados dos demais candidatos para o candidato " + candidato);
        }
    }
}