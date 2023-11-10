<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Relatório - Missão Prática Mundo 3 Nível 1</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }
        h1 {
            color: #333;
        }
        h2 {
            color: #555;
        }
        h3 {
            color: #777;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 5px;
            color: #333;
            border-radius: 4px;
        }
    </style>
</head>
<body>

    <h1>Missão Prática Mundo 3 - Nível 1</h1>
    <h2>Polo Centro - Palhoça – SC</h2>

    <h3>Curso:</h3>
    <p>Desenvolvimento Full Stack</p>

    <h3>Disciplina:</h3>
    <p>RPG0014 - Iniciando o caminho pelo Java</p>

    <h3>Turma:</h3>
    <p>9001</p>

    <h3>Semestre Letivo:</h3>
    <p>3</p>

    <h3>Integrantes da Prática:</h3>
    <p>Andrey Haertel Aires</p>

    <h3>Repositório GIT:</h3>
    <p><a href="https://github.com/AndreyHaires/MissaoPraticaMundo3_N1" target="_blank">https://github.com/AndreyHaires/MissaoPraticaMundo3_N1</a></p>

    <h2>1 - 1º Procedimento | Criação das Entidades e Sistema de Persistência</h2>

    <h3>PASTAS CRIADAS:</h3>

    <h3>Objetivos da prática:</h3>
    <ol>
        <li>Utilizar herança e polimorfismo na definição de entidades.</li>
        <li>Utilizar persistência de objetos em arquivos binários.</li>
        <li>Implementar uma interface cadastral em modo texto.</li>
        <li>Utilizar o controle de exceções da plataforma Java.</li>
        <li>No final do projeto, o aluno terá implementado um sistema cadastral em Java, utilizando os recursos da programação orientada a objetos e a persistência em arquivos binários.</li>
    </ol>

    <h3>Criando Classes:</h3>

    <h4>Criando a classe Pessoa.java</h4>
    <p>A classe Pessoa é uma representação básica de uma pessoa com atributos como id e nome...</p>
    <code>package model; ...</code>

    <!-- Outras classes e trechos de código podem ser adicionados aqui -->

    <h3>Importância:</h3>
    <ol>
        <li>Abstração e Reutilização de Código: O uso de classes abstratas (como Pessoa) permite a modelagem de entidades comuns e a reutilização de código para entidades específicas (como PessoaFisica e PessoaJuridica).</li>
        <li>Polimorfismo: O polimorfismo é aplicado ao sobrescrever o método exibir() nas subclasses, permitindo chamar o mesmo método em objetos de tipos diferentes com comportamentos específicos.</li>
        <li>Persistência de Dados: As classes de repositório (PessoaFisicaRepo e PessoaJuridicaRepo) facilitam a persistência de objetos em arquivos, permitindo que os dados sejam armazenados e recuperados.</li>
        <li>Organização e Manutenção: O código está organizado de forma modular, facilitando a manutenção e expansão do sistema ao separar responsabilidades específicas em diferentes classes.</li>
    </ol>

    <h2>A Classe principal :</h2>

    <h3>Comentários sobre o Código Main - CadastroPOO.java:</h3>
    <p>Este código Java implementa um sistema de cadastro utilizando programação orientada a objetos (POO). Abaixo estão alguns pontos importantes...</p>
    <code>package cadastropoo; ...</code>

    <h2>RESULTADOS:</h2>

    <!-- Adicionar imagens ou resultados específicos aqui -->

    <h2>1º PROCEDIMENTO - Análise e Conclusão</h2>

    <h3>a) Quais as vantagens e desvantagens do uso de herança?</h3>
    <p><strong>Vantagens:</strong> Reutilização de código, polimorfismo, estrutura hierárquica, manutenção simplificada.</p>
    <p><strong>Desvantagens:</strong> Acoplamento forte, herança múltipla complexa, hierarquia profunda, violação do princípio de substituição de Liskov.</p>

    <!-- Mais perguntas e respostas podem ser adicionadas aqui -->

    <h2>REFERÊNCIAS:</h2>
    <ol>
        <li>Deitel, P. J., & Deitel, H. M. (2016). Java: como programar.</li>
        <li>Oracle. (2021). The Java™ Tutorials.</li>
        <li>Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). Design Patterns: Elements of Reusable Object-Oriented Software.</li>
    </ol>

</body>
</html>
