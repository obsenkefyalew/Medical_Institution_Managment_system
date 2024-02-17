-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2019 at 08:03 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `common1`
--

CREATE TABLE `common1` (
  `P_ID` int(11) NOT NULL,
  `D_ID` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `common2`
--

CREATE TABLE `common2` (
  `P_ID` varchar(9) NOT NULL,
  `T_ID` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `D_ID` varchar(9) NOT NULL,
  `D_Name` varchar(20) NOT NULL,
  `Degree` varchar(10) NOT NULL,
  `Phone` varchar(11) NOT NULL,
  `User_Name` varchar(10) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `R_ID` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`D_ID`, `D_Name`, `Degree`, `Phone`, `User_Name`, `Password`, `R_ID`) VALUES
('0000-1111', 'Dr. Fahim Ahmed', 'FCPS', '01917364563', 'Fahim', '12345', '0000-111'),
('0000-2222', 'Dr. Satyajit Malakar', 'FRCS', '01715916353', 'Satyajit', '123456', '0000-111'),
('0000-3333', 'Dr. Mousumi Malakar', 'MRCP', '01715839584', 'Mousumi', '1234567', '0000-111'),
('0000-4444', 'Dr. Progga Shome', 'MCPS', '01917836464', 'Progga', '12345678', '0000-111');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `P_ID` int(11) NOT NULL,
  `P_Name` varchar(20) NOT NULL,
  `Age` int(11) NOT NULL,
  `Blood_Group` varchar(3) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Phone` varchar(11) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `User_Name` varchar(10) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `R_ID` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`P_ID`, `P_Name`, `Age`, `Blood_Group`, `Gender`, `Phone`, `Address`, `User_Name`, `Password`, `R_ID`) VALUES
(1, 'Hridoy Bir', 21, 'O+', 'Male', '01716916353', 'Badda', 'Bir', '12@21', '0000-111');

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `R_ID` varchar(8) NOT NULL,
  `R_Name` varchar(20) NOT NULL,
  `R_Age` int(11) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`R_ID`, `R_Name`, `R_Age`, `User_Name`, `Password`) VALUES
('0000-111', 'Shuvo Biswas', 23, 'Shuvo', '123@321');

-- --------------------------------------------------------

--
-- Table structure for table `testing_section`
--

CREATE TABLE `testing_section` (
  `T_ID` varchar(3) NOT NULL,
  `T_Name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `testing_section`
--

INSERT INTO `testing_section` (`T_ID`, `T_Name`) VALUES
('0-1', 'C.B.C'),
('0-2', 'Ultrasonography'),
('0-3', 'X-Ray'),
('0-4', 'Urine-Test');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `common1`
--
ALTER TABLE `common1`
  ADD PRIMARY KEY (`P_ID`),
  ADD KEY `P_ID` (`P_ID`),
  ADD KEY `D_ID` (`D_ID`);

--
-- Indexes for table `common2`
--
ALTER TABLE `common2`
  ADD PRIMARY KEY (`P_ID`),
  ADD KEY `P_ID` (`P_ID`),
  ADD KEY `T_ID` (`T_ID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`D_ID`),
  ADD KEY `R_ID` (`R_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`P_ID`),
  ADD KEY `R_ID` (`R_ID`),
  ADD KEY `R_ID_2` (`R_ID`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`R_ID`);

--
-- Indexes for table `testing_section`
--
ALTER TABLE `testing_section`
  ADD PRIMARY KEY (`T_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `P_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `common1`
--
ALTER TABLE `common1`
  ADD CONSTRAINT `S4` FOREIGN KEY (`P_ID`) REFERENCES `patient` (`P_ID`);

--
-- Constraints for table `common2`
--
ALTER TABLE `common2`
  ADD CONSTRAINT `SS1` FOREIGN KEY (`T_ID`) REFERENCES `testing_section` (`T_ID`);

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `S2` FOREIGN KEY (`R_ID`) REFERENCES `receptionist` (`R_ID`);

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `S1` FOREIGN KEY (`R_ID`) REFERENCES `receptionist` (`R_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
