package templatemethod;

public class RelatorioDespesas extends Relatorio {

    public RelatorioDespesas(String titulo) {
        super(titulo);
    }

    @Override
    public String montarCabecalho() {
        return "Cabeçalho do Relatório de Despesas";
    }

    @Override
    public String montarCorpo() {
        return "Corpo do Relatório de Despesas";
    }

    @Override
    public String montarRodape() {
        return "Rodapé do Relatório de Despesas";
    }
}
