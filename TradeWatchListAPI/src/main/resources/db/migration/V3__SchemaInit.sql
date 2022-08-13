CREATE TABLE `trending_sequence` (
  `next_val` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`next_val`)
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `market_summary` ( 
  `Short_Name` varchar(200) ,
  `Previous_Close` varchar(100),  
  `Price_Hint`decimal  ,
  `Full_Exchange_Name` varchar(100)  ,
  `Symbol` varchar(100) NOT NULL,
  `ID` bigint NOT NULL,
  PRIMARY KEY (`ID`)
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `market_summary_sequence` (
  `next_val` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`next_val`)
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

