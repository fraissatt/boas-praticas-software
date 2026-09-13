## Sobre o projeto

Refatoração de um sistema Java aplicando boas práticas de nomenclatura, 
modularização e padronização, com o processo registrado através de 
commits no Git.

## Link do repositório

https://github.com/fraissatt/boas-praticas-software


### 1. Qual era o principal problema do código original?
O principal problema do código original era concentrar toda a lógica (cálculo da média, verificação da situação e exibição do resultado) em um único método, o main, além de utilizar nomes de variáveis pouco descritivos (n, a, b, c), o que dificultava a leitura e o entendimento do código.



### 2. Quais melhorias você realizou?
Realizei a renomeação das variáveis inicialmente, criei métodos específicos para cada função de forma a distribuir as responsabilidades e fiz com que a "main" apenas reunisse os métodos e apresentasse a saída.



### 3. Como a modularização facilitou a organização do código?
A modularização facilitou a organização do código porque cada método passou a ter uma única responsabilidade (calcular a média, verificar a situação do aluno), tornando o main mais simples e o código mais fácil de ler, testar e alterar futuramente, já que uma mudança em uma regra específica fica isolada em um único método.



### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git ajudou a controlar as alterações realizadas no sistema ao registrar cada mudança separadamente, permitindo rastreabilidade e manutenibilidade do histórico, além de oferecer maior clareza para outros desenvolvedores entenderem a evolução do código e possibilitar comparar, reverter ou revisar alterações específicas quando necessário.

*P.S*: Optei por fazer os commits separando cada melhoria individualmente (renomear variáveis, criar o método da média, criar o método do resultado, e por fim padronizar a saída), pois assim ficou mais fácil acompanhar cada mudança realizada durante o desenvolvimento da atividade.

Porém, tenho noção de que, em times profissionais, essa não seria necessariamente a abordagem ideal em um projeto real. Como o código é pequeno, faria mais sentido agrupar mudanças que têm relação entre si no mesmo commit - por exemplo, juntar a renomeação das variáveis com a criação dos métodos em um único commit, já que uma mudança só faz sentido completo com a outra. Nesse caso, provavelmente o ideal seria ter usado 1 ou 2 commits ao invés de 4, tornando o histórico mais objetivo e revisável.

Ainda assim, acredito que separar os commits dessa forma foi útil para fins de aprendizado, pois deixou mais claro o raciocínio por trás de cada boa prática aplicada.