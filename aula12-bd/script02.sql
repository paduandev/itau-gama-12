-- criar uma nova tabela

-- not null = não pode ser deixado sem preencher (branco)
-- auto_increment = o próprio BD vai gerar esses números: 1, 2, 3, ...
-- constraint é um restrição (regra)
-- primary key (PK) = é uma chave primária

use bd_itau;

create table carro (
	codigo integer not null auto_increment, 
    modelo varchar(50),
    anoFabricacao integer,
    constraint pk_carro primary key (codigo)
);

-- inserindo dados na tabela
insert into carro values(null, 'VW Gol', 1990);
insert into carro values(null, 'Fiat Palio', 2001);
insert into carro (modelo, anoFabricacao) values ('Chevrolet OPala', 1970);

-- exibindo todos os carros
select * from carro;

-- lista os carros fabricados depois dos anos 90
select *
from carro
where anoFabricacao >= 1990 or codigo < 2
order by anoFabricacao;

-- cria uma nova tabela relacionada com a tabela anterior
-- not null = obrigatorio preencher, não pode ser nulo
-- unique = não pode ter repetição. Neste caso, cada pessoa tem um telefone diferente
-- primary key (PK) = é uma chave primária
-- foreign Key (FK) = é uma chave estrangeira

create table proprietario (
	codigo integer not null auto_increment,
    nome varchar(100),
    telefone varchar(20) not null unique,
    cod_carro integer,
    constraint pk_proprietario primary key (codigo),
    constraint fk_proprietario foreign key (cod_carro) references carro(codigo)
);

-- apaga a tabela E TODOS os dados junto!
-- drop table proprietario;

-- insere dados na tabela proprietario
insert into proprietario values(null, 'Gustavo', '111', 1);
insert into proprietario values(null, 'Rogério', '222', 2);
insert into proprietario values(null, 'Jonas', '333', null);

-- Listar todos os proprietarios
select * from proprietario;

-- listar os nomes dos proprietarios e os nomes dos seus carros
select *
from proprietario, carro
where proprietario.cod_carro = carro.codigo;

-- listar todos os proprietarios e os nomes dos seus carros
select nome, modelo, anoFabricacao
from proprietario inner join carro on proprietario.cod_carro = carro.codigo;

-- listar todos os proprietarios e os nomes dos seus carros, mesmo que
-- o proprietario não tenha carro cadastrado
-- left inclui todos os registros que estão na tabela à esquerda do join
select nome, modelo, anoFabricacao
from proprietario left join carro on proprietario.cod_carro = carro.codigo;

-- listar todos os proprietarios e os nomes dos seus carros, mesmo que
-- o carro não tenha um proprietario
-- right inclui todos os registros que estão na tabela à direita do join
select nome, modelo, anoFabricacao
from proprietario right join carro on proprietario.cod_carro = carro.codigo;

-- listar todos os proprietarios e os nomes dos seus carros, mesmo que
-- o carro não tenha um proprietario ou o proprietario não tenha carro
-- right: inclui todos os registros que estão na tabela à direita do join
-- left: inclui todos os registros que estão na tabela à esquerda do join
-- union: une as duas tabelas (igual na teoria dos conjuntos - sem repetição)

select nome, modelo, anoFabricacao
from proprietario left join carro on proprietario.cod_carro = carro.codigo
union
select nome, modelo, anoFabricacao
from proprietario right join carro on proprietario.cod_carro = carro.codigo;
