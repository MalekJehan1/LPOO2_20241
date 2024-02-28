/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;
import java.util.Date;
/**
 *
 * @author malek
 */
public class Pesagem {
    private Date data;
    private Float peso;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Pesagem() {
    }

    public Pesagem(Date data, Float peso) {
        this.data = data;
        this.peso = peso;
    }
    
    
}
