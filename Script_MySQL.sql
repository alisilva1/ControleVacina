create db_controle_vacinas_zup;

use db_controle_vacinas_zup;

CREATE TABLE `tbl_usuarios` (
   `nome` varchar(100) DEFAULT NULL,
   `cpf` int DEFAULT NULL,
   `email` varchar(100) DEFAULT NULL,
   `dataNascimento` date DEFAULT NULL,
   `id` int NOT NULL AUTO_INCREMENT,
   PRIMARY KEY (`id`),
   UNIQUE KEY `e-mail_UNIQUE` (`email`),
   UNIQUE KEY `cpf_UNIQUE` (`cpf`)
 ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 CREATE TABLE `tbl_vacinas` (
   `id_vacina` int NOT NULL AUTO_INCREMENT,
   `nome` varchar(50) DEFAULT NULL,
   `data_realizado` date DEFAULT NULL,
   `tbl_usuarios_id` int NOT NULL,
   PRIMARY KEY (`id_vacina`),
   KEY `fk_tbl_vacinas_tbl_usuarios_idx` (`tbl_usuarios_id`),
   CONSTRAINT `fk_tbl_vacinas_tbl_usuarios` FOREIGN KEY (`tbl_usuarios_id`) REFERENCES `tbl_usuarios` (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;