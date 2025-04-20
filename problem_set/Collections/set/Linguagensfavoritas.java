package problem_set.Collections.set;
import java.util.*;

// Classe com Comparable para ordenar por nome
class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() { return nome; }
    public int getAnoDeCriacao() { return anoDeCriacao; }
    public String getIde() { return ide; }

    @Override
    public String toString() {
        return nome + " - " + anoDeCriacao + " - " + ide;
    }

    @Override
    public int compareTo(LinguagemFavorita l) {
        return this.nome.compareToIgnoreCase(l.getNome());
    }
}

// Comparators para ordenações personalizadas
class ComparatorIDE implements Comparator<LinguagemFavorita> {
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAnoENome implements Comparator<LinguagemFavorita> {
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0) return ano;
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0) return ano;
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

public class Linguagensfavoritas {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagens.add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
        linguagens.add(new LinguagemFavorita("JavaScript", 1995, "VS Code"));

        // A: Ordem de inserção
        System.out.println("A) Ordem de Inserção:");
        for (LinguagemFavorita l : linguagens) System.out.println(l);

        // B: Ordem natural (nome)
        System.out.println("\nB) Ordem Natural (nome):");
        Set<LinguagemFavorita> porNome = new TreeSet<>(linguagens);
        for (LinguagemFavorita l : porNome) System.out.println(l);

        // C: IDE
        System.out.println("\nC) Ordem por IDE:");
        Set<LinguagemFavorita> porIDE = new TreeSet<>(new ComparatorIDE());
        porIDE.addAll(linguagens);
        for (LinguagemFavorita l : porIDE) System.out.println(l);

        // D: Ano de criação e nome
        System.out.println("\nD) Ano de criação e nome:");
        Set<LinguagemFavorita> porAnoNome = new TreeSet<>(new ComparatorAnoENome());
        porAnoNome.addAll(linguagens);
        for (LinguagemFavorita l : porAnoNome) System.out.println(l);

        // E: Nome, ano de criação e IDE
        System.out.println("\nE) Nome, ano e IDE:");
        Set<LinguagemFavorita> porNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIde());
        porNomeAnoIde.addAll(linguagens);
        for (LinguagemFavorita l : porNomeAnoIde) System.out.println(l);
    }
}

