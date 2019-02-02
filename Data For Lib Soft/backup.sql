-- MySQL dump 10.9
--
-- Host: localhost    Database: Library
-- ------------------------------------------------------
-- Server version	4.1.12-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `BOOK_GROUP` varchar(150) default NULL,
  `BOOK_TITLE` varchar(150) default NULL,
  `ACCESSION_NO` varchar(30) NOT NULL default '',
  `AUTHOR_NAME` varchar(100) default NULL,
  `EDITOR_NAME` varchar(100) default NULL,
  `PUBLISHER` varchar(100) default NULL,
  `EDITION` varchar(30) default NULL,
  `PAGES` varchar(30) default NULL,
  `ISBN_NO` varchar(30) default NULL,
  `VENDOR_NAME` varchar(100) default NULL,
  `LANGUAGE` varchar(30) default NULL,
  `VOLUMES` varchar(30) default NULL,
  `PURCHASE_DATE` varchar(30) default NULL,
  `BILL_NO` varchar(30) default NULL,
  `BILL_DATE` varchar(30) default NULL,
  `PRICE_PER_COPY` varchar(30) default NULL,
  `DDC_CODE` varchar(30) default NULL,
  `DDC_DESCRIPTION` varchar(30) default NULL,
  `BOOK_LOCATION` varchar(30) default NULL,
  `DONATED` varchar(30) default NULL,
  `SPECIMEN` varchar(30) default NULL,
  `PUBLICATION_YEAR` varchar(30) default NULL,
  `CURRENCY_DESC` varchar(30) default NULL,
  `ISSUED` tinyint(1) default '0',
  `ADM_NO` varchar(7) default NULL,
  PRIMARY KEY  (`ACCESSION_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--


/*!40000 ALTER TABLE `books` DISABLE KEYS */;
LOCK TABLES `books` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `books` ENABLE KEYS */;

--
-- Table structure for table `circulation`
--

DROP TABLE IF EXISTS `circulation`;
CREATE TABLE `circulation` (
  `Accession_no` varchar(30) NOT NULL default '',
  `Adm_no` varchar(7) default NULL,
  `issued` tinyint(1) default '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `circulation`
--


/*!40000 ALTER TABLE `circulation` DISABLE KEYS */;
LOCK TABLES `circulation` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `circulation` ENABLE KEYS */;

--
-- Table structure for table `records`
--

DROP TABLE IF EXISTS `records`;
CREATE TABLE `records` (
  `ISSUE_DATE` date default NULL,
  `RETURN_DATE` date default NULL,
  `ADM_NO` varchar(7) default NULL,
  `NAME` varchar(70) default NULL,
  `BOOK_TITLE` varchar(150) default NULL,
  `ACCESSION_NO` varchar(30) default NULL,
  `USER_NO` char(2) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `records`
--


/*!40000 ALTER TABLE `records` DISABLE KEYS */;
LOCK TABLES `records` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `records` ENABLE KEYS */;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `ADM_NO` varchar(7) NOT NULL default '',
  `NAME` varchar(70) default NULL,
  `STD` varchar(10) default NULL,
  PRIMARY KEY  (`ADM_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--


/*!40000 ALTER TABLE `students` DISABLE KEYS */;
LOCK TABLES `students` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `students` ENABLE KEYS */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` varchar(20) NOT NULL default '',
  `pass` varchar(30) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--


/*!40000 ALTER TABLE `users` DISABLE KEYS */;
LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES ('admin','admin');
UNLOCK TABLES;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

--
-- Table structure for table `weddedout`
--

DROP TABLE IF EXISTS `weddedout`;
CREATE TABLE `weddedout` (
  `BOOK_GROUP` varchar(150) default NULL,
  `BOOK_TITLE` varchar(150) default NULL,
  `ACCESSION_NO` varchar(30) NOT NULL default '',
  `AUTHOR_NAME` varchar(100) default NULL,
  `EDITOR_NAME` varchar(100) default NULL,
  `PUBLISHER` varchar(100) default NULL,
  `EDITION` varchar(30) default NULL,
  `PAGES` varchar(30) default NULL,
  `ISBN_NO` varchar(30) default NULL,
  `VENDOR_NAME` varchar(100) default NULL,
  `LANGUAGE` varchar(30) default NULL,
  `VOLUMES` varchar(30) default NULL,
  `PURCHASE_DATE` varchar(30) default NULL,
  `BILL_NO` varchar(30) default NULL,
  `BILL_DATE` varchar(30) default NULL,
  `PRICE_PER_COPY` varchar(30) default NULL,
  `DDC_CODE` varchar(30) default NULL,
  `DDC_DESCRIPTION` varchar(30) default NULL,
  `BOOK_LOCATION` varchar(30) default NULL,
  `DONATED` varchar(30) default NULL,
  `SPECIMEN` varchar(30) default NULL,
  `PUBLICATION_YEAR` varchar(30) default NULL,
  `CURRENCY_DESC` varchar(30) default NULL,
  `ISSUED` tinyint(1) default '0',
  `ADM_NO` varchar(7) default NULL,
  PRIMARY KEY  (`ACCESSION_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `weddedout`
--


/*!40000 ALTER TABLE `weddedout` DISABLE KEYS */;
LOCK TABLES `weddedout` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `weddedout` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

