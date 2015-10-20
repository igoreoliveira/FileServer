/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufabc.sd.arquivos;

/**
 *
 * @author igor.esteves
 */
public class Arquivo implements java.io.Serializable{
    private String nome;
    private String path;
    private String dataCriacao;
    private String dataAtualizacao;
    private double tamanho;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public String getPath() {
        return path;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String getConteudo() {
        return conteudo;
    }
    private String conteudo; //depois mudar para Buffer
}
