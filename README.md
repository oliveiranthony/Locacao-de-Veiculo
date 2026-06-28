# 🚗 Sistema de Locação de Veículos

Projeto desenvolvido em Java como exercício de Programação Orientada a Objetos (POO).

O sistema simula o cálculo de uma locação de veículos, considerando o tempo de aluguel, valor por hora ou diária e a aplicação de impostos conforme as regras de negócio.

## 📋 Regras de Negócio

O cálculo do aluguel segue as seguintes regras:

- Locações de até **12 horas** são cobradas por hora.
- Locações com duração superior a **12 horas** são cobradas por diária.
- O valor do imposto é calculado sobre o valor da locação:
  - **20%** para valores até **R$ 100,00**
  - **15%** para valores acima de **R$ 100,00**

Ao final, o sistema gera uma nota de pagamento contendo:

- Valor básico da locação
- Valor do imposto
- Valor total a pagar

---

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Interfaces
- Injeção de Dependência (Dependency Injection)
- API `java.time` para manipulação de datas

---

## 📂 Estrutura do projeto

```
src
├── application
│   └── Main.java
├── entities
│   ├── CarRental.java
│   ├── Invoice.java
│   └── Vehicle.java
├── services
│   ├── BrazilTaxService.java
│   ├── RentalService.java
│   └── TaxService.java
```

---

## ▶️ Exemplo de execução

```
Enter rental data
Car model: Civic
Pickup (dd/MM/yyyy HH:mm): 25/06/2026 10:30
Return (dd/MM/yyyy HH:mm): 25/06/2026 14:40

Enter price per hour: 10.00
Enter price per day: 130.00

INVOICE:
Basic payment: 50.00
Tax: 10.00
Total payment: 60.00
```

---

## 📚 Conceitos praticados

- Classes e Objetos
- Encapsulamento
- Associação entre classes
- Interfaces
- Polimorfismo
- Inversão de Dependência
- Injeção de Dependência
- Separação de responsabilidades (SRP)

---

## 🎯 Objetivo

Este projeto foi desenvolvido com fins educacionais para praticar conceitos fundamentais de Programação Orientada a Objetos em Java, simulando um cenário real de cálculo de locação de veículos.
