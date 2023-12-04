Projeto desenvolvido para a avalicao da Ekan que consiste na criacao de  uma aplicação utilizando Java e Spring Boot que forneça uma API REST para manter o cadastro de beneficiários de um plano de saúde.



## Aprendizados

Gostaria de expressar meus sinceros agradecimentos pela valiosa oportunidade concedida para participar deste projeto de avaliação. Foi uma experiência enriquecedora que contribuiu significativamente para o meu desenvolvimento profissional.
Durante este período de avaliação, pude imergir em um desafio que ampliou minha compreensão e habilidades em diversas áreas. Cada obstáculo foi uma oportunidade de aprendizado, e estou grato pela chance de enfrentar esse desafio.
A colaboração neste projeto proporcionou um ambiente propício para o meu crescimento, e os conhecimentos adquiridos certamente terão um impacto positivo em minha trajetória profissional. Agradeço pela confiança depositada em mim e por permitir que eu participasse ativamente dessa experiência única.
Estou ansioso para continuar contribuindo e aplicando as lições aprendidas nesta jornada.
Atenciosamente, Amir Adnan Dahbur


## Funcionalidades

- Cadastro de beneficiario e Documento ❌ 
- Listagem de todos os beneficiarios ✅
- Listagem de todos os documentos relacionados ao beneficiario ✅
- Atualizacao no perfil do beneficiario ✅
- Remocao do perfil do beneficiario ✅


## Uso/Exemplos

##Post

```json
{
    "nome" : "Amir Adnan Dahbur",
    "telefone" : "11 98590-4994",
    "dataNascimento" : "15/12/1999",
    "documentos" : [
        {
            "tipoDocumento" : "CPF",
            "descricao" : "Cadastro de pessoa fisica"
        },
        {
            "tipoDocumento" : "RG",
            "descricao" : "Registro geral"
        }

    ]
}
```


## Stack utilizada

**Java, Spring Boot , H2 e Swagger**

## Rodando localmente

Clone o projeto

```bash
  git clone https://link-para-o-projeto
```

Fazendo o update das dependecias do maven
```bash
 mvn clean install
```

Rodar a main na IDE de sua preferencia


## Autor

- [@amirDahbur](https://github.com/AmirDahbur)

