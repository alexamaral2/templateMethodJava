package templatemethod;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(String titulo) {
        super(titulo);
    }

    @Override
    public String montarCabecalho() {
        return "Cabeçalho do Relatório de Vendas";
    }

    @Override
    public String montarCorpo() {
        return "Corpo do Relatório de Vendas";
    }

    @Override
    public String montarRodape() {
        return "Rodapé do Relatório de Vendas";
    }
}
