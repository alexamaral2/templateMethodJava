package templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RelatorioVendaTest {

    @Test
    public void testRelatorioVendas() {
        Relatorio relatorioVendas = new RelatorioVendas("Relatório de Vendas");
        assertEquals("Relatório de Vendas", relatorioVendas.getTitulo());

        // Teste para o método montarCabecalho()
        String cabecalhoEsperado = "Cabeçalho do Relatório de Vendas";
        assertEquals(cabecalhoEsperado, relatorioVendas.montarCabecalho());

        // Teste para o método montarCorpo()
        String corpoEsperado = "Corpo do Relatório de Vendas";
        assertEquals(corpoEsperado, relatorioVendas.montarCorpo());

        // Teste para o método montarRodape()
        String rodapeEsperado = "Rodapé do Relatório de Vendas";
        assertEquals(rodapeEsperado, relatorioVendas.montarRodape());
    }
}

