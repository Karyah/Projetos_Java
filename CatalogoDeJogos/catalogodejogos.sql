-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Abr-2023 às 13:10
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `catalogo`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `catalogodejogos`
--

CREATE TABLE `catalogodejogos` (
  `id` int(11) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `desenvolvedora` varchar(255) NOT NULL,
  `distribuidora` varchar(255) DEFAULT NULL,
  `idiomas` varchar(255) NOT NULL,
  `numero_jogadores` varchar(1) NOT NULL,
  `data_lancamento` varchar(4) NOT NULL,
  `genero` varchar(255) NOT NULL,
  `sistema_operacional` varchar(255) DEFAULT NULL,
  `processador` varchar(255) NOT NULL,
  `memoria` varchar(255) NOT NULL,
  `placa_de_video` varchar(255) NOT NULL,
  `armazenamento` varchar(255) NOT NULL,
  `ativo` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabela `catalogodejogos`
--
ALTER TABLE `catalogodejogos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `catalogodejogos`
--
ALTER TABLE `catalogodejogos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
