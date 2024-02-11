
# Robô Articulado e Animado (Frank 🤖)

##  Tecnologias utilizadas para a construção 🔨
- IDE CodeBlocks (versão 20.3)
- Linguagem C 
- Biblioteca de OpenGL (versão 3.0)

-------------------//----------------//----------------

## Objetivo do Código 🎓
- Foi construído como um trabalho-prova para disciplina de Computação Gráfica dentro do curso de Bacharelado de Sistemas de Informação da Universidade Federal da Grande Dourados - MS.
- Aprender a utilizar a biblioteca OpenGL como ferramenta de manipulação Gráfica.
- Aplicar os conhecimentos de programação em linguagem C e princípios matemáticos envolvidos em computação gráfica.

-------------------//----------------//----------------

## Como foi construído o robô "Frank"? 🤓
A construção do código do robô frank foi bem atribulada para assim se dizer kkkk pois tem alguns conceitos matemáticos envolvidos que são um tanto "complicadinhos" para se entender rapidamente, dito isso, o professor da disciplina requisitou a construção de um robô articulado em 9 pontos e com algumas pequenas animações tais como movimentar ao menos um braço e andar para a frente e para trás utilizando se da biblioteca de OpenGL glut ou a freeglut.
O código foi construído conforme a disciplina avançava nos tópicos de computação gráfica, tais como vetores em cg, rotações, matrizes, hierarquia de código, computação graf em 2d, computação graf em 3d, perspectivas, processo de animação, mapeamento de tela - viewport entre outros tópicos abordados e que não foram exigidos na construção do robô.
- Para a construção do robô foi utilizado blocos simples quadrados por inspiração do Jogo Minecraft e as juntas/articulações são representadas por esferas, já que para realizar os movimentos não ficaria estranho esses movimentos e para uma melhor visualização.
- Foi utilizado uma matriz de projeção utilizando um angulo de 60 graus com ponto próximo de 1.0 e ponto distante de 100.0 e o eixo de visão da câmera para esses seguintes valores da função gluLookAt (0.0, 2.0, 5.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.0).
- Para uma melhor interação do usuário com o robô humanóide foi feito um menu de interação, ao ser clicado com o botão direito do mouse, com os seguintes comandos:
    * Ao apertar "F" o robô se movimentaria para frente
    * Ao apertar "T" o robô se movimentaria para trás
    * Para acenar teria de utilizar as teclas "W", "S", "A" ... assim rotacionando o ombro do robo, antebraço e mão para realizar a animação
    * Ao apertar "Y" o robô Giraria no próprio eixo para melhor visualização dos comandos e das animações
    * Ao apertar "R" o robô resetaria todos os movimentos realizados
    * Ao apertar "0" o usuário sairia do menu de comandos

- Para testar o frank basta estar com a biblioteca glut/freeglut instalado na sua IDE de escolha e que eu me lembre na pasta em que seus projetos de computação gráfica estarão.

-------------------//----------------//----------------

## Observações sobre o código e sobre a experiência 🎯
- O código não está terminado e nem perfeito mas muito me agrada ter compreendido o processo de construção gráfica e os conceitos de rotação e hierarquia de código
- As animações foram simples de se compreender porém são complexas de se aplicar
- Entendo hoje o porquê de existir bibliotecas gráficas mais completas já que a Glut/Freeglut tem lá suas limitações e exige um certo domínio de matemática... mais especificamente de geometria analítica
- A construção do "Frank" foi bem interessante no geral porquê foi util para melhorar a visão matemática da computação, de conceitos importantes na computação gráfica como rotação, translação, escala e hierarquia de códigos e suas aplicações fora do âmbito do mundo dos jogos.

## Qualquer indicação de soluções e melhorias...irei olhar com muita atenção e ficaria lisonjeado com isso. 🤙
