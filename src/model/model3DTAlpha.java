/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author csqueiroz
 */
public class model3DTAlpha {
    private String nome;
    private int forca;
    private int habilidade;
    private int resistencia;
    private int armadura;
    private int pdf;
    private int pontos;

    public model3DTAlpha(String nome, int forca, int habilidade, int resistencia, int armadura, int pdf, int pontos) {
        this.nome = nome;
        this.forca = forca;
        this.habilidade = habilidade;
        this.resistencia = resistencia;
        this.armadura = armadura;
        this.pdf = pdf;
        this.pontos = pontos;
    }
    
    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getArmadura() {
        return armadura;
    }

    public int getPdf() {
        return pdf;
    }

    public int getPontos() {
        return pontos;
    }
    
    
    
}
