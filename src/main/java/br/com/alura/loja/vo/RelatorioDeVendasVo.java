package br.com.alura.loja.vo;

import java.time.LocalDate;

public class RelatorioDeVendasVo {
    private String nomeProduto;
    private Integer quantidadeVendida;
    private LocalDate dataUltimaVenda;

    public RelatorioDeVendasVo(String nomeProduto, Integer quantidadeVendida, LocalDate dataUltimaVenda) {
        this.nomeProduto = nomeProduto;
        this.quantidadeVendida = quantidadeVendida;
        this.dataUltimaVenda = dataUltimaVenda;
    }

    public RelatorioDeVendasVo() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public LocalDate getDataUltimaVenda() {
        return dataUltimaVenda;
    }

    @Override
    public String toString() {
        return "\nRelatorio de vendas:\n"
                + "Produto: " + nomeProduto + "\n"
                + "Quantidade vendida: " + quantidadeVendida + "\n"
                + "Ultima venda: " + dataUltimaVenda;
    }
}
