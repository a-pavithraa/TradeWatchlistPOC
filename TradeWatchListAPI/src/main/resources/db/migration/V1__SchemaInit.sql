
CREATE TABLE `Exchange` (
  `ID` bigint NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `CODE` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Exchange` VALUES (1,'New York Stock Exchange Inc','XNYS'),(2,'Nyse Arca','ARCX'),(3,'Cboe Bzx U S Equities Exchange','BATS'),(4,'Nasdaq All Markets','XNAS'),(5,'Nyse Mkt Llc','XASE'),(6,'Portal','XPOR');



CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `sym_daily_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `sym_daily_sequence` VALUES (2400);



CREATE TABLE `symbol` (
  `Name` varchar(200) NOT NULL,
  `Symbol` varchar(50) NOT NULL,
  `Exchange` varchar(200) NOT NULL,
  `Exchange_Name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Region` varchar(200) NOT NULL,
  `Currency` varchar(50) NOT NULL,
  `ID` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12575 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





CREATE TABLE `symbol_daily_performance` (
  `Day` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Open` varchar(100) DEFAULT NULL,
  `High` varchar(100) DEFAULT NULL,
  `Low` varchar(100) DEFAULT NULL,
  `Close` varchar(100) DEFAULT NULL,
  `Volume` varchar(100) DEFAULT NULL,
  `Symbol` varchar(100) NOT NULL,
  `ID` bigint NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




CREATE TABLE `symbol_sequence` (
  `next_val` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`next_val`)
) ENGINE=InnoDB AUTO_INCREMENT=12651 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `symbol_sequence` VALUES (12650);

CREATE TABLE `user_role` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `user_role` VALUES (1,1),(1,2),(2,2);


CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



INSERT INTO `users` VALUES (1,'admin@gmail.com','$2a$10$nfoaxLgvzuxkNciPgGwUD.iUEHY6981TaQRcQm92HNNmRt0YzX07W','Admin','2022-07-29 08:26:14',NULL),(2,'test@gmail.com','$2a$10$nfoaxLgvzuxkNciPgGwUD.iUEHY6981TaQRcQm92HNNmRt0YzX07W','Test','2022-07-29 08:26:14',NULL);

