package model;

import java.io.*;
import java.util.ArrayList;

// Classe que representa um repositório de PessoaFisica, gerenciando operações como inserção, alteração, exclusão e persistência em arquivo.
public class PessoaFisicaRepo {
    private ArrayList<PessoaFisica> listPessoasFisicas = new ArrayList<>();

    // Verifica se uma pessoa com o ID fornecido existe no repositório.
    public boolean pessoaExiste(int id) {
        for (PessoaFisica pessoa : listPessoasFisicas) {
            if (pessoa.getId() == id) {
                return true;
            }
        }
        return false; // Retorna falso se a pessoa não for encontrada
    }

    // Insere uma nova PessoaFisica no repositório.
    public void inserir(PessoaFisica pessoaFisica) {
        listPessoasFisicas.add(pessoaFisica);
    }

    // Altera os dados de uma PessoaFisica com base no ID fornecido.
    public void alterar(int id, String novoNome, String novoCPF, int novaIdade) {
        for (PessoaFisica pessoaFisica : listPessoasFisicas) {
            if (pessoaFisica.getId() == id) {
                // Pessoa encontrada, faça a alteração
                pessoaFisica.setNome(novoNome);
                pessoaFisica.setCPF(novoCPF);
                pessoaFisica.setIdade(novaIdade);
                return; // Encerra a busca após encontrar a pessoa e realizar a alteração
            }
        }
    }

    // Exclui uma PessoaFisica com base no ID fornecido.
    public void excluir(int id) {
        for (PessoaFisica pessoaFisica : listPessoasFisicas) {
            if (pessoaFisica.getId() == id) {
                listPessoasFisicas.remove(pessoaFisica);
                return; // Encerra a busca após remover a pessoa
            }
        }
    }

    // Obtém uma PessoaFisica com base no ID fornecido.
    public PessoaFisica obter(int id) {
        for (PessoaFisica pessoa : listPessoasFisicas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null; // Retorna null se a pessoa não for encontrada
    }

    // Obtém todas as PessoaFisica armazenadas no repositório.
    public ArrayList<PessoaFisica> obterTodos() {
        return listPessoasFisicas;
    }

    // Persiste as informações do repositório em um arquivo.
    public void persistir(String nomeArquivoF) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivoF))) {
            out.writeObject(listPessoasFisicas);
        }
    }

    // Recupera as informações do repositório a partir de um arquivo.
    public void recuperar(String nomeArquivoF) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivoF))) {
            listPessoasFisicas = (ArrayList<PessoaFisica>) in.readObject();
        }
    }
}
