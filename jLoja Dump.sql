CREATE DATABASE  IF NOT EXISTS `jloja` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `jloja`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: jloja
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `dataNasc` date DEFAULT NULL,
  `sexo` varchar(50) DEFAULT NULL,
  `estado` varchar(5) DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `status` varchar(50) DEFAULT 'ativo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Cleber','998.665.332-44','2000-01-15','Masculino','SC','88135-420','cleber@live.com','(48)54578-9865','ativo'),(2,'Roberto Carlos','123.654.789-01','2003-12-20','Masculino','RR','22223-232','robertinho@live.com','(48)66665-5449','ativo'),(3,'Carla','016.516.515-64','1996-12-31','Feminino','BA','65656-526','carla@isso.com','(48)65451-4444','desativo'),(4,'Maria DiBernardi','898.665.332-44','1986-08-21','Feminino','SP','45648-797','maria@db.com','(11)65456-0111','ativo'),(5,'Thiaguinho','123.523.412-33','2002-02-26','Masculino','SC','48948-654','thiago@vivo.com','(44)56516-5564','desativo'),(6,'Rosana Alves','856.723.413-42','2321-10-12','Masculino','AC','11111-111','rosa@ana.com','(32)13211-2312','desativo'),(7,'Matheus Alves','032.021.012-32','1996-04-20','Masculino','SC','88135-420','matttalves@gmail.com','(48)99183-6171','ativo'),(8,'Candido','123.515.231-23','2011-11-11','Masculino','SC','88445-612','cand@idato.com','(48)65465-4654','ativo'),(9,'Rosilaine','894.654.651-64','1990-01-31','Feminino','SC','44984-948','rosa@ane.com','(48)66516-5498','ativo'),(10,'Taiga','123.654.124-65','1989-04-11','Feminino','SP','48489-498','taa@isso.com','(16)51654-6545','desativo'),(11,'Thiago Laurenir','123.551.231-21','2002-02-26','Masculino','SC','88135-420','thiago@laurenir.com','(48)99647-4859','desativo'),(12,'Robert','123.321.333-32','1990-07-20','Masculino','PR','55444-878','ro@bert.com','(56)45465-4564','ativo'),(13,'Norma','123.123.213-12','2002-02-20','Masculino','AC','12321-321','isso@aquilo.com','(21)31231-5515','ativo'),(14,'roberto','123.212.313-12','1993-02-12','Masculino','AL','56564-645','beto@hotmail.com','(  )     -    ','desativo'),(15,'Alan','064.756.544-84','1996-04-30','Masculino','SC','88155-644','alan@zoka.com','(48)95566-2223','ativo'),(16,'kainan','061.665.656-55','1996-02-29','Masculino','SP','44656-564','kainan@live.com','(48)99912-1564','ativo');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) DEFAULT NULL,
  `tipo` int DEFAULT NULL,
  `qtd` int DEFAULT NULL,
  `preco` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (5,'moto g8 play',13,8,969.5),(8,'teclado gamer',112,10,315.23),(9,'monitor lg',123,32,600),(10,'notebook',2,1,3000),(11,'PC Gamer',1,48,7000),(12,'Cadeira',8,1,155),(13,'Mesa',7,8,75),(15,'fone',5,5,15),(16,'Fone Razer',5,0,100.5),(18,'Mouse GBR',4,0,5.25);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `dataNasc` date DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `funcao` varchar(50) DEFAULT NULL,
  `sexo` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Matheus','1996-04-20','000.000.000-00','adm','Masculino','matttalves@gmail.com','(48)99183-6171','admin','123'),(3,'nome qualquer','1984-01-12','123.654.789-00','vendedor','Masculino','nome@qualquer.com','(48)98877-5566','administrator','321'),(5,'Rosa Alves','1964-10-28','212.000.000-00','vendedora','Feminino','rosa@alves.com','(48)99887-7662','Rosa.Alves','12345'),(6,'eduardo','1992-02-12','123.213.213-21','programmer','Masculino','eduardo@live.com','(12)34551-2312','edu','123'),(7,'Carlos','2000-12-31','123.123.213-12','trabaiador','Masculino','carlos@live.com','(12)32132-1312','Carrito','123'),(8,'Rosita','1995-01-24','147.258.369-33','Gerente','Feminino','rosi@taaa.com','(11)33554-4466','espinhos','celta123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataVenda` date DEFAULT NULL,
  `idCliente` int DEFAULT NULL,
  `valorTotal` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_idcliente` (`idCliente`),
  CONSTRAINT `fk_idcliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,'2020-06-05',7,251.50),(2,'2020-06-05',2,6075.00),(3,'2020-06-05',7,100.50),(4,'2020-06-05',1,100.50),(5,'2020-06-05',1,100.50),(6,'2020-06-06',7,100.50),(7,'2020-06-06',4,100.50),(8,'2020-06-06',11,30100.50),(9,'2020-06-06',8,100.50),(10,'2020-06-06',1,27310.00),(11,'2020-06-05',7,251.50),(12,'2020-06-06',16,52.50),(13,'2020-06-06',7,2217.11),(14,'2020-06-06',2,945.69);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-06 15:49:34
