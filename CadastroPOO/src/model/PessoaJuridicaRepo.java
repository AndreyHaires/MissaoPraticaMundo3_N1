package model;

import java.io.*;
import java.util.ArrayList;

public class PessoaJuridicaRepo {
    private ArrayList<PessoaJuridica> listPessoasJuridicas = new ArrayList<>();

    
    public boolean pessoaExiste(int id) {
    for (PessoaJuridica pessoa : listPessoasJuridicas) {
        if (pessoa.getId() == id) {
            return true;
        }
    }
    return false;
}
    public void inserir(PessoaJuridica pessoaJuridica) {
        listPessoasJuridicas.add(pessoaJuridica);
    }

    public void alterar(int id, String novoCNPJ, String novoNome) {
    for (PessoaJuridica pessoaJuridica : listPessoasJuridicas) {
        if (pessoaJuridica.getId() == id) {
            // Pessoa encontrada, faça a alteração  
            pessoaJuridica.setNome(novoNome);
            pessoaJuridica.setCNPJ(novoCNPJ);            
            return; // Encerre a busca após encontrar a pessoa e realizar a alteração
        }
    }
}
    public void excluir(int id) {
        // Implemente a lógica para excluir uma pessoa jurídica
    for (PessoaJuridica pessoaJuridica : listPessoasJuridicas) {
        if (pessoaJuridica.getId() == id) {
            listPessoasJuridicas.remove(pessoaJuridica);
            return; // Encerre a busca após remover a pessoa
        }
    }
    }
    public PessoaJuridica obter(int id) {
    for (PessoaJuridica pessoa : listPessoasJuridicas) {
        if (pessoa.getId() == id) {
        return pessoa;
    }
    }
    return null; // Retorna null se a pessoa não for encontrada
    }    
    
    public ArrayList<PessoaJuridica> obterTodos() {
        return listPessoasJuridicas;
    }

    public void persistir(String nomeArquivoJ) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivoJ))) {
            out.writeObject(listPessoasJuridicas);
        }
    }

    public void recuperar(String nomeArquivoJ) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivoJ))) {
            listPessoasJuridicas = (ArrayList<PessoaJuridica>) in.readObject();
        }
    }
}
