CREATE TABLE IF NOT EXISTS vacina_aplicada (
  id int NOT NULL AUTO_INCREMENT,
  cpf varchar(20) NOT NULL,
  imunobiologico varchar(50) NOT NULL,
  dt_aplicacao date NOT NULL,
  dt_proxima_aplicacao date NOT NULL,
  uf_aplicacao varchar(2) NOT NULL,
  PRIMARY KEY (id),
  KEY fk_cpf (cpf)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

create table usuario(
 	nomeCompleto varchar(25) not null,
 	idade int not null,
 	sexo varchar(10) not null,
 	cpf varchar(20) not null,
 	estado varchar(10) not null,
 	constraint cpf primary key (cpf)
  );
  
  CREATE TABLE estado(
	nome_estado varchar(20) not null,
	abreviacao varchar(3) not null,
	constraint primary key (abreviacao)
);

-- POPULANDO TABELA - USUÁRIO
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Vitor Francisco Lima",12,"HOMEM","486.626.781-06","AC");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Betina Sophie Tânia Drumonda",23,"MULHER","553.703.725-43","AC");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Benício Kaique Melo",31,"HOMEM","253.346.869-08","AL");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Rosa Sandra da Costa",33,"MULHER","719.111.907-17","AL");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Thiago Miguel Rafael Souza",45,"HOMEM","046.138.232-69","AM");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Flávia Pietra Antonella Rocha",54,"MULHER","769.937.613-78","AM");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Mauro Ferraz",56,"HOMEM","817.146.209-05","BA");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Letícia Marina Fogaça",65,"MULHER","056.233.647-80","BA");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Benjamin Emanuel Roberto Martins",78,"HOMEM","281.900.730-95","CE");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Emily Rita Assunção",87,"MULHER","713.979.635-14","CE");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Pedro Cauê Fernando Almada",89,"HOMEM","201.594.301-35","ES");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Lúcia Alessandra da Rocha",98,"MULHER","897.231.916-36","ES");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Marcelo Leandro Theo Brito",48,"HOMEM","950.392.063-99","GO");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Caleb Nathan Gonçalves",86,"HOMEM","105.254321-91","GO");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Lúcia Alessandra da Rocha",88,"MULHER","893.216.390-12","MA");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Matheus Manuel Daniel Vieira",77,"HOMEM","183.845.638-45","MA");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Camila Sophia Rosângela Rodrigues",22,"MULHER","985.724.704-09","MT");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Heitor Jorge Thiago Costa",49,"HOMEM","794.849.101-57","MT");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Alice Hadassa da Paz",47,"MULHER","138.588.680-35","MS");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Marcos Fernando Alves",55,"HOMEM","147.063.089-33","MS");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Isadora Daniela Moura",22,"MULHER","913.371.624-26","MG");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Matheus Giovanni Cauã Ferreira",62,"HOMEM","06981065126","MG");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Camila Milena Lorena das Neves",81,"MULHER","461.414.967-76","PA");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Fernando Roberto Barros",11,"HOMEM","058.680.878-79","PA");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Ana Elaine Maitê Souza",10,"MULHER","781.891.130-89","PB");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Thomas Yago Theo da Costa",1,"HOMEM","891.320.091-00","PR");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Pietra Agatha Barbosa",23,"MULHER","130.812.345-06","PR");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Kaique Yago Hugo da Luz",3,"HOMEM","664.181.309-60","PE");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Marcela Lívia da Rosa",8,"MULHER","770.723.681-59","PE");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Otávio Francisco Augusto Souza",49,"HOMEM","321.876.196-48","PI");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Marcela Lívia da Rosa",14,"MULHER","321.876.196-48","PI");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Bárbara Sophia Moreira",18,"MULHER","907.061.552-54","RJ");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Theo Matheus Pereira",16,"HOMEM","814.389.055-48","RJ");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Sara Manuela Julia Cardoso",15,"MULHER","115.210.090-40","RS");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Henrique Raimundo da Mata",11,"HOMEM","507.201.758-36","RS");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Helena Bianca Novaes",8,"MULHER","505.225.532-22","RO");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Henrique Murilo Pires",78,"HOMEM","013.127.977-70","RO");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Sônia Agatha Brito",41,"MULHER","773.693.537-88","RR");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Vicente Anthony Moraes",10,"HOMEM","498.015.113-20","RR");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Cecília Luiza dos Santos",0,"MULHER","875.357.513-00","SC");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Mário Tiago Eduardo Corte Real",7,"HOMEM","559.854.530-65","SC");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Julia Ana Nunes",83,"MULHER","722.174.514-56","SP");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Arthur Samuel Luiz Silveira",38,"HOMEM","571.530.159-90","SP");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Sandra Juliana Baptista",46,"MULHER","404.986.718-44","SE");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Benedito Geraldo Nelson Porto",66,"HOMEM","404.986.718-44","SE");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Cecília Simone Elaine Martins",44,"MULHER","279.025.715-98","TO");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Fernando Cauã Caleb Souza",22,"HOMEM","279.025715-98","TO");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Maria Isabel Bárbara Fernandes",23,"MULHER","410.785.737-94","DF");
INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES ("Igor Tomás José Barbosa",21,"HOMEM","596.125.415-15","DF");


-- POPULAR TABELA ESTADO
insert into estado values ("RIO GRANDE DO NORTE", "RN");
insert into estado values ("ACRE", "AC");
insert into estado values ("ALAGOAS", "AL");
insert into estado values ("AMAPA", "AP");
insert into estado values ("AMAZONAS", "AM");
insert into estado values ("BAHIA", "BA");
insert into estado values ("CEARA", "CE");
insert into estado values ("DISTRITO FEDERAL", "DF");
insert into estado values ("ESPIRITO SANTO", "ES");
insert into estado values ("GOIAS", "GO");
insert into estado values ("MARANHAO", "MA");
insert into estado values ("MATO GROSSO", "MT");
insert into estado values ("MATO GROSSO DO SUL", "MS");
insert into estado values ("MINAS GERAIS", "MG");
insert into estado values ("PARA", "PA");
insert into estado values ("PARAIBA", "PB");
insert into estado values ("PARANA", "PR");
insert into estado values ("PERNAMBUCO", "PE");
insert into estado values ("PIAUI", "PI");
insert into estado values ("RIO DE JANEIRO", "RJ");
insert into estado values ("RIO GRANDE DO NORTE", "RN");
insert into estado values ("RIO GRANDE DO SUL", "RS");
insert into estado values ("RONDONIA", "RO");
insert into estado values ("RORAIMA", "RR");
insert into estado values ("SANTA CATARINA", "SC");
insert into estado values ("SAO PAULO", "SP");
insert into estado values ("SERGIPE", "SE");
insert into estado values ("TOCANTINS", "TO");

-- POPULAR TABELA REGIÃO
select * from regiao;
insert into regiao values ("NORTE", "AP");
insert into regiao values ("NORTE", "AC");
insert into regiao values ("NORTE", "AM");
insert into regiao values ("NORTE", "PA");
insert into regiao values ("NORTE", "RO");
insert into regiao values ("NORTE", "RR");
insert into regiao values ("NORTE", "TO");
insert into regiao values ("NORDESTE", "AL");
insert into regiao values ("NORDESTE", "BA");
insert into regiao values ("NORDESTE", "CE");
insert into regiao values ("NORDESTE", "MA");
insert into regiao values ("NORDESTE", "PB");
insert into regiao values ("NORDESTE", "PE");
insert into regiao values ("NORDESTE", "PI");
insert into regiao values ("NORDESTE", "SE");
insert into regiao values ("NORDESTE", "RN");
insert into regiao values ("CENTROESTE", "GO");
insert into regiao values ("CENTROESTE", "MT");
insert into regiao values ("CENTROESTE", "MS");
insert into regiao values ("CENTROESTE", "DF");
insert into regiao values ("SUDESTE", "MG");
insert into regiao values ("SUDESTE", "ES");
insert into regiao values ("SUDESTE", "RJ");
insert into regiao values ("SUDESTE", "SP");
insert into regiao values ("SUL", "SC");
insert into regiao values ("SUL", "RS");
insert into regiao values ("SUL", "PR");
