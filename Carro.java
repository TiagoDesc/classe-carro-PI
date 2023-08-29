/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {

    //Adicionando as propriedades.
    private String fabricante;
    private String [] rodas;
    private String cor;
    private String modelo;
    private int velocidadeAtual;

    //Criando o construtor vazio.
     public Carro (){

    }

    //Criando os métodos acessores.
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    //Finalizando os métodos acessores na linha 65.

    //Definindo os comportamentos da Classe Carro. 
    public void acelerar (){
        this.velocidadeAtual += 235;
    }

    public void velocidadeAtual(int numVelocidade){
        this.velocidadeAtual += numVelocidade;
    }

    public void frear(){
        this.velocidadeAtual -= 10; 
    }

}

   


