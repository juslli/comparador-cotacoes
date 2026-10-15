package dev.juslli.comparador.domain;

import java.math.BigDecimal;

public record Cotacao(
        String fornecedor,
        BigDecimal precoUnitario,
        int quantidade,
        BigDecimal frete,
        int prazoEntregaDias) {

    public BigDecimal totalComFrete() {
        return precoUnitario.multiply(BigDecimal.valueOf(quantidade)).add(frete);
    }
}
