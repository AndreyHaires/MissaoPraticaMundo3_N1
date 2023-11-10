package model;

import java.io.Serializable;

// Classe que representa uma Pessoa Jurídica, estendendo a classe Pessoa e implementando Serializable para suportar serialização.
public class PessoaJuridica extends Pessoa implements Serializable {
    private String cnpj;  // Número do CNPJ da Pessoa Jurídica.

    // Construtor que inicializa os atributos id, nome e cnpj da Pessoa Jurídica.
    public PessoaJuridica(int id, String cnpj, String nome) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    // Construtor padrão vazio necessário para serialização.
    public PessoaJuridica() {
    }

    // Método getter para obter o CNPJ da Pessoa Jurídica.
    public String getCNPJ() {
        return cnpj;
    }

    // Método setter para definir o CNPJ da Pessoa Jurídica.
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método override para exibir as informações da Pessoa Jurídica no console, chamando o método exibir da classe Pessoa.
    @Override
    public void exibir() {
        super.exibir();  // Chama o método exibir da classe Pessoa
        System.out.println("CNPJ: " + cnpj);
    }
}
