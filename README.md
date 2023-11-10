# CadastroPOO - Sistema de Cadastro em Java

## Descrição:

O CadastroPOO é um sistema de cadastro implementado em Java, utilizando Programação Orientada a Objetos (POO). Ele fornece uma solução eficiente para gerenciar informações de entidades, como pessoas físicas e jurídicas.

## Funcionalidades Principais:

- **Criação de Entidades:** O sistema implementa classes como Pessoa, PessoaFisica e PessoaJuridica, fazendo uso de herança e polimorfismo para modelar diferentes tipos de entidades.

- **Persistência de Dados:** Utiliza persistência de objetos em arquivos binários para armazenar e recuperar dados, garantindo que as informações sejam preservadas entre diferentes execuções do programa.

- **Interface Cadastral:** Oferece uma interface cadastral em modo texto para interação simples e intuitiva com o usuário.

- **Controle de Exceções:** Implementa o controle de exceções da plataforma Java para lidar com erros de forma eficiente, melhorando a robustez do sistema.

## Organização do Código:

- **Abstração e Reutilização de Código:** Utiliza classes abstratas como Pessoa para fornecer uma base comum, permitindo a criação de subclasses específicas como PessoaFisica e PessoaJuridica.

- **Polimorfismo:** A sobrescrita de métodos, como o método `exibir()`, possibilita chamar o mesmo método em objetos de tipos diferentes com comportamentos específicos.

- **Persistência de Dados:** Usa classes de repositório para facilitar a persistência de objetos em arquivos binários, simplificando a manipulação de dados.

- **Organização e Manutenção:** O código é modular, facilitando a manutenção e expansão do sistema ao seguir boas práticas de programação.

## Resultado:

O CadastroPOO proporciona uma implementação robusta e eficiente de um sistema cadastral em Java. Ao integrar os princípios da POO e boas práticas de programação, o programa se destaca pela sua simplicidade e flexibilidade.

## Referências:

- Deitel, P. J., & Deitel, H. M. (2016). Java: como programar.
- Oracle. (2021). The Java™ Tutorials.
- Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). Design Patterns: Elements of Reusable Object-Oriented Software.
