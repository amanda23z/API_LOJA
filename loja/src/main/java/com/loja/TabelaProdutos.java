package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos() {
        Produto caneta = new Produto(1,"Caneta bic","caneta bic na cor azul", 1.99);
        Produto borracha = new Produto(2,"borracha branca", "borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "lápis faber catell", "lápis faber castell comum", 2.99);
        Produto apontador = new Produto(4, "apontador","apontador comum com repositório", 7.99);
        Produto caderno = new Produto(5, "caderno aspiral", "caderno aspiral com 96 folhas", 15.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public List<Produto> buscarTodosOsProdutos() {
        return this.getProdutos();

    }
    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

}
