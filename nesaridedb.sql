-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2024 at 04:07 AM
-- Server version: 10.6.7-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nesaridedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `daftar`
--

CREATE TABLE `daftar` (
  `Nama` varchar(40) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Nomer` float NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `daftar`
--

INSERT INTO `daftar` (`Nama`, `Username`, `Email`, `Nomer`, `Password`) VALUES
('Nabil Ghulam', 'Nabil Ghulam', 'nabilghlm12@gmail.com', 85102900000, 'nabil2005'),
('Evan Rasyid Nandana', 'Evan Rasyid', 'evanrasyid@gmail.com', 85728100000, 'evan2005'),
('Hildan Deswari', 'Hildan Deswari', 'hildan@gmail.com', 85102900000, 'hildan2005'),
('Ruhialsyah Ai Khadijah', 'Ruhi', 'ruhi@gmail.com', 85102900000, 'ruhi2006');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('nabilghulam', 'nabil2005');

-- --------------------------------------------------------

--
-- Table structure for table `orderan`
--

CREATE TABLE `orderan` (
  `Nama` varchar(20) NOT NULL,
  `Telepon` float NOT NULL,
  `Driver` varchar(20) NOT NULL,
  `Lokasi` varchar(30) NOT NULL,
  `Ride` varchar(20) NOT NULL,
  `Car` varchar(20) NOT NULL,
  `Tarif` int(10) NOT NULL,
  `Jumlah` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `Penumpang` varchar(20) NOT NULL,
  `No` varchar(20) NOT NULL,
  `Driver` varchar(20) NOT NULL,
  `Lokasi` varchar(50) NOT NULL,
  `Ride` varchar(20) NOT NULL,
  `Car` varchar(20) NOT NULL,
  `Tarif` int(20) NOT NULL,
  `Jumlah` int(10) NOT NULL,
  `Admin` int(20) NOT NULL,
  `Total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`Penumpang`, `No`, `Driver`, `Lokasi`, `Ride`, `Car`, `Tarif`, `Jumlah`, `Admin`, `Total`) VALUES
('Nabil Ghulam', '085102860099', 'Fikri', 'Ketintang - Royal, Cito', 'true', 'false', 10000, 1, 2500, 12500),
('Evan Rasyid', '081356781213', 'Wangir', 'Ketintang - Kampus', 'true', 'false', 5000, 1, 2500, 7500),
('Khoirun Niam', '085772354490', 'Rafi', 'Ketintang - Waru', 'true', 'false', 15000, 1, 2500, 17500),
('Marzouk', '085102860099', 'Wangir', 'Ketintang - Kampus', 'true', 'false', 5000, 1, 2500, 7500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
