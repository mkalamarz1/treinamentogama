-- isso é um comentário

-- Criar uma nova "Base de Dados"
create database bd_itau;

-- marcar o BD como padrão 
use bd_itau;

-- criar uma nova tabela no BD
-- [nome coluna] [tipo de dado] [qualificadores]
-- not null - estacoluna não pode ser deixada em branco
-- auto increment  = numeração será gerada pelo proprio BD (1,2,3,4, ....)
-- varchar (x) = campo de texto com tamanho máximo x
-- primary key = chave primária (indetificador na tabela), não pode repeti
 
create table cliente ( 
    codigo integer not null auto_increment,
    nome varchar(120) not null,
    telefone varchar(20),
    constraint pk_cliente primary key(codigo)
);


-- CUIDADO!!! apaga a estrutura da tabela e TODOS os dados juntos
drop table cliente;

-- descrever os detalhes da tabela
desc cliente;

-- inserir dados na tabela
insert into cliente (codigo, nome, telefone) values (null, 'Marcia Kalamarz', '(51) 993836567'); 
insert into cliente (codigo, nome, telefone) values (null, 'Adaline Piotr', '(51) 999992525'); 
insert into cliente (codigo, nome, telefone) values (null, 'Lucas Eduardo ', '(51) 993106576'); 
insert into cliente (codigo, nome, telefone) values (null, 'Julia Janina', '(51) 993831010'); 

-- buscar as informações no banco de dados
-- select [quais colunas] from [qual tabela] where [qual condição]

-- buscar todas as informações de todos os clientes
select *
from cliente;

-- buscar o nome e o telefone do cliente com código 2
select nome, telefone  -- busque apenas nome e telefone
from cliente           -- na tabela cliente
where codigo = 2;      -- onde o código seja igual a 2

-- apagando dados
-- apagar o cliente que tem código 3
delete from cliente where codigo = 3;

-- atualizar dados
update cliente
set telefone = '(21) 12345-1234'
where codigo = 2;


 