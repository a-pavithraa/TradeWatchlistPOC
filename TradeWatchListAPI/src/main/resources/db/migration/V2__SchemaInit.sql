CREATE TABLE `trending_tickers` ( 
  `Short_Name` varchar(200) ,
  `Previous_Close` decimal  ,
  `Change_Percent` decimal  ,
  `Custom_Price_Alert_Confidence`decimal  ,
  `Full_Exchange_Name` varchar(100)  ,
  `Symbol` varchar(100) NOT NULL,
  `ID` bigint NOT NULL,
  PRIMARY KEY (`ID`)
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





