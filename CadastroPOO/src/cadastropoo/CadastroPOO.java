package cadastropoo;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.PessoaFisicaRepo;
import model.PessoaJuridicaRepo;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CadastroPOO {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        PessoaFisicaRepo repoPessoaFisica = new PessoaFisicaRepo();
        PessoaJuridicaRepo repoPessoaJuridica = new PessoaJuridicaRepo();
        int opcao;

        while (true) { //Esse While foi criado para garantir que o programa continue rodando até o usuario acertar a opção
            try {
                System.out.println("=====================================");
                System.out.println("1 - Incluir Pessoa");
                System.out.println("2 - Alterar Pessoa");
                System.out.println("3 - Excluir Pessoa");
                System.out.println("4 - Procurar pelo ID");
                System.out.println("5 - Exibir Todos");
                System.out.println("6 - Persistir Dados");
                System.out.println("7 - Recuperar Dados");
                System.out.println("0 - Finalizar Programa");
                System.out.println("=====================================");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine(); //Consome a linha pendente no buffer 

                switch (opcao) {
                    case 1: 
                    String tipo = "";  // Inicializa 'tipo' com um valor padrão vazio
                    while (!tipo.equals("F") && !tipo.equals("J")) {
                        System.out.println("Escolha o tipo de pessoa:");
                        System.out.printf("F - Pessoa Física | J - Pessoa Jurídica: ");
                        tipo = scanner.nextLine().toUpperCase();
                        if (!tipo.equals("F") && !tipo.equals("J")) {
                            System.out.println("Opção inválida. Por favor, escolha F ou J.");
                            }
                        }                 
                            // Esse if/Else define qual tipo de pessoa o usuario quer manipular.
                            if (tipo.equals("F")) {
                            System.out.print("ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();

                            // Verifica se a pessoa com o mesmo ID já existe
                                    if (repoPessoaFisica.pessoaExiste(id)) {
                                        System.out.println("Já existe um registro com esse ID. Cadastro não adicionado.");
                                    } else {
                                        System.out.print("Nome: ");
                                        String nome = scanner.nextLine();
                                        System.out.print("CPF: ");
                                        String cpf = scanner.nextLine();
                                        System.out.print("Idade: ");
                                        int idade = scanner.nextInt();
                                        scanner.nextLine(); // Consume a nova linha

                                        PessoaFisica pf = new PessoaFisica(id, nome, cpf, idade);
                                        repoPessoaFisica.inserir(pf);
                                        System.out.println("Cadastro adicionado com sucesso.");
                                    }
                                }                           

                            else if (tipo.equals("J")) {
                            System.out.print("ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            
                                     // Verifica se a pessoa com o mesmo ID já existe
                                    if (repoPessoaJuridica.pessoaExiste(id)) {
                                        System.out.println("Já existe um registro com esse ID. Cadastro não adicionado.");
                                    } else {
                                        System.out.print("Nome da Empresa: ");
                                        String nomeEmpresa = scanner.nextLine();
                                        System.out.print("CNPJ: ");
                                        String cnpj = scanner.nextLine();
                                        PessoaJuridica pj = new PessoaJuridica(id, nomeEmpresa, cnpj);
                                        repoPessoaJuridica.inserir(pj);
                                    }
                                }                           

                         else { // mostra a mensagem caso o usuario não digite a informação esperada.
                            System.out.println();
                            System.out.println("************** Opção inválida. Por favor, escolha F ou J. **************");
                            System.out.println();
                        }
                        break;

                    case 2:
                        // Essa parte implementa a opção Alterar Pessoa.
                        
                        System.out.print("Digite o ID da pessoa que deseja alterar: ");
                        int idParaAlterar = scanner.nextInt();
                        scanner.nextLine(); //Consome a linha pendente no buffer                      

                        // Verifica se a pessoa com o ID especificado existe na lista
                        if (repoPessoaFisica.pessoaExiste(idParaAlterar)) {  
                            System.out.print("Digite o novo nome: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Digite o novo CPF: ");
                            String novoCPF = scanner.nextLine();
                            System.out.print("Digite a nova idade: ");  
                            int novaIdade = scanner.nextInt();
                            scanner.nextLine(); //Consome a linha pendente no buffer 

                            // Chama o método para alterar na classe PessoaFisicaRepo
                            repoPessoaFisica.alterar(idParaAlterar, novoNome, novoCPF, novaIdade);

                            System.out.println("Dados da pessoa física atualizados com sucesso.");                       
                           
                         // Verifica se a pessoa com o ID especificado existe na lista  
                        } else if (repoPessoaJuridica.pessoaExiste(idParaAlterar)) {                            
                            System.out.print("Digite o novo nome da empresa: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Digite o novo CNPJ: ");
                            String novoCNPJ = scanner.nextLine();                            
                         

                            // Chama o método para alterar na classe PessoaJuridicaRepo
                            repoPessoaJuridica.alterar(idParaAlterar, novoCNPJ, novoNome);

                            System.out.println("Dados da pessoa jurídica atualizados com sucesso.");                   
                            
                        } else {
                            System.out.println("Pessoa com o ID especificado não encontrada.");
                        }
                        break;             

                    case 3:// Essa parte implementa a opção Excluir Pessoa.
                        System.out.print("Digite o ID da pessoa que deseja excluir: ");
                        int idParaExcluir = scanner.nextInt();
                        scanner.nextLine(); //Consome a linha pendente no buffer 

                        if (repoPessoaFisica.pessoaExiste(idParaExcluir)) {
                            repoPessoaFisica.excluir(idParaExcluir);
                            System.out.println("Pessoa excluída com sucesso.");}
                        else if (repoPessoaJuridica.pessoaExiste(idParaExcluir)) {
                            repoPessoaJuridica.excluir(idParaExcluir);
                            System.out.println("Pessoa excluída com sucesso.");
                        }else {
                            System.out.println("Pessoa com o ID especificado não encontrada.");
                        }
                        break;

                    case 4:
                        // // Essa parte implementa a opção Procurar pelo ID.   
                        System.out.print("Digite o ID da pessoa que deseja procurar: ");
                        int idParaProcurar = scanner.nextInt();
                        scanner.nextLine();

                        // Verifique a existência do ID em ambas as listas
                        boolean existeEmPessoaFisica = repoPessoaFisica.pessoaExiste(idParaProcurar);
                        boolean existeEmPessoaJuridica = repoPessoaJuridica.pessoaExiste(idParaProcurar);

                        if (existeEmPessoaFisica) {
                            // A pessoa foi encontrada em Pessoa Física
                            PessoaFisica pessoaEncontradaF = repoPessoaFisica.obter(idParaProcurar);
                            System.out.println();
                            System.out.println("Cadastro encontrado em Pessoa Física:");
                            System.out.println("-------------");
                            pessoaEncontradaF.exibir();
                        } else if (existeEmPessoaJuridica) {
                            // A pessoa foi encontrada em Pessoa Jurídica
                            PessoaJuridica pessoaEncontradaJ = repoPessoaJuridica.obter(idParaProcurar);
                            System.out.println();
                            System.out.println("Cadastro encontrado em Pessoa Jurídica:");
                            System.out.println("-------------");
                            pessoaEncontradaJ.exibir();
                        } else {
                            System.out.println("Pessoa com o ID especificado não encontrada.");
                        }
                        break;
            
                    case 5: // Essa parte implementa a opção Exibir Todos.
                        System.out.println("Exibindo todos os cadastros:");
                        System.out.println();
                        System.out.println("Pessoas Físicas:");
                        System.out.println();
                        List<PessoaFisica> pessoasFisicas = repoPessoaFisica.obterTodos();
                        for (PessoaFisica pf : pessoasFisicas) {
                            pf.exibir();
                            System.out.println("-------------");
                        }

                        System.out.println();
                        System.out.println("Pessoas Jurídicas:");
                        System.out.println();
                        List<PessoaJuridica> pessoasJuridicas = repoPessoaJuridica.obterTodos();
                        for (PessoaJuridica pj : pessoasJuridicas) {
                            pj.exibir();
                            System.out.println("-------------");
                        }
                        break;

                    case 6: //// Essa parte implementa a opção Persistir Dados.
                        System.out.print("Digite o nome do arquivo: ");
                        String nomeArquivo = scanner.next();
                    String nomeArquivoF = (nomeArquivo + ".fisica.bin");
                    String nomeArquivoJ = (nomeArquivo + ".juridica.bin");// Nome do arquivo para persistência
                     
                    try {
                         repoPessoaFisica.persistir(nomeArquivoF);                        
                         System.out.println("Dados de pessoas físicas persistidos com sucesso.");
                     } catch (IOException e) {
                         System.out.println("Ocorreu um erro ao persistir os dados de pessoas físicas: " + e.getMessage());
                     }
                    try {                        
                         repoPessoaJuridica.persistir(nomeArquivoJ);
                         System.out.println("Dados de pessoas juridicas persistidos com sucesso.");
                     } catch (IOException e) {
                         System.out.println("Ocorreu um erro ao persistir os dados de pessoas jurídicas: " + e.getMessage());
                     } 
                        break;
                    case 7:
                        // // Essa parte implementa a opção Recuperar Dados.
                        tipo = "";  // Inicializa 'tipo' com um valor padrão vazio
                        while (!tipo.equals("F") && !tipo.equals("J")) {
                            System.out.println("Escolha o tipo de arquivo para recuperar:");
                            System.out.printf("F - Pessoa Física | J - Pessoa Jurídica: ");
                            tipo = scanner.nextLine().toUpperCase(); // modifica a letra digitada para maiúscula.
                            if (!tipo.equals("F") && !tipo.equals("J")) {
                                System.out.println("Opção inválida. Por favor, escolha F ou J.");
                                }
                        if (tipo.equals("F")) {
                            System.out.print("Digite o nome do arquivo: ");
                            nomeArquivoF = scanner.nextLine();
                            try {
                                repoPessoaFisica.recuperar(nomeArquivoF);
                                System.out.println("Dados de pessoas físicas recuperados com sucesso do arquivo '" + nomeArquivoF + "'.");
                            } catch (IOException e) {
                                System.out.println("Ocorreu um erro ao recuperar os dados: " + e.getMessage());
                            } catch (ClassNotFoundException e) {
                                System.out.println("Erro ao desserializar os dados: " + e.getMessage());
                            }
                          } else if (tipo.equals("J")) {
                            System.out.print("Digite o nome do arquivo: ");
                            nomeArquivoJ = scanner.nextLine();
                            try {
                                repoPessoaJuridica.recuperar(nomeArquivoJ);
                                System.out.println("Dados de pessoas Juridicas recuperados com sucesso do arquivo '" + nomeArquivoJ + "'.");
                            } catch (IOException e) {
                                System.out.println("Ocorreu um erro ao recuperar os dados: " + e.getMessage());
                            } catch (ClassNotFoundException e) {
                                System.out.println("Erro ao desserializar os dados: " + e.getMessage());
                            }  
                          }  
                        }
                        break;
                    case 0:
                        System.out.println("Programa finalizado.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("***** Opção inválida. Tente novamente. *****");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite uma das opções do menu.");
                scanner.nextLine(); // Limpe a entrada inválida
            }
        }
    }
}
