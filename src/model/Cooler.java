/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Math
 */
public class Cooler extends PecasPrototype {
    
    public Cooler(Cooler novo) {
        this.nome = novo.getNome();
        this.descricao = novo.getDescricao();
        this.marca = novo.getMarca();
        this.modelo = novo.getModelo();
        this.peso = novo.getPeso();
        this.preco = novo.getPreco();
        this.numeroSerie = novo.getNumeroSerie();
        this.garantia = novo.getGarantia();
        this.recurso = novo.getRecurso();
    }
    
    @Override
    public Cooler clone() {
        return new Cooler(this);
    }
}
