package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    @EmbeddedId
    private CategoriaId id;

    public Categoria(String nome) {
        this.id = new CategoriaId(nome,"Xpto");
    }

    public Categoria(){

    }

    public String getNome() {
        return this.id.getNome();
    }
}
