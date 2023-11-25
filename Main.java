import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        FiladePessoas fila = new FiladePessoas();

        Pessoa gestante = new PessoaGestante("Jerson", 36);
        fila.addPessoa(gestante);
        Pessoa pcd = new PessoaPCD("ian", 20, "Masculino");
        fila.addPessoa(pcd);
        Pessoa pcomum = new PessoaComum("Gabriel", 18, "Masculino");
        fila.addPessoa(pcomum);
        Pessoa idosa = new PessoaIdosa("Hercules", 60, "Masculino");
        fila.addPessoa(idosa);

        for (Pessoa p: fila.getFilaPrioridade()) {
            System.out.println(p);
        }
        for (Pessoa p: fila.getFilaComum()) {
            System.out.println(p);
        }
    }
}
