/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_oo;

/**
 *
 * @author Lasaro Almeida
 */
public class Filme {
    private String genero,nome;
    private int fx_etaria;
    private boolean alugado;
    private float preco;
    private int copias_filme;

    public Filme(String genero, String nome, int fx_etaria, boolean alugado, float preco, int copias_filme) {
        this.genero = genero;
        this.nome = nome;
        this.fx_etaria = fx_etaria;
        this.alugado = alugado;
        this.preco = preco;
        this.copias_filme = copias_filme;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFx_etaria() {
        return fx_etaria;
    }

    public void setFx_etaria(int fx_etaria) {
        this.fx_etaria = fx_etaria;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
