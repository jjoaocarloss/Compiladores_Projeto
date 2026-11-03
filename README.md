<div align="center">

# 📐 Compilador da Linguagem Quinas

**Analisador Léxico, Sintático, Semântico e Gerador de Código para a Linguagem Quinas.**<br/>
Projeto desenvolvido para a disciplina de Compiladores (UFS).

[![SableCC](https://img.shields.io/badge/SableCC-3.7-blue?style=for-the-badge&logo=java)](https://sablecc.org/)
[![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-green?style=for-the-badge)]()

[Sobre](#-sobre-o-projeto) · [Linguagem Quinas](#-a-linguagem-quinas) · [Etapas](#-etapas-do-projeto) · [Estrutura](#-estrutura-do-repositorio) · [Como Executar](#-como-executar) · [Equipe](#-equipe)

</div>

---

## 📌 Sobre o Projeto

Este repositório contém a implementação completa do compilador da linguagem **Quinas**, uma linguagem funcional experimental projetada em português. O projeto abrange desde a especificação gramatical até a geração de código alvo.

- **Instituição:** Universidade Federal de Sergipe (UFS)
- **Disciplina:** Compiladores
- **Docente:** Profa. Beatriz Trinchão Andrade
- **Semestre:** {SEU-SEMESTRE, ex: 2026.2}

---

## 📐 A Linguagem Quinas

Quinas é uma linguagem funcional experimental baseada em conceitos de linguagens como ML, Scheme, LISP e Haskell, com características marcantes:

- **Sintaxe em Português:** Palavras reservadas e estruturas em língua portuguesa.
- **Estruturas Condicionais:** Utilização de **Guardas** (`||`).
- **Funções de Alta Ordem:** Suporte a funções como parâmetros e assinaturas aninhadas.
- **Tipos Primitivos:** `numero` (inteiros decimais/binários e reais) e `booleano` (`V` ou `F`).

---

## 🚀 Etapas do Projeto

| Etapa | Descrição | Status | Entrega |
| :---: | :--- | :---: | :---: |
| **01** | **Códigos em Quinas:** Elaboração dos códigos de teste (`.qui`) abrangendo toda a gramática. | 🟢 Concluído | `{DATA_OU_STATUS}` |
| **02** | **Análise Léxica:** Reconhecimento e tokenização da linguagem via SableCC. | 🟢 Concluído | `{DATA_OU_STATUS}` |
| **03** | **Análise Sintática:** Construção e validação da árvore sintática concreta (CST). | 🟢 Concluído | `{DATA_OU_STATUS}` |
| **04** | **Árvore Sintática Abstrata (AST):** Simplificação da árvore sintática. | 🟡 Em Andamento | `{DATA_OU_STATUS}` |
| **05** | **Análise Semântica:** Tabela de símbolos, checagem de escopo e tipos. | 🔴 Pendente | `{DATA_OU_STATUS}` |
| **06** | **Geração de Código:** Tradução do código Quinas para a linguagem alvo (C ou Haskell). | 🔴 Pendente | `{DATA_OU_STATUS}` |

---

## 📂 Estrutura do Repositório

```text
quinas-compiler/
├── src/                  # Código-fonte gerado pelo SableCC e classes Java customizadas
├── gramatica/            # Especificação da gramática SableCC
│   └── grupo_14.sable    # Arquivo principal de definição sintática/léxica
├── exemplos/             # Programas de teste escritos em Quinas
│   ├── codigo1.qui       # Testes de expressões, precedência e tipos
│   ├── codigo2.qui       # Testes de recursão, guardas e operadores lógicos
│   └── codigo3.qui       # Testes de funções de alta ordem e funções matemáticas
├── ETAPAS/               # Arquivos e Diretorio com historico de progressão do projeto Etapa por Etapa 
      ├── etapa1_codigos/ # códigos de teste (`.qui`)
      │   ├── codigo1.qui 
      │   ├── codigo2.qui
      │   └── codigo3.qui
      ├── etapa2_lexico/  # Analisador lexico da linguagem via SableCC
      │   └── grupo_14.sable
      ├── etapa3_sintatico/  # Analisador sintatico da linguagem via SableCC
      │   └── grupo_14.sable
      ├── etapa4_ast/  # Analisador lexico abstrato da linguagem via SableCC
      ├── etapa5_semantico/  # Analisador semantico da linguagem via SableCC
      └── etapa6_codegens/  # extra
├── docs/                 # Documentação oficial e especificações do projeto
└── README.md             # Documentação principal do repositório
obs:. NO incio os arquivos são criados e contidos na pasta ETAPAS, e ao final estes arquivos serao postos devidamente em
      seus lugares como de acordo com a estrutura do repositorio e a pasta ETAPAS sera Mantida,para fim de observação da 
      progressao atraves do historico de commits
```

---

## 🛠️ Como Executar

### Pré-requisitos

- **Java JDK** 11 ou superior instalado.
- **SableCC 3.x** configurado nas variáveis de ambiente.

### Passos para Compilação e Teste

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/{SEU-USUARIO}/{SEU-REPOSITORIO}.git
   cd {SEU-REPOSITORIO}
   ```

2. **Gerar os compiladores com o SableCC:**
   ```bash
   sablecc gramatica/grupo_14.sable
   ```

3. **Compilar as classes Java:**
   ```bash
   javac quinas/*.java
   ```

4. **Executar o analisador com um arquivo de teste:**
   ```bash
   java quinas.Main exemplos/codigo1.qui
   ```

---

## 👥 Equipe (Grupo 14)

<div align="center">

| Integrante | GitHub | E-mail / Contato |
| :--- | :---: | :---: |
| **Enzo Libório Fraga** | [@{usuario}](https://github.com/{usuario}) | `{email}` |
| **João Victor Carvalho Simões** | [@{usuario}](https://github.com/{usuario}) | `{email}` |
| **João Carlos Cruz Santos** | [@{usuario}](https://github.com/{usuario}) | `{email}` |
| **Maxwell Alexandre Souza** | [@{usuario}](https://github.com/{usuario}) | `{email}` |

</div>

---

<div align="center">
Desenvolvido com ☕ e Java para a disciplina de Compiladores — UFS.
</div>