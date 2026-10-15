package dev.juslli.comparador.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class CotacaoTest {

    @Test
    void totalComFreteSomaPrecoVezesQuantidadeMaisFrete() {
        var cotacao = new Cotacao("Deposito Alfa", new BigDecimal("32.50"), 10, new BigDecimal("80.00"), 5);

        assertThat(cotacao.totalComFrete()).isEqualByComparingTo("405.00");
    }

    @Test
    void totalComFreteAceitaPrecoComFracaoDeCentavo() {
        var cotacao = new Cotacao("Deposito Beta", new BigDecimal("32.495"), 4, BigDecimal.ZERO, 3);

        assertThat(cotacao.totalComFrete()).isEqualByComparingTo("129.98");
    }
}
