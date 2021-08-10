use db_hotel;

CREATE TABLE `tb_hospede` (
  `id_hospede` int NOT NULL AUTO_INCREMENT,
  `nm_hospede` varchar(90) NOT NULL,
  `dt_nascimento` date DEFAULT NULL,
  `cpf` int DEFAULT NULL,
  PRIMARY KEY (`id_hospede`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tb_hotel` (
  `id_hotel` int NOT NULL AUTO_INCREMENT,
  `nm_hotel` varchar(45) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `qtd_estrelas` int DEFAULT NULL,
  PRIMARY KEY (`id_hotel`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tb_quarto` (
  `id_quarto` int NOT NULL AUTO_INCREMENT,
  `id_hotel` int DEFAULT NULL,
  `categoria_quarto` int DEFAULT NULL,
  `qtd_leito` int DEFAULT NULL,
  `nr_quarto` int DEFAULT NULL,
  `preco_diaria` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_quarto`),
  KEY `quarto_hotel_idx` (`id_hotel`),
  CONSTRAINT `quarto_hotel` FOREIGN KEY (`id_hotel`) REFERENCES `tb_hotel` (`id_hotel`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tb_hospedagem` (
  `id_hospedagem` int NOT NULL AUTO_INCREMENT,
  `id_quarto` int NOT NULL,
  `id_hospede` int NOT NULL,
  `dt_checkin` date NOT NULL,
  `dt_checkout` date DEFAULT NULL,
  PRIMARY KEY (`id_hospedagem`),
  KEY `hospedagem_hospede_idx` (`id_hospede`),
  KEY `hospedagem_quarto_idx` (`id_quarto`),
  CONSTRAINT `hospedagem_hospede` FOREIGN KEY (`id_hospede`) REFERENCES `tb_hospede` (`id_hospede`),
  CONSTRAINT `hospedagem_quarto` FOREIGN KEY (`id_quarto`) REFERENCES `tb_quarto` (`id_quarto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `tb_hotel` VALUES (1,'Castro\'s Park Hotel','Av. República do Líbano, 1520 - St. Oeste, Goiânia - GO, 74115-030',5),(2,'Hotel Aldeia Cerrado Pousada','R. 1122, 220 - Quadra 220, Lote 04 - St. Marista, Goiânia - GO, 74175-110',4),(3,'Sun Square Suítes Hotel by ALTERADO ALTERADO','R. 9, 1053 - St. Oeste, Goiânia - GO, 74120-010',3);
INSERT INTO `tb_quarto` VALUES (1,1,2,3,120,240.00),(2,1,3,2,401,500.00),(4,1,1,1,205,100.00);
INSERT INTO `tb_hospede` VALUES (1, 'Caio', '2002-9-07', 1234);
INSERT INTO `tb_hospedagem` VALUES (1, 1, 1, '2021-08-02', '2021-08-04');

