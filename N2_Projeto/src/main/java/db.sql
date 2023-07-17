create database ProjetoN2;

use ProjetoN2;

CREATE TABLE `Produto` (
    `produtoId` int AUTO_INCREMENT NOT NULL ,
    `fornecedorId` int  NOT NULL ,
    `tipo` varchar (20)  NOT NULL ,
    `nome` varchar(50)  NOT NULL ,
    `descricao` varchar(100)  NOT NULL ,
    `preco` float  NOT NULL ,
    PRIMARY KEY (
        `produtoId`
    )
);

CREATE TABLE `Fornecedor` (
    `fornecedorId` int AUTO_INCREMENT NOT NULL ,
    `nome` varchar (50) NOT NULL ,
    `cnpj` varchar(20)  NOT NULL ,
    `razaoSocial` varchar(50) NOT NULL ,
    `email` varchar(50)  NOT NULL ,
    `inscEstadual` varchar(15)  NOT NULL ,
    PRIMARY KEY (
        `fornecedorId`
    )
);

CREATE TABLE `Venda` (
    `vendaId` int AUTO_INCREMENT NOT NULL ,
    `horaVenda`varchar(15)  NOT NULL ,
    `nomeComprador` varchar(50)  NOT NULL ,
    `cpf` varchar(20)  NOT NULL ,
    `totalVenda` float  NOT NULL ,
    PRIMARY KEY (
        `vendaId`
    )
);

CREATE TABLE `ItensVenda` (
    `itemVendaId` int AUTO_INCREMENT NOT NULL ,
    `vendaId` int  NOT NULL ,
    `produtoId` int  NOT NULL ,
    `quantidade` int  NOT NULL ,
    `precoUnit` float  NOT NULL ,
    PRIMARY KEY (
        `itemVendaId`
    )
);

CREATE TABLE `Tipo` (
    `tipoId` int AUTO_INCREMENT NOT NULL ,
    `nomeTipo` varchar(20)  NOT NULL ,
    PRIMARY KEY (
        `tipoId`
    )
);

ALTER TABLE `Produto` ADD CONSTRAINT `fk_Produto_fornecedorId` FOREIGN KEY(`fornecedorId`)
REFERENCES `Fornecedor` (`fornecedorId`);

ALTER TABLE `Produto` ADD CONSTRAINT `fk_Produto_tipo` FOREIGN KEY(`tipo`)
REFERENCES `Tipo` (`tipoId`);

ALTER TABLE `ItensVenda` ADD CONSTRAINT `fk_ItensVenda_vendaId` FOREIGN KEY(`vendaId`)
REFERENCES `Venda` (`vendaId`);

ALTER TABLE `ItensVenda` ADD CONSTRAINT `fk_ItensVenda_produtoId` FOREIGN KEY(`produtoId`)
REFERENCES `Produto` (`produtoId`);

