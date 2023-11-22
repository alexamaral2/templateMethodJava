package templatemethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioDespesaTest {

    @Test
    public void testRelatorioDespesa() {
        Relatorio relatorioDespesas = new RelatorioDespesas("Relatório de Despesas");
        assertEquals("Relatório de Despesas", relatorioDespesas.getTitulo());

        // Teste para o método montarCabecalho()
        String cabecalhoEsperado = "Cabeçalho do Relatório de Despesas";
        assertEquals(cabecalhoEsperado, relatorioDespesas.montarCabecalho());

        // Teste para o método montarCorpo()
        String corpoEsperado = "Corpo do Relatório de Despesas";
        assertEquals(corpoEsperado, relatorioDespesas.montarCorpo());

        // Teste para o método montarRodape()
        String rodapeEsperado = "Rodapé do Relatório de Despesas";
        assertEquals(rodapeEsperado, relatorioDespesas.montarRodape());
    }
}