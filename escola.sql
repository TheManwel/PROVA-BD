-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 21-Dez-2018 às 17:55
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `escola`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `id_aluno` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `responsavel` varchar(50) NOT NULL,
  `idade` int(3) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `sala` int(15) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `turno` varchar(30) NOT NULL,
  `ano_escolar` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`id_aluno`, `nome`, `responsavel`, `idade`, `cidade`, `sala`, `telefone`, `turno`, `ano_escolar`) VALUES
(2, 'Manuel', 'Geania e Jailson', 5, 'São Miguel', 3, '909880900', 'v', 2),
(5, 'Pedro Alcantara', 'Tatiana Gonçalves', 17, 'São Miguel', 8, '84 991121051', 'Integral', 2),
(6, 'Luiz David', 'Fabiano', 16, 'São Miguel', 2, '7019279328', 'v', 2),
(7, 'Lowrrana', 'Ana Neres', 17, 'são Miguel', 2, '34982948929', 'q', 7),
(8, 'Giovanny Lucas', 'Lázaro Oliveira', 17, 'Venha Ver', 4, '(84) 96995-6556', 'M', 5),
(9, 'Epifânio Müller', 'Janduí', 5, 'Dr. Severiano', 8, '(84) 99526-5556', 'Matutino', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `senha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_funcionario`, `nome`, `email`, `senha`) VALUES
(1, 'qwe', 'secretario@gmail.com', '123'),
(2, 'João Zecao de zeca', 'Joao@bolinha.com', 'qwerty'),
(3, 'Gustavo', 'Gustavo@gmail.com', '789'),
(4, 'kiu', 'Kiu@gmail.com', '789'),
(5, 'ibdfonf', 'ifguiasg@ifdg.com', '789'),
(7, 'slkdldnkdnlkn', 'sdn', 'aaaaa'),
(8, 'JOCA', 'MAKLMLAKX@DLCNKD', '12345'),
(9, 'Pedroal', 'alcantarap37@gmail.com', 'kgkdjsagh'),
(10, 'khdfhkugu', 'aksjfdkjsdfh@hjgfkjhs.com', 'olhfdfa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`id_aluno`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_funcionario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aluno`
--
ALTER TABLE `aluno`
  MODIFY `id_aluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
