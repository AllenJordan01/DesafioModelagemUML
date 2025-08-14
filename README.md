# DesafioModelagemUML
# 📱 Projeto IPhone em Java

Este projeto simula o comportamento básico de um iPhone, implementando funcionalidades de:

- Reprodutor Musical
- Aparelho Telefônico
- Navegador de Internet

A estrutura é baseada em **programação orientada a interfaces**, promovendo modularidade e reutilização de código.

---

## 📦 Interfaces

### 🎵 ReprodutorMusical
Define comportamentos de um player de música:
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 📞 AparelhoTelefonico
Define ações básicas de telefonia:
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 NavegadorInternet
Define funcionalidades de navegação:
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

## 📱 Classe Principal: `IPhone`

A classe `IPhone` implementa as três interfaces, simulando as funcionalidades integradas de um smartphone:

``` mermaid
classDiagram
 
        class ReprodutorMusical {
            <<interface>>
            +tocar() void
            +pausar() void
            +selecionarMusica(musica: String) void
        }

        class AparelhoTelefonico {
            <<interface>>
            +ligar(numero: String) void
            +atender() void
            +iniciarCorreioVoz() void
        }

        class NavegadorInternet {
            <<interface>>
            +exibirPagina(url: String) void
            +adicionarNovaAba() void
            +atualizarPagina() void
        }

        class IPhone {
            +tocar() void
            +pausar() void
            +selecionarMusica(musica: String) void
            +ligar(numero: String) void
            +atender() void
            +iniciarCorreioVoz() void
            +exibirPagina(url: String) void
            +adicionarNovaAba() void
            +atualizarPagina() void
        }

        IPhone ..|> ReprodutorMusical
        IPhone ..|> AparelhoTelefonico
        IPhone ..|> NavegadorInternet
    
```
---
## 📦 Exemplo de uso

Classe principal:

```bash
public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        //Usando o reprodutor musical
        iPhone.selecionarMusica("Angra - Carry On");
        iPhone.tocar();
        iPhone.pausar();

        //Usando o aparelho telefônico
        iPhone.ligar("99912345678");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        //Usando o navegador de internet
        iPhone.exibirPagina("www.dio.me");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

    }
}
```

Ao executar o projeto as seguintes saídas serão exibidas:

```bash
Selecionando música: "Angra - Carry On".
Reproduzindo música no iPhone...
Música pausada.
Ligando para o número: 99912345678...
Atendendo a chamada.
Iniciando o correio de voz...
Abrindo a página da web: www.dio.me
Nova aba adicionada ao navegador.
Página atualizada.

Process finished with exit code 0
```
---

## 🚀 Tecnologias utilizadas

- **Java 21 LTS** (JDK 21)
- **AWS Corretto 21.0.7** (distribuição do OpenJDK mantida pela Amazon)
- **UML (Unified Modeling Language)** – Utilizada para modelagem dos componentes do iPhone
- IDE: IntelliJ IDEA / Eclipse / VS Code (opcional)
- Terminal para entrada e saída de dados
  
---
## 📦 Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/AllenJordan01/DesafioModelagemUML.git
```

2. Acesse a pasta do projeto:
```bash
cd DesafioModelagemUML/ModelagemDeComponentes
```

3. Verifique se possui o Java JDK 21 instalado (ou JDK 17+, se preferir). Este projeto foi desenvolvido usando o AWS Corretto 21.

4. Compile os arquivos
```bash
javac componentes/*.java IPhone.java Main.java
```

5. Execute o programa:
```bash
java Main
```
