# API Cadastro de Vacinas 

## Descrição do Projeto
<p align="center">Esse projeto busca criar um banco de dados disponível para cadastro e controle de vacinados</p>

## Aplicações necessárias:
<p align="center">Basta baixar o arquivo para uma pasta local através do comando xpto, fazer a instalação do MYSQL community service</p>

## Como Utilizar:

<p>Para cadastrar o usuario basta enviar um JSON para esse endereço:  /cadastrarusuario, com esse formato: </p>
<p><b>
{
    "cpf":12312312312,
    "nome":"Alisson Medeiros",
    "dataNascimento":"07/05/1990",
    "email":"alisson_teste@gmail.com"
}
</b></p>
Obs: Só é permitido o cadastro de Usuarios com nome e e-mail distintos de outros usuarios e todos os campos devem ser preenchidos.

<br><br>

<p>Para cadastrar vacinas enviar o JSON para o endereço: /cadastrarvacina, com esse formato:</p>

<p><b>
{
    "nome":"COVID-19",
    "dataRealizado":"22/02/2021",
    "email":"alisson_teste@gmail.com"
}
</b></p>
OBS: O e-mail deve ser inserido de acordo com o que está cadastrado no Usuarios.

