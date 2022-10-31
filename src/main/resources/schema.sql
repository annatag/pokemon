DROP TABLE IF EXISTS pokemon;
CREATE TABLE IF NOT EXISTS pokemon (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `name_english` VARCHAR(50) ,
    `name_japanese` VARCHAR(50) ,
    `name_chinese` VARCHAR(50) ,
    `name_french` VARCHAR(50) ,
    `type` VARCHAR(255) ,
    `base_HP` INT,
    `base_Attack` INT,
    `base_Defence` INT,
    `base_Sp_Attack` INT,
    `base_Sp_Defence` INT,
    `base_Speed` INT
);