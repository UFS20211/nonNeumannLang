# Introdução

Essa é uma linguagem de programação criada na disciplina de compiladores

# Configurando no Intellij

Em primeiro lugar clone o repositório

```shell
  git clone https://github.com/UFS20211/nonNeumannLang.git
```

Ao clonar o projeto pode verificar que o mesmo possui uma pasta sablecc, então o objetivo
é configura o intellij para rodar o sablecc como uma ferramenta externa.

Para configurar o intellij, basta abrir as configurações

![Settings](https://github.com/UFS20211/nonNeumannLang/blob/main/.github/images/settings.png)

Buscar o termo External Tools

![External Tools](https://github.com/UFS20211/nonNeumannLang/blob/main/.github/images/externaltools.png)

E enfim adicionar uma nova extensão.

![Add External Tools](https://github.com/UFS20211/nonNeumannLang/blob/main/.github/images/newexternaltools.png)
O parametro escrito no arguments é
```
-classpath $FileParentDir$/src/sablecc-3.7/lib/sablecc.jar org.sablecc.sablecc.SableCC $FileParentDir$/src/nonNeumann.sable
```

Finalizadas essas etapas clique sobre o arquivo .sable com o botão direito e clique para compilar

![Compiler](https://github.com/UFS20211/nonNeumannLang/blob/main/.github/images/compiler.png)
