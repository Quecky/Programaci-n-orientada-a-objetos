DROP TABLE IF EXISTS MEDICAMENTOS;
CREATE TABLE MEDICAMENTOS(
ID INT AUTO_INCREMENT PRIMARY KEY,
CODIGO INT NOT NULL,
NOMBRE VARCHAR(50) NOT NULL,
LABORATORIO VARCHAR(50) NOT NULL,
CANTIDAD INT NOT NULL,
PRECIO DOUBLE NOT NULL)