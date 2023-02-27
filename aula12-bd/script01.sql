
-- Isso é um comentário

-- CTRL + ENTER - atalho para executar o comando onde estiver o cursor

-- cria um novo schema (Um novo Banco de Dados)
create database bd_itau;

-- marque este banco como padrão (defaul)
use bd_itau;

-- criar uma nova tabela
create table cliente (
	codigo int,
    nome varchar(100)
);

-- inserindo novos dados dentro da tabela
insert into cliente values(1, 'Rogério Silva');
insert into cliente values(2, 'Marlene Alcantara');

-- consultando os dados da tabela
-- * significa todas as colunas
select * from cliente;

-- mostra apenas os nomes
select nome from cliente;

-- mostra os dados apenas do cliente número 1
select *
from cliente
where codigo = 1;

-- alterar os dados
update cliente set nome = 'Marlene Barros' where codigo = 2;

-- apagando um registro (linha) que tem o código 2
delete from cliente where codigo = 2;

-- Insert / Select / Update / Delete 
-- CRUD = Create / Read / Update / Delete

-- paga todos os clientes com código maior que 100
delete from cliente where codigo > 100;
