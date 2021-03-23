 
CREATE TABLE IF NOT EXISTS `sysdrograria`.`fornecedores` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;

 use sysdrograria;
CREATE TABLE PRODUTOS (
CODIGO INT auto_increment primary KEY NOT NULL,
DESCRICAO VARCHAR(150) NOT NULL, 
PRECO decimal(10,2) NOT NULL,
QUANTIDADE INT NOT NULL,
FORNECEDORES_CODIGO INT NOT NULL,
CONSTRAINT fk_produtos_fornecedores
FOREIGN KEY (fornecedores_codigo)
REFERENCES fornecedores (codigo)
)ENGINE = innodb;
 