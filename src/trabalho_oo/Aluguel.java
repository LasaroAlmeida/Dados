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
public class Aluguel {
    private Cliente client;
    private Filme film;
    private String data;
    private String data_devolucao;
    private float multa;

    
    public Aluguel(Cliente client, Filme film, String data, String data_devolucao, float multa) {
        this.client = client;
        this.film = film;
        this.data = data;
        this.data_devolucao = data_devolucao;
        this.multa = multa;
    }
    
    public void Atualiza_multa(){
        
    }
    
    public Cliente getClient() {
        return client;
    }

    public Filme getFilm() {
        return film;
    }

    public String getData() {
        return data;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public float getMulta() {
        return multa;
    }   
    
}
