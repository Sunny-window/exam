-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        11.3.2-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- test 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `test`;

-- 테이블 test.enrollment 구조 내보내기
CREATE TABLE IF NOT EXISTS `enrollment` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) DEFAULT NULL,
  `sno` int(11) DEFAULT NULL,
  PRIMARY KEY (`eid`),
  KEY `FKdo6x7rxhoq5kb6onnb9y7dg3j` (`sid`),
  KEY `FKmbnejv9fdf3pu5imv2o73b4iu` (`sno`),
  CONSTRAINT `FKdo6x7rxhoq5kb6onnb9y7dg3j` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FKmbnejv9fdf3pu5imv2o73b4iu` FOREIGN KEY (`sno`) REFERENCES `subject` (`sno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 test.enrollment:~20 rows (대략적) 내보내기
DELETE FROM `enrollment`;
INSERT INTO `enrollment` (`eid`, `sid`, `sno`) VALUES
	(1, 1, 1),
	(2, 1, 2),
	(3, 2, 3),
	(4, 2, 4),
	(5, 3, 5),
	(6, 3, 6),
	(7, 4, 7),
	(8, 4, 8),
	(9, 5, 9),
	(10, 5, 10),
	(11, 6, 1),
	(12, 6, 3),
	(13, 7, 2),
	(14, 7, 4),
	(15, 8, 5),
	(16, 8, 7),
	(17, 9, 6),
	(18, 9, 8),
	(19, 10, 9),
	(20, 10, 10);

-- 테이블 test.student 구조 내보내기
CREATE TABLE IF NOT EXISTS `student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 test.student:~10 rows (대략적) 내보내기
DELETE FROM `student`;
INSERT INTO `student` (`sid`, `age`, `name`) VALUES
	(1, 24, '최민수'),
	(2, 25, '정지훈'),
	(3, 26, '한예슬'),
	(4, 27, '강동원'),
	(5, 28, '김혜수'),
	(6, 29, '이병헌'),
	(7, 30, '이은지'),
	(8, 27, '김동휘'),
	(9, 28, '이해창'),
	(10, 33, '오승헌');

-- 테이블 test.subject 구조 내보내기
CREATE TABLE IF NOT EXISTS `subject` (
  `sno` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 test.subject:~10 rows (대략적) 내보내기
DELETE FROM `subject`;
INSERT INTO `subject` (`sno`, `name`) VALUES
	(1, '물리'),
	(2, '화학'),
	(3, '수학'),
	(4, '언어'),
	(5, '역사'),
	(6, '지리'),
	(7, '문학'),
	(8, '생물'),
	(9, '음악'),
	(10, '미술');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
