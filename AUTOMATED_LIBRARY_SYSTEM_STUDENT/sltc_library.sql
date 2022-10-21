-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 21, 2022 at 01:24 PM
-- Server version: 8.0.27
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: 'sltc_library'
--

-- --------------------------------------------------------

--
-- Table structure for table 'books'
--

CREATE TABLE 'books' (
  'BOOK_ID' int NOT NULL,
  'BOOK_NAME' varchar(50) NOT NULL,
  'AUTHOR' varchar(50) NOT NULL,
  'CATEGORY' varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'books'
--

INSERT INTO 'books' ('BOOK_ID', 'BOOK_NAME', 'AUTHOR', 'CATEGORY') VALUES
(7654, 'jaajka', 'hshjahsa', 'ajsaa'),
(13456, 'jdsjksk', 'akjdkj', 'akdakdjk'),
(6182765, 'The Hunger Games', 'Suzanne Collins', 'novel'),
(5910532, 'Twilight', 'Stephenie Meyer', 'novel'),
(9785329, 'The Great Gatsby', 'F. Scott Fitzgerald', 'novel'),
(9689862, 'The Hobbit or There and Back Again', 'J.R.R. Tolkien', 'novel'),
(994469, 'The Catcher in the Rye', 'J.D. Salinger', 'novel'),
(6158372, 'Angels & Demons ', 'Dan Brown', 'novel'),
(5158630, 'Pride and Prejudice', 'Jane Austen', 'novel'),
(3393107, 'The Kite Runner ', 'Khaled Hosseini', 'novel'),
(958869, 'Divergent', 'Veronica Roth', 'novel'),
(9861076, 'Animal Farm: A Fairy Story', 'George Orwell', 'novel'),
(6120610, 'Catching Fire', 'Suzanne Collins', 'novel'),
(6803235, ' The Fellowship of the Ring', 'J.R.R. Tolkien', 'novel'),
(9905789, 'Mockingjay', 'Suzanne Collins', 'novel'),
(3700604, 'The Lovely Bones', 'Alice Sebold', 'novel'),
(5024718, 'The Da Vinci Code', 'Dan Brown', 'novel'),
(3071774, 'Lord of the Flies ', 'William Golding', 'novel'),
(8036007, 'Gone Girl', 'Gillian Flynn', 'novel'),
(7963160, 'The Help', 'Kathryn Stockett', 'novel'),
(3689561, 'Of Mice and Men ', 'John Steinbeck', 'novel'),
(3723072, 'Memoirs of a Geisha', 'Arthur Golden', 'novel'),
(5804789, 'Fifty Shades of Grey', 'E.L. James', 'novel'),
(6643031, 'The Giver', 'Lois Lowry', 'novel'),
(4010348, 'The Hunger Games', 'Suzanne Collins', 'novel'),
(3933991, 'Twilight', 'Stephenie Meyer', 'novel'),
(3857635, 'The Great Gatsby', 'F. Scott Fitzgerald', 'novel'),
(3781278, 'The Hobbit or There and Back Again', 'J.R.R. Tolkien', 'novel'),
(3704922, 'The Catcher in the Rye', 'J.D. Salinger', 'novel'),
(3628566, 'Angels & Demons ', 'Dan Brown', 'novel'),
(3552209, 'Pride and Prejudice', 'Jane Austen', 'novel'),
(3475853, 'The Kite Runner ', 'Khaled Hosseini', 'novel'),
(3399496, 'Divergent', 'Veronica Roth', 'novel'),
(3246784, 'Animal Farm: A Fairy Story', 'George Orwell', 'novel'),
(3094071, 'Catching Fire', 'Suzanne Collins', 'novel'),
(2941358, ' The Fellowship of the Ring', 'J.R.R. Tolkien', 'novel'),
(2865001, 'Mockingjay', 'Suzanne Collins', 'novel'),
(2712289, 'The Lovely Bones', 'Alice Sebold', 'novel'),
(2406863, 'The Da Vinci Code', 'Dan Brown', 'novel'),
(2254150, 'Lord of the Flies ', 'William Golding', 'novel'),
(2177794, 'Gone Girl', 'Gillian Flynn', 'novel'),
(2101437, 'The Help', 'Kathryn Stockett', 'novel'),
(2025081, 'Of Mice and Men ', 'John Steinbeck', 'novel'),
(1948724, 'Memoirs of a Geisha', 'Arthur Golden', 'novel'),
(1872368, 'Fifty Shades of Grey', 'E.L. James', 'novel'),
(1719655, 'The Giver', 'Lois Lowry', 'novel'),
(1566942, 'The Hunger Games', 'Suzanne Collins', 'novel'),
(1490586, 'Twilight', 'Stephenie Meyer', 'novel'),
(1414230, 'The Great Gatsby', 'F. Scott Fitzgerald', 'novel'),
(1337873, 'The Hobbit or There and Back Again', 'J.R.R. Tolkien', 'novel'),
(1261517, 'The Catcher in the Rye', 'J.D. Salinger', 'novel'),
(1185160, 'Angels & Demons ', 'Dan Brown', 'novel'),
(1108804, 'Pride and Prejudice', 'Jane Austen', 'novel'),
(1032447, 'The Kite Runner ', 'Khaled Hosseini', 'novel'),
(956091, 'Divergent', 'Veronica Roth', 'novel'),
(803378, 'Animal Farm: A Fairy Story', 'George Orwell', 'novel'),
(650665, 'Catching Fire', 'Suzanne Collins', 'novel'),
(497953, ' The Fellowship of the Ring', 'J.R.R. Tolkien', 'novel'),
(421596, 'Mockingjay', 'Suzanne Collins', 'novel'),
(268883, 'The Lovely Bones', 'Alice Sebold', 'novel'),
(98933, 'Madolduwa', 'Martin Wickramasinghe', 'Novel'),
(23443, 'Thunmahandiya', 'Mahagama Sekara', 'Novel');

-- --------------------------------------------------------

--
-- Table structure for table 'customers'
--

CREATE TABLE 'customers' (
  'CUSTOMER_ID' int NOT NULL,
  'CUSTOMER_NAME' varchar(50) NOT NULL,
  'EMAIL_ADDRESS' varchar(50) DEFAULT NULL,
  'CONTACT_NUMBER' varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table 'lend_books'
--

CREATE TABLE 'lend_books' (
  'Lend_ID' int NOT NULL,
  'LEND_DATE' varchar(10) NOT NULL,
  'RETURN_DATE' varchar(10) NOT NULL,
  'MEMBERSHIP_ID' int DEFAULT NULL,
  'BOOK_ID' int DEFAULT NULL,
  'BOOK_NAME' varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'lend_books'
--

INSERT INTO 'lend_books' ('Lend_ID', 'LEND_DATE', 'RETURN_DATE', 'MEMBERSHIP_ID', 'BOOK_ID', 'BOOK_NAME') VALUES
(6731, '2022-01-11', '2022-01-25', 983337, 1032447, 'The Kite Runner '),
(23413, '2022-01-11', '2022-01-25', 2345, 3933991, 'Twilight');

-- --------------------------------------------------------

--
-- Table structure for table 'members'
--

CREATE TABLE 'members' (
  'MEMBERSHIP_ID' int NOT NULL,
  'MEMBER_NAME' varchar(50) NOT NULL,
  'SLTC_INDEX' varchar(10) NOT NULL,
  'NIC_NUMBER' varchar(12) DEFAULT NULL,
  'EMAIL_ADDRESS' varchar(50) DEFAULT NULL,
  'CONTACT_NUMBER' varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'members'
--

INSERT INTO 'members' ('MEMBERSHIP_ID', 'MEMBER_NAME', 'SLTC_INDEX', 'NIC_NUMBER', 'EMAIL_ADDRESS', 'CONTACT_NUMBER') VALUES
(2345, 'Hansika Gamage', 'AA1714', '993456789V', 'hansigamage199@gmail.com ', '0762345678'),
(12345, 'Laksisi Gunartne', 'AA1860', '997172647V', 'chetangunaratnelaksisi@gmail.com', '0764729594'),
(3456, 'Ishadi Sandeepani', 'AA1905', '992345678V', 'ieshasandeepani14001@gmail.com ', '0771345678'),
(4567, 'Somesha Hewage', 'AA1842', '200076345V', 'hansigamage709@gmail.com ', '0752885048'),
(199984, 'Anil Gunartne', 'AA1111', '12345678', 'chethagunaratne@gmail.com', '0769792830'),
(983337, 'Hesarani Perera', 'AA2222', '991834567V', 'hewagehesh@gmail.com', '0765672516');

-- --------------------------------------------------------

--
-- Table structure for table 'payments'
--

CREATE TABLE 'payments' (
  'PAYMENTS_ID' int NOT NULL,
  'FINE' int NOT NULL,
  'PAYMENT_BY' int NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'payments'
--

INSERT INTO 'payments' ('PAYMENTS_ID', 'FINE', 'PAYMENT_BY') VALUES
(33522, 550, 12345),
(80950, 250, 199984),
(9043, 100, 983337),
(59589, 100, 983337);

-- --------------------------------------------------------

--
-- Table structure for table 'return_table'
--

CREATE TABLE 'return_table' (
  'RETURN_ID' varchar(15) NOT NULL,
  'RETURN_DATE' varchar(10) NOT NULL,
  'MEMBERSHIP_ID' varchar(10) NOT NULL,
  'BOOK_NAME' varchar(50) NOT NULL,
  'FINE' int NOT NULL,
  'STATUS' int NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table 'return_table'
--

INSERT INTO 'return_table' ('RETURN_ID', 'RETURN_DATE', 'MEMBERSHIP_ID', 'BOOK_NAME', 'FINE', 'STATUS') VALUES
('46137', '2022-01-10', '199984', 'Mockingjay', 250, 1),
('57145', '2022-01-10', '12345', 'Lord of the Flies ', 550, 1),
('47768', '2022-01-11', '983337', 'Thunmahandiya', 100, 1),
('55695', '2022-01-11', '983337', 'The Lovely Bones', 100, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table 'books'
--
ALTER TABLE 'books'
  ADD PRIMARY KEY ('BOOK_ID');

--
-- Indexes for table 'customers'
--
ALTER TABLE 'customers'
  ADD PRIMARY KEY ('CUSTOMER_ID'),
  ADD UNIQUE KEY 'EMAIL_ADDDRESS' ('EMAIL_ADDRESS'),
  ADD UNIQUE KEY 'CONTACT_NUMBER' ('CONTACT_NUMBER');

--
-- Indexes for table 'lend_books'
--
ALTER TABLE 'lend_books'
  ADD PRIMARY KEY ('Lend_ID'),
  ADD KEY 'BOOK_ID' ('BOOK_ID'),
  ADD KEY 'MEMBERSHIP_ID' ('MEMBERSHIP_ID');

--
-- Indexes for table 'members'
--
ALTER TABLE 'members'
  ADD PRIMARY KEY ('MEMBERSHIP_ID'),
  ADD UNIQUE KEY 'NIC_NUMBER' ('NIC_NUMBER'),
  ADD UNIQUE KEY 'EMAIL_ADDDRESS' ('EMAIL_ADDRESS'),
  ADD UNIQUE KEY 'CONTACT_NUMBER' ('CONTACT_NUMBER');

--
-- Indexes for table 'payments'
--
ALTER TABLE 'payments'
  ADD PRIMARY KEY ('PAYMENTS_ID'),
  ADD KEY 'PAYMENT_BY' ('PAYMENT_BY');

--
-- Indexes for table 'return_table'
--
ALTER TABLE 'return_table'
  ADD PRIMARY KEY ('RETURN_ID'),
  ADD KEY 'LEND_ID' ('MEMBERSHIP_ID');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
