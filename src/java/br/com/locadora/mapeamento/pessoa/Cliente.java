/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.mapeamento.pessoa;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Laboratoriodm
 */
@Entity
public class Cliente extends Pessoa implements Serializable{
    private boolean pessoaFisica;
    private boolean bomPagador;
    
    public Cliente(){
        this.pessoaFisica = true;
        this.bomPagador = true;
    }

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(boolean PessoaFisica) {
        this.pessoaFisica = PessoaFisica;
    }

    public boolean isBomPagador() {
        return bomPagador;
    }

    public void setBomPagador(boolean BomPagador) {
        this.bomPagador = BomPagador;
    }
    
    
}
