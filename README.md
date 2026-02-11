# Simulador-de-Caixa-Eletronico

Este projeto é um **simulador simples de caixa eletrônico**, desenvolvido em **Java**, com o objetivo de praticar conceitos básicos da linguagem e lógica de programação.

Ele é ideal para iniciantes que estão aprendendo Java.

---

## 📌 Funcionalidades

O sistema oferece as seguintes opções ao usuário:

1. Consultar saldo  
2. Depositar valor  
3. Sacar valor  
4. Sair do sistema  

🔹 O saldo inicial começa com **R$ 1000,00**.

---

## 🧠 Conceitos utilizados

Neste código são utilizados conceitos importantes do Java, como:

- Entrada de dados com `Scanner`
- Estrutura de repetição `do...while`
- Estrutura de decisão `if`, `else`
- Estrutura `switch case`
- Variáveis do tipo `int` e `double`
- Validação de dados digitados pelo usuário

---

## 🔁 Funcionamento do programa

- O menu é exibido dentro de um loop `do...while`
- O programa continua rodando até o usuário escolher a opção **4 - Sair**
- Cada opção do menu é tratada dentro de um `switch`
- O sistema impede:
  - Depósitos com valores negativos
  - Saques com valores negativos
  - Saques maiores que o saldo disponível

---

