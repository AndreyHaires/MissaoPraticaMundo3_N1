package model;

import java.io.Serializable;

// Classe que representa uma Pessoa e implementa a interface Serializable para suportar serialização.
public class Pessoa implements Serializable {
    private int id;       // Identificador único da Pessoa.
    private String nome;  // Nome da Pessoa.

    // Construtor que inicializa os atributos id e nome da Pessoa.
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    // Construtor padrão vazio necessário para serialização.
    public Pessoa() {
    }
    
    // Método getter para obter o ID da Pessoa.
    public int getId() {
        return id;
    }

    // Método getter para obter o nome da Pessoa.
    public String getNome() {
        return nome;
    }

    // Método setter para definir o ID da Pessoa.
    public void setId(int id) {
        this.id = id;
    }

    // Método setter para definir o nome da Pessoa.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para exibir as informações da Pessoa no console.
    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome); 
    }
}
