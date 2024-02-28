/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

/**
 *
 * @author malek
 */
public enum Situacao {
     VIVO, ABATIDO, VENDIDO, MORTO;

    public static Situacao getVIVO() {
        return VIVO;
    }

    public static Situacao getABATIDO() {
        return ABATIDO;
    }

    public static Situacao getVENDIDO() {
        return VENDIDO;
    }

    public static Situacao getMORTO() {
        return MORTO;
    }
     
     
}
