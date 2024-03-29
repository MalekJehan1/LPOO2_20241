/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

 import  java.util.Calendar;

/**
 *
 * @author malek
 */
public class Pessoa {
   
    private String cpf;
    private String rg;
    private String senha;
    private String nome;
    private Calendar data_nascimento;
    private String cep;
    private String numero;
    private String complemento;
    private boolean status;

    public Pessoa(String cpf, String rg, String senha, String nome, Calendar data_nascimento, String cep, String numero, String complemento, boolean status) {
        this.cpf = cpf;
        this.rg = rg;
        this.senha = senha;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.status = status;
    }

    public Pessoa() {
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
