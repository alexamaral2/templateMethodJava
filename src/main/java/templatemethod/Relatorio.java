package templatemethod;

public abstract class Relatorio {

    protected String titulo;

    public Relatorio(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório: " + titulo + " ===");
        System.out.println(montarCabecalho());
        System.out.println(montarCorpo());
        System.out.println(montarRodape());
        System.out.println("=== Fim do Relatório ===");
    }

    public abstract String montarCabecalho();

    public abstract String montarCorpo();

    public abstract String montarRodape();
}