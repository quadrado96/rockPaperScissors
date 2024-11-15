# Pedra, Papel e Tesoura - Meu primeiro aplicativo Android! 

Este repositório contém o código-fonte de um aplicativo Android que simula o clássico jogo de "Pedra, Papel e Tesoura". O aplicativo permite que o usuário escolha entre as opções disponíveis e joga contra o computador (escolha gerada aleatoriamente). O resultado é exibido na tela após cada rodada.

---

## 🚀 Funcionalidades

1. **Seleção de Jogada pelo Usuário**:
   - O usuário pode escolher entre "Pedra", "Papel" e "Tesoura" clicando nos ícones correspondentes.

2. **Escolha do Computador**:
   - O aplicativo gera aleatoriamente a jogada do computador entre as três opções.

3. **Exibição do Resultado**:
   - Informa se o usuário venceu, perdeu ou empatou com o computador.

4. **Interface Intuitiva**:
   - Elementos visuais para facilitar a interação do usuário.

---

## 🖥️ Estrutura do Projeto

### **Java (Lógica Principal)**

#### `MainActivity.java`
- Gerencia a lógica do jogo e a interação do usuário com a interface gráfica.

**Principais métodos:**
1. **`onCreate(Bundle savedInstanceState)`**:
   - Configura a interface inicial e ajusta os paddings para acomodar as barras do sistema.

2. **`selecionarPedra(View view)`**:
   - Define "Pedra" como escolha do usuário e chama o método para verificar o vencedor.

3. **`selecionarPapel(View view)`**:
   - Define "Papel" como escolha do usuário e chama o método para verificar o vencedor.

4. **`selecionarTesoura(View view)`**:
   - Define "Tesoura" como escolha do usuário e chama o método para verificar o vencedor.

5. **`gerarEscolhaDoApp()`**:
   - Gera a escolha do computador aleatoriamente e atualiza a imagem correspondente.

6. **`verificarGanhador(String escolhaDoUsuario)`**:
   - Avalia o resultado do jogo (vitória, derrota ou empate) com base nas escolhas do usuário e do computador.

---

### **Layout (Interface Gráfica)**

#### `activity_main.xml`
- Define a estrutura visual do aplicativo utilizando o `ConstraintLayout`.

**Elementos principais:**
1. **TextViews**:
   - Exibe textos estáticos como "Escolha do app", "Escolha uma opção abaixo" e o resultado do jogo.

2. **ImageViews**:
   - Representa as opções de jogo ("Pedra", "Papel" e "Tesoura").
   - Atualiza dinamicamente a escolha do computador.

3. **Botões Invisíveis (onClick)**:
   - As imagens de "Pedra", "Papel" e "Tesoura" possuem o atributo `onClick` para capturar os eventos de clique. Os botões foram configurados através da tela da Activity.
---

## ⚙️ Como Funciona?

1. O usuário clica em um dos ícones correspondentes à sua escolha.
2. A escolha do computador é gerada aleatoriamente pelo método `gerarEscolhaDoApp()`.
3. O método `verificarGanhador(String escolhaDoUsuario)` compara as escolhas e determina o resultado:
   - Pedra vence Tesoura.
   - Papel vence Pedra.
   - Tesoura vence Papel.
   - Mesmas escolhas resultam em empate.
4. O resultado é exibido no campo designado da tela.
