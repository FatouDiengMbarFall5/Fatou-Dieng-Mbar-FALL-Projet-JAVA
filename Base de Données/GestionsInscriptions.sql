-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 18 avr. 2020 à 00:11
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `use etude`
--

-- --------------------------------------------------------

--
-- Structure de la table `etudient`
--

CREATE TABLE `etudient` (
  `Nom` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Prenom` varchar(50) CHARACTER SET latin1 NOT NULL,
  `Classe` varchar(50) CHARACTER SET latin1 NOT NULL,
  `AnneeScolaire` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `etudient`
--

INSERT INTO `etudient` (`Nom`, `Prenom`, `Classe`, `AnneeScolaire`) VALUES
('FALL', 'FATOU', 'LIAGE', '2017'),
('FALL', 'SIGA ', 'MAE', '2018'),
('DIOP', 'ADJA', 'TTL', '2019'),
('DIENG', 'BINETOU', 'MAE', '2019'),
('DIENG', 'BINETOU', 'MAE', '2019'),
('WANE', 'BAILA', 'MAE', '2018'),
('FALL', 'SEYNABOU SOW', 'GLRS', '2018'),
('NDIAYE', 'FATOU', 'LIAGE', '2019'),
('GUEYE', 'JULIETTE', 'MAE', '2018'),
('SARR', 'MAISSA', 'MAE', '2017'),
('NDAO', 'AICHA', 'TTL', '2019/2020'),
('SARR', 'KHADY', 'LIAGE', '2017/2018'),
('DIOP', 'NAR', 'GLRS', '2019/2020');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
