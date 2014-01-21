-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	4.1.8-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema arindam
--

CREATE DATABASE IF NOT EXISTS arindam;
USE arindam;

--
-- Definition of table `admin table`
--

DROP TABLE IF EXISTS `admin table`;
CREATE TABLE `admin table` (
  `User_Name` varchar(20) NOT NULL default '',
  `Password` varchar(45) NOT NULL default '',
  `Application_I.D.` varchar(45) NOT NULL default '',
  `Verifier_I.D.` varchar(45) NOT NULL default '',
  `Verified` varchar(5) NOT NULL default '',
  `Approved` varchar(5) NOT NULL default '',
  PRIMARY KEY  (`User_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin table`
--

/*!40000 ALTER TABLE `admin table` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin table` ENABLE KEYS */;


--
-- Definition of table `chan`
--

DROP TABLE IF EXISTS `chan`;
CREATE TABLE `chan` (
  `uni` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`uni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chan`
--

/*!40000 ALTER TABLE `chan` DISABLE KEYS */;
INSERT INTO `chan` (`uni`) VALUES 
 ('1'),
 ('6015'),
 ('da9439e2-fa39-45bc-806b-7035ffb4eeb6'),
 ('de9acb3e-535e-4a78-8755-10c352dbc004');
/*!40000 ALTER TABLE `chan` ENABLE KEYS */;


--
-- Definition of table `registered`
--

DROP TABLE IF EXISTS `registered`;
CREATE TABLE `registered` (
  `Application_ID` varchar(20) NOT NULL default '',
  `UniqueID` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`Application_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registered`
--

/*!40000 ALTER TABLE `registered` DISABLE KEYS */;
INSERT INTO `registered` (`Application_ID`,`UniqueID`) VALUES 
 ('0919','d7de688d-07f4-4d2b-833c-0e413156831b'),
 ('1255','b61b5053-2816-48bf-9756-8e03e7221f20'),
 ('3344','51a2f1e5-59db-44eb-adb0-ba71567c0665'),
 ('4477','40455e75-4d4c-4836-96bc-3e3c57cb6fca'),
 ('6015','c8348fa3-0d0e-43e3-833a-2ae80c978601'),
 ('9977','e165953e-2884-4528-bab0-cee43a2ae483');
/*!40000 ALTER TABLE `registered` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Name` varchar(20) NOT NULL default '',
  `Father_Name` varchar(20) NOT NULL default '',
  `Address` varchar(45) NOT NULL default '',
  `Phone` int(20) unsigned NOT NULL default '0',
  `Pan_Card_Number` varchar(45) NOT NULL default '',
  `Nationality` varchar(45) NOT NULL default '',
  `Employment` varchar(45) NOT NULL default '',
  `Gender` varchar(5) NOT NULL default '',
  `D.O.B.` datetime NOT NULL default '0000-00-00 00:00:00',
  `Email_I.D.` varchar(45) NOT NULL default '',
  `Application_ID` varchar(45) NOT NULL default '',
  `City` varchar(45) NOT NULL default '',
  `State` varchar(45) NOT NULL default '',
  `Marital_Status` varchar(5) NOT NULL default '',
  `User_Name` varchar(45) NOT NULL default '',
  `Password` varchar(45) NOT NULL default '',
  `Approved` varchar(5) NOT NULL default '',
  `Verified` varchar(5) NOT NULL default '',
  PRIMARY KEY  (`Application_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`Name`,`Father_Name`,`Address`,`Phone`,`Pan_Card_Number`,`Nationality`,`Employment`,`Gender`,`D.O.B.`,`Email_I.D.`,`Application_ID`,`City`,`State`,`Marital_Status`,`User_Name`,`Password`,`Approved`,`Verified`) VALUES 
 ('Ayush Jain','Vinod Kr.Jain','meerut',837382927,'tyetr56tr','indian','s/w engineer','Male','1999-12-12 00:00:00','ayush@gmail.com','0919','meerut','Uttar Pradesh','n','ayush','ayush','1','1'),
 ('Arindam Mishra','R.G.Mishra','B-16/30 Shivajipuram,Indira Nagar.\r\n',4294967295,'12arqwe347','indian','s/w engineer','Male','1991-01-05 00:00:00','arindam5191@gmail.com','1255','Lucknow','Uttar Pradesh','n','arin5191','','1','1'),
 ('Abhishek Singh','A.K.Singh','Dehradun',4294967295,'rtfe54rft','indian','Teacher','Male','1984-12-20 00:00:00','abhi@gmail.com','2233','Dehradun','Uttarakhand','n','abhi','abhi','0','0'),
 ('Akshay Singh','A.Singh','A-90/100 Sector-11 Banglore.',5667657,'erw3452e','indian','Computer Hardwares Bussiness','Male','1989-12-12 00:00:00','akshay89@rediff.com','3344','Banglore','Karnataka','y','aksh','aksh','1','1'),
 ('Ravi Singh','D.Singh','Ahemdabad',4294967295,'asd','indian','s/w engineer','Male','1999-12-12 00:00:00','ravi@gmail.com','3412','Mumbai','Maharashtra','n','ravi','ravi','0','0'),
 ('Romil Srivastava','Deep Kumar Saxena','A-77/100 Jaankipuram',4294967295,'qwe34r5t6y','indian','Student','Male','1999-12-12 00:00:00','abc@gmail.com','4477','lucknow','Uttar Pradesh','n','Romil','Romil','1','1'),
 ('Ramesh Patel','P.P.Patel','Meerut',4294967295,'daersw','indian','Computer Hardwares Bussiness','Male','1987-11-15 00:00:00','abcd@gmail.com','5566','meerut','Uttar Pradesh','n','ramesh','patel','0','0'),
 ('Shyam Shukla','S Shukla','Kanpur',4294967295,'qwer134ty','indian','Computer Bussiness','Male','1999-12-12 00:00:00','chan0@gmail.com','6015','kanpur','Uttar Pradesh','n','shyam','shyam','1','1'),
 ('Deepika Singh','Deep  Singh','Lucknow',1234587690,'u98yut765','indian','s/w engineer','Femal','1987-11-15 00:00:00','deepika@gmail.com','7788','lucknow','Uttar Pradesh','n','deep','deep','0','0'),
 ('Raashi Mehta','S. Mehta','Ahemdabad',4294967295,'frtr4543','indian','Student','Femal','1994-11-20 00:00:00','Raashi@gmail.com','9977','Ahemdabad','Gujarat','n','rashi','rashi','1','1');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `verifier`
--

DROP TABLE IF EXISTS `verifier`;
CREATE TABLE `verifier` (
  `Verifier_I.D.` varchar(20) NOT NULL default '',
  `Name` varchar(45) NOT NULL default '',
  `Phone` int(20) unsigned NOT NULL default '0',
  `Address` varchar(45) NOT NULL default '',
  `State` varchar(45) NOT NULL default '',
  `City` varchar(45) NOT NULL default '',
  `Gender` varchar(5) character set latin1 collate latin1_bin NOT NULL default '',
  PRIMARY KEY  (`Verifier_I.D.`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `verifier`
--

/*!40000 ALTER TABLE `verifier` DISABLE KEYS */;
INSERT INTO `verifier` (`Verifier_I.D.`,`Name`,`Phone`,`Address`,`State`,`City`,`Gender`) VALUES 
 ('','',0,'','','',0x4D616C65),
 ('09AI009','Arin',989898787,'Lucknow','Uttar Pradesh','lucknow',0x4D616C65),
 ('09it089','Sameer',1234567890,'Dehradun','Uttarakhand','Dehradun',0x4D616C65),
 ('r123','Rishab',1234567890,'eafef','Uttar Pradesh','lucknow',0x4D616C65);
/*!40000 ALTER TABLE `verifier` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
