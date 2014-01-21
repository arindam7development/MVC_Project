-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema project
--

CREATE DATABASE IF NOT EXISTS project;
USE project;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `AdminName` varchar(30) NOT NULL default '',
  `UserName` varchar(30) NOT NULL default '',
  `Password` varchar(30) NOT NULL default '',
  PRIMARY KEY  (`AdminName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`AdminName`,`UserName`,`Password`) VALUES 
 ('chandan','admin','admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `Stu_name` varchar(30) NOT NULL,
  `College_id` varchar(30) NOT NULL,
  `Branch` varchar(10) NOT NULL,
  `Year` varchar(10) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Day` varchar(45) NOT NULL,
  `Totalp` int(20) unsigned NOT NULL default '0',
  `Totall` int(20) unsigned NOT NULL default '0',
  `percent` int(20) unsigned NOT NULL default '0',
  KEY `FK_itfirstyear_1` (`College_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` (`Stu_name`,`College_id`,`Branch`,`Year`,`Date`,`Day`,`Totalp`,`Totall`,`percent`) VALUES 
 ('chandan','09it23','IT','4','0','',8,10,80),
 ('radhika','09it24','IT','4','0','',6,10,100),
 ('ram','09it25','IT','4','0','',8,10,80),
 ('hem','09it26','IT','4','date','day',6,10,80),
 ('ritika','09it27','IT','4','date','day',7,10,100),
 ('amit singh','09it28','IT','4','date','day',6,10,75),
 ('prabhu deva','09it29','IT','4','date','day',7,10,80);
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;


--
-- Definition of table `bookissued`
--

DROP TABLE IF EXISTS `bookissued`;
CREATE TABLE `bookissued` (
  `College_id` varchar(20) NOT NULL,
  `BookId` varchar(20) NOT NULL,
  `IssueDate` varchar(20) NOT NULL,
  `ReturnDate` varchar(20) NOT NULL,
  `fine` int(20) unsigned NOT NULL default '0',
  PRIMARY KEY  (`BookId`),
  KEY `FK_bookissued_1` (`College_id`),
  CONSTRAINT `FK_bookissued_1` FOREIGN KEY (`College_id`) REFERENCES `studentrecord` (`College_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_bookissued_2` FOREIGN KEY (`BookId`) REFERENCES `library` (`BookId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookissued`
--

/*!40000 ALTER TABLE `bookissued` DISABLE KEYS */;
INSERT INTO `bookissued` (`College_id`,`BookId`,`IssueDate`,`ReturnDate`,`fine`) VALUES 
 ('09it23','BB102','20/03/2013','4/4/2013',0),
 ('09it23','BB103','20/01/2013','4/2/2013',170),
 ('09it27','BB105','08/03/2013','23/3/2013',0);
/*!40000 ALTER TABLE `bookissued` ENABLE KEYS */;


--
-- Definition of table `complain`
--

DROP TABLE IF EXISTS `complain`;
CREATE TABLE `complain` (
  `ComplainId` int(20) unsigned NOT NULL default '0',
  `Comp` varchar(200) NOT NULL default '',
  PRIMARY KEY  (`ComplainId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `complain`
--

/*!40000 ALTER TABLE `complain` DISABLE KEYS */;
INSERT INTO `complain` (`ComplainId`,`Comp`) VALUES 
 (5001,'sir i want to about todays lectures.'),
 (5003,'sir ji mera hall ticket ghoom gaya hai.\r\nkuch to kariya na please.Nahi to pandeji naaraj ho jaayenge\r\nArindam Mishra\r\nIT-A');
/*!40000 ALTER TABLE `complain` ENABLE KEYS */;


--
-- Definition of table `faculty_lecture`
--

DROP TABLE IF EXISTS `faculty_lecture`;
CREATE TABLE `faculty_lecture` (
  `Faculty_ID` varchar(20) NOT NULL,
  `year` varchar(10) NOT NULL,
  `sub_id` varchar(20) NOT NULL,
  `branch` varchar(10) NOT NULL,
  KEY `FK_faculty_lecture_1` (`Faculty_ID`),
  KEY `FK_faculty_lecture_2` (`sub_id`),
  CONSTRAINT `FK_faculty_lecture_1` FOREIGN KEY (`Faculty_ID`) REFERENCES `facultyrecord` (`Faculty_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_faculty_lecture_2` FOREIGN KEY (`sub_id`) REFERENCES `sub_detail` (`sub_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty_lecture`
--

/*!40000 ALTER TABLE `faculty_lecture` DISABLE KEYS */;
INSERT INTO `faculty_lecture` (`Faculty_ID`,`year`,`sub_id`,`branch`) VALUES 
 ('pawan101','4','TIT101','IT');
/*!40000 ALTER TABLE `faculty_lecture` ENABLE KEYS */;


--
-- Definition of table `faculty_salary`
--

DROP TABLE IF EXISTS `faculty_salary`;
CREATE TABLE `faculty_salary` (
  `Faculty_ID` varchar(30) NOT NULL,
  `salary` bigint(30) unsigned NOT NULL default '0',
  `status` varchar(20) NOT NULL,
  PRIMARY KEY  (`Faculty_ID`),
  CONSTRAINT `FK_faculty_salary_1` FOREIGN KEY (`Faculty_ID`) REFERENCES `facultyrecord` (`Faculty_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty_salary`
--

/*!40000 ALTER TABLE `faculty_salary` DISABLE KEYS */;
/*!40000 ALTER TABLE `faculty_salary` ENABLE KEYS */;


--
-- Definition of table `facultyrecord`
--

DROP TABLE IF EXISTS `facultyrecord`;
CREATE TABLE `facultyrecord` (
  `Faculty_Name` varchar(20) NOT NULL default '',
  `FUser_Name` varchar(20) NOT NULL default '',
  `FPassword` varchar(20) NOT NULL default '',
  `FEmail_Id` varchar(25) NOT NULL default '',
  `FFather_Name` varchar(20) default NULL,
  `Designation` varchar(20) NOT NULL default '',
  `FBranch` varchar(20) NOT NULL,
  `FPhone_No` bigint(15) unsigned NOT NULL default '0',
  `FAddress` varchar(60) NOT NULL default '',
  `FSex` varchar(8) NOT NULL default '',
  `FD_O_B` varchar(10) NOT NULL default '',
  `FBloodGroup` varchar(5) NOT NULL default '',
  `Faculty_ID` varchar(20) NOT NULL default '',
  PRIMARY KEY  (`Faculty_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `facultyrecord`
--

/*!40000 ALTER TABLE `facultyrecord` DISABLE KEYS */;
INSERT INTO `facultyrecord` (`Faculty_Name`,`FUser_Name`,`FPassword`,`FEmail_Id`,`FFather_Name`,`Designation`,`FBranch`,`FPhone_No`,`FAddress`,`FSex`,`FD_O_B`,`FBloodGroup`,`Faculty_ID`) VALUES 
 ('Chandan','chan','chan','chandans23@gmail.com','Sohan','librarian','IT',9897658678,'haldwani','male','1988/07/28','B+','chan123'),
 ('Pawan Sharma ','pawan','sharma','radha123@gmail.com','mohan Sharma','faculty','IT',8006885236,'banaras','male','1980/04/12','A+','pawan101'),
 ('Ravi kishan','ravi','kumar','ravi1991@gmail.com','Ram Kishan','faculty','CSE',9897658798,'haldwani','male','1983/07/28','B+','ravi103'),
 ('Ravi Prakash','ravi','prakash','ravipop@gmail.com','Ramesh prakash','faculty','IT',9887899988,'Punjab','male','1980/07/23','O+','ravi123'),
 ('Sonu Nigam','sonu','nigam','sonu@gmail.com','Ramu','accountant','account',9878789898,'delhi','male','1980/04/20','A+','sonu123');
/*!40000 ALTER TABLE `facultyrecord` ENABLE KEYS */;


--
-- Definition of table `library`
--

DROP TABLE IF EXISTS `library`;
CREATE TABLE `library` (
  `BookId` varchar(45) NOT NULL default '',
  `BookName` varchar(45) NOT NULL default '',
  `Issued` varchar(10) NOT NULL default '',
  `Branch` varchar(30) NOT NULL default '',
  PRIMARY KEY  (`BookId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `library`
--

/*!40000 ALTER TABLE `library` DISABLE KEYS */;
INSERT INTO `library` (`BookId`,`BookName`,`Issued`,`Branch`) VALUES 
 ('BB102','Computer Organization','Yes','IT'),
 ('BB103','Data mining','Yes','IT'),
 ('BB104','Web technology','NO','IT'),
 ('BB105','Black Book java','Yes','IT'),
 ('BB106','material Science','NO','MECH');
/*!40000 ALTER TABLE `library` ENABLE KEYS */;


--
-- Definition of table `marks_table`
--

DROP TABLE IF EXISTS `marks_table`;
CREATE TABLE `marks_table` (
  `College_id` varchar(20) NOT NULL,
  `sub_id` varchar(20) NOT NULL,
  `Year` int(20) unsigned NOT NULL,
  `sessional_1` int(10) unsigned NOT NULL,
  `sessional_2` int(10) unsigned NOT NULL,
  `test_1` int(10) unsigned NOT NULL,
  `test_2` int(10) unsigned NOT NULL,
  `test_3` int(10) unsigned NOT NULL,
  `sessional` int(10) unsigned NOT NULL,
  `test` int(10) unsigned NOT NULL,
  `total` int(10) unsigned NOT NULL,
  `branch` varchar(20) NOT NULL,
  `stuname` varchar(20) NOT NULL,
  KEY `FK_marks_table_1` (`College_id`),
  KEY `FK_marks_table_2` (`sub_id`),
  CONSTRAINT `FK_marks_table_1` FOREIGN KEY (`College_id`) REFERENCES `studentrecord` (`College_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_marks_table_2` FOREIGN KEY (`sub_id`) REFERENCES `sub_detail` (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks_table`
--

/*!40000 ALTER TABLE `marks_table` DISABLE KEYS */;
INSERT INTO `marks_table` (`College_id`,`sub_id`,`Year`,`sessional_1`,`sessional_2`,`test_1`,`test_2`,`test_3`,`sessional`,`test`,`total`,`branch`,`stuname`) VALUES 
 ('09it23','TIT101',4,50,50,8,8,18,25,17,42,'IT','Chandan Singh'),
 ('09it24','TIT101',4,58,58,8,8,8,29,12,41,'IT','Radhika Sharma'),
 ('09it25','TIT101',4,54,54,6,7,8,27,10,37,'IT','Ram Sharma'),
 ('09it26','TIT101',4,56,58,8,9,20,28,18,46,'IT','Himanshu Aggarwal'),
 ('09it27','TIT101',4,50,60,8,8,18,27,17,44,'IT','Ritika Pandey'),
 ('09it23','TIT102',4,0,0,0,0,0,0,0,0,'IT','Chandan Singh'),
 ('09it24','TIT102',4,0,0,0,0,0,0,0,0,'IT','Radhika Sharma'),
 ('09it25','TIT102',4,0,0,0,0,0,0,0,0,'IT','Ram Sharma'),
 ('09it26','TIT102',4,0,0,0,0,0,0,0,0,'IT','Himanshu Aggarwal'),
 ('09it27','TIT102',4,0,0,0,0,0,0,0,0,'IT','Ritika Pandey'),
 ('09it23','TIT103',4,0,0,0,0,0,0,0,0,'IT','Chandan Singh'),
 ('09it24','TIT103',4,0,0,0,0,0,0,0,0,'IT','Radhika Sharma'),
 ('09it25','TIT103',4,0,0,0,0,0,0,0,0,'IT','Ram Sharma'),
 ('09it26','TIT103',4,0,0,0,0,0,0,0,0,'IT','Himanshu Aggarwal'),
 ('09it27','TIT103',4,0,0,0,0,0,0,0,0,'IT','Ritika Pandey'),
 ('09it23','TIT104',4,0,0,0,0,0,0,0,0,'IT','Chandan Singh'),
 ('09it24','TIT104',4,0,0,0,0,0,0,0,0,'IT','Radhika Sharma'),
 ('09it25','TIT104',4,0,0,0,0,0,0,0,0,'IT','Ram Sharma'),
 ('09it26','TIT104',4,0,0,0,0,0,0,0,0,'IT','Himanshu Aggarwal'),
 ('09it27','TIT104',4,0,0,0,0,0,0,0,0,'IT','Ritika Pandey');
/*!40000 ALTER TABLE `marks_table` ENABLE KEYS */;


--
-- Definition of table `stud_fee`
--

DROP TABLE IF EXISTS `stud_fee`;
CREATE TABLE `stud_fee` (
  `College_id` varchar(30) NOT NULL,
  `tution` bigint(30) unsigned NOT NULL,
  `hostel` bigint(30) unsigned NOT NULL,
  `wifi` bigint(30) unsigned NOT NULL,
  `dress` bigint(30) unsigned NOT NULL,
  `total` bigint(50) unsigned NOT NULL,
  PRIMARY KEY  (`College_id`),
  CONSTRAINT `FK_stud_fee_1` FOREIGN KEY (`College_id`) REFERENCES `studentrecord` (`College_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stud_fee`
--

/*!40000 ALTER TABLE `stud_fee` DISABLE KEYS */;
INSERT INTO `stud_fee` (`College_id`,`tution`,`hostel`,`wifi`,`dress`,`total`) VALUES 
 ('09it23',70000,50000,5000,0,125000);
/*!40000 ALTER TABLE `stud_fee` ENABLE KEYS */;


--
-- Definition of table `stud_finance`
--

DROP TABLE IF EXISTS `stud_finance`;
CREATE TABLE `stud_finance` (
  `College_id` varchar(20) NOT NULL,
  `col_fine` bigint(30) unsigned NOT NULL,
  `type` varchar(40) NOT NULL,
  KEY `FK_stud_finance_1` (`College_id`),
  CONSTRAINT `FK_stud_finance_1` FOREIGN KEY (`College_id`) REFERENCES `studentrecord` (`College_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stud_finance`
--

/*!40000 ALTER TABLE `stud_finance` DISABLE KEYS */;
/*!40000 ALTER TABLE `stud_finance` ENABLE KEYS */;


--
-- Definition of table `studentrecord`
--

DROP TABLE IF EXISTS `studentrecord`;
CREATE TABLE `studentrecord` (
  `Stu_Name` varchar(30) NOT NULL,
  `User_Name` varchar(10) NOT NULL default '',
  `Password` varchar(15) NOT NULL default '',
  `Email_id` varchar(30) NOT NULL,
  `Fathers_Name` varchar(30) NOT NULL,
  `College_id` varchar(10) NOT NULL default '',
  `Branch` varchar(10) NOT NULL default '',
  `Contact_No` bigint(20) unsigned NOT NULL default '0',
  `Address` varchar(60) NOT NULL default '',
  `Sex` varchar(10) NOT NULL default '',
  `Blood_Group` varchar(5) NOT NULL default '',
  `D_O_B` varchar(15) NOT NULL default '',
  `year` varchar(10) NOT NULL,
  PRIMARY KEY  (`College_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentrecord`
--

/*!40000 ALTER TABLE `studentrecord` DISABLE KEYS */;
INSERT INTO `studentrecord` (`Stu_Name`,`User_Name`,`Password`,`Email_id`,`Fathers_Name`,`College_id`,`Branch`,`Contact_No`,`Address`,`Sex`,`Blood_Group`,`D_O_B`,`year`) VALUES 
 ('Chandan Singh','chan','chan','chandansingh0@gmail.com','Sohan Singh','09it23','IT',8006885236,'delhi','male','A+','1991/04/20','4'),
 ('Radhika Sharma','radhika','sharma','radhika123@gmail.com','Pawan Sharma','09it24','IT',9654755752,'haldwani','female','B+','1991/08/25','4'),
 ('Ram Sharma','ram','sharma','rammohan@gmail.com','Shyam Sharma','09it25','IT',9878768789,'Chandigarh','male','B+','1990/08/23','4'),
 ('Himanshu Aggarwal','hem','hem','hem1991@gmail.com','Ram Aggarwal','09it26','IT',9876887778,'Lucknow','male','AB+','1991/04/26','4'),
 ('Ritika Pandey','ritika','pandey','ritika@gmail.com','P.P.Pandey','09it27','IT',8987676879,'Nainital','female','A+','1991/04/20','4'),
 ('amit singh','amit','singh','amy123@gmail.com','Sohan Singh','09it28','IT',9876789876,'delhi','male','B+','1993/04/12','4'),
 ('prabhu deva','prabhu','deva','prabhu@gmail.com','Ramesh deva','09it29','IT',9878787678,'delhi','male','A+','1991/04/16','4');
/*!40000 ALTER TABLE `studentrecord` ENABLE KEYS */;


--
-- Definition of table `sub_detail`
--

DROP TABLE IF EXISTS `sub_detail`;
CREATE TABLE `sub_detail` (
  `sub_id` varchar(25) NOT NULL default '',
  `sub_name` varchar(45) NOT NULL default '',
  `year` int(10) unsigned NOT NULL,
  `branch` varchar(20) NOT NULL,
  PRIMARY KEY  (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sub_detail`
--

/*!40000 ALTER TABLE `sub_detail` DISABLE KEYS */;
INSERT INTO `sub_detail` (`sub_id`,`sub_name`,`year`,`branch`) VALUES 
 ('','',0,''),
 ('TCS101','Advance Network',4,'CSE'),
 ('TCS102','Automata',4,'CSE'),
 ('TCS103','Compiler Design',4,'CSE'),
 ('TIT101','Software Archtecture',4,'IT'),
 ('TIT102','Cryptography',4,'IT'),
 ('TIT103','ITIM',4,'IT'),
 ('TIT104','Distributed',4,'IT');
/*!40000 ALTER TABLE `sub_detail` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
