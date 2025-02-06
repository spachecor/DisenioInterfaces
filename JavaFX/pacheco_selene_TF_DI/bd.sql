-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS RestauranteDB;
USE RestauranteDB;

-- Tabla de Clientes
CREATE TABLE Clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    telefono VARCHAR(15),
    direccion VARCHAR(255)
);

-- Tabla de Productos
CREATE TABLE Productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    precio DECIMAL(10, 2) NOT NULL,
    disponibilidad BOOLEAN DEFAULT TRUE
);

-- Tabla de Pedidos
CREATE TABLE Pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    fecha_pedido DATETIME DEFAULT CURRENT_TIMESTAMP,
    estado ENUM('pendiente', 'en preparación', 'entregado') DEFAULT 'pendiente',
    total DECIMAL(10, 2) DEFAULT 0.00,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

-- Tabla de Detalles de Pedido
CREATE TABLE Detalles_Pedido (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT,
    id_producto INT,
    cantidad INT NOT NULL,
    subtotal DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES Pedidos(id_pedido) ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)
);

-- Índices para optimizar consultas
CREATE INDEX idx_cliente_nombre ON Clientes(nombre);
CREATE INDEX idx_producto_nombre ON Productos(nombre);
CREATE INDEX idx_pedido_estado ON Pedidos(estado);

-- Insertar registros en la tabla Clientes
INSERT INTO Clientes (nombre, telefono, direccion) VALUES
('Juan Pérez', '123456789', 'Calle Falsa 123'),
('Ana Gómez', '987654321', 'Av. Siempre Viva 742'),
('Carlos Ruiz', '555123456', 'Plaza Mayor 5'),
('Lucía Martínez', '321654987', 'Calle Sol 99'),
('Marta López', '456789123', 'Paseo del Prado 10'),
('Javier Sánchez', '789321654', 'Calle Luna 45'),
('Patricia Díaz', '654987321', 'Av. Libertad 21'),
('Roberto Torres', '147258369', 'Calle Estrella 33'),
('Elena Morales', '963852741', 'Boulevard Central 77'),
('Miguel Ángel', '852963741', 'Calle Norte 12');

-- Insertar registros en la tabla Productos
INSERT INTO Productos (nombre, categoria, precio, disponibilidad) VALUES
('Hamburguesa', 'Comida rápida', 5.99, TRUE),
('Pizza', 'Comida rápida', 8.50, TRUE),
('Ensalada César', 'Ensaladas', 4.75, TRUE),
('Sopa de Pollo', 'Sopas', 3.50, TRUE),
('Taco', 'Comida mexicana', 2.99, TRUE),
('Pasta Alfredo', 'Pasta', 7.20, TRUE),
('Burrito', 'Comida mexicana', 6.00, TRUE),
('Sándwich de Atún', 'Sándwiches', 4.00, TRUE),
('Pollo a la Parrilla', 'Carnes', 9.99, TRUE),
('Helado', 'Postres', 2.50, TRUE);

-- Insertar registros en la tabla Pedidos
INSERT INTO Pedidos (id_cliente, estado, total) VALUES
(1, 'pendiente', 15.99),
(2, 'en preparación', 23.50),
(3, 'entregado', 8.75),
(4, 'pendiente', 12.00),
(5, 'entregado', 9.50),
(6, 'en preparación', 14.20),
(7, 'pendiente', 11.00),
(8, 'entregado', 17.99),
(9, 'pendiente', 19.50),
(10, 'en preparación', 13.75);

-- Insertar registros en la tabla Detalles_Pedido
INSERT INTO Detalles_Pedido (id_pedido, id_producto, cantidad, subtotal) VALUES
(1, 1, 2, 11.98),
(1, 10, 1, 2.50),
(2, 2, 1, 8.50),
(2, 5, 3, 8.97),
(3, 3, 1, 4.75),
(4, 4, 2, 7.00),
(5, 6, 1, 7.20),
(6, 7, 2, 12.00),
(7, 8, 1, 4.00),
(8, 9, 2, 19.98);

-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS RestauranteDB;
USE RestauranteDB;

-- Tabla de Clientes
CREATE TABLE Clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    telefono VARCHAR(15),
    direccion VARCHAR(255)
);

-- Tabla de Productos
CREATE TABLE Productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    precio DECIMAL(10, 2) NOT NULL,
    disponibilidad BOOLEAN DEFAULT TRUE
);

-- Tabla de Pedidos
CREATE TABLE Pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    fecha_pedido DATETIME DEFAULT CURRENT_TIMESTAMP,
    estado ENUM('pendiente', 'en preparación', 'entregado') DEFAULT 'pendiente',
    total DECIMAL(10, 2) DEFAULT 0.00,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

-- Tabla de Detalles de Pedido
CREATE TABLE Detalles_Pedido (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT,
    id_producto INT,
    cantidad INT NOT NULL,
    subtotal DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES Pedidos(id_pedido) ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)
);

-- Índices para optimizar consultas
CREATE INDEX idx_cliente_nombre ON Clientes(nombre);
CREATE INDEX idx_producto_nombre ON Productos(nombre);
CREATE INDEX idx_pedido_estado ON Pedidos(estado);
