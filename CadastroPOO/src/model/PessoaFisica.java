package model;

import java.io.Serializable;

// Classe que representa uma Pessoa Física, estendendo a classe Pessoa e implementando Serializable para suportar serialização.
public class PessoaFisica extends Pessoa implements Serializable {
    private String cpf;      // Número do CPF da Pessoa Física.
    private int idade;       // Idade da Pessoa Física.

    // Construtor que inicializa os atributos id, nome, cpf e idade da Pessoa Física.
    public PessoaFisica(int id, String nome, String cpf, int idade) {
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
    }    
    
    // Construtor padrão vazio necessário para serialização.
    public PessoaFisica() {
    }

    // Método getter para obter o CPF da Pessoa Física.
    public String getCPF() {
        return cpf;
    }

    // Método getter para obter a idade da Pessoa Física.
    public int getIdade() {
        return idade;
    }

    // Método setter para definir o CPF da Pessoa Física.
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    // Método setter para definir a idade da Pessoa Física.
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método override para exibir as informações da Pessoa Física no console, chamando o método exibir da classe Pessoa.
    @Override
    public void exibir() {
        super.exibir();  // Chama o método exibir da classe Pessoa
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }    
}
