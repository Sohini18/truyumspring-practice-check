CREATE TABLE IF NOT EXISTS `truyum`.`menuitem` (
  `me_id` INT NOT NULL AUTO_INCREMENT,
  `me_name` VARCHAR(100) NULL,
  `me_price` DECIMAL(8,2) NULL,
  `me_active` BOOLEAN NULL,
  `me_date_of_launch` DATE NULL,
  `me_category` VARCHAR(45) NULL,
  `me_free_delivery` BOOLEAN NULL,
  PRIMARY KEY (`me_id`))
ENGINE = InnoDB;