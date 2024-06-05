SELECT MIN(EmployeeID)
FROM orders
WHERE ShipVia=3;


SELECT MAX(UnitsInStock)
FROM products
WHERE SupplierID>4 OR CategoryID>8; 

SELECT COUNT(*)
FROM employees; 

SELECT COUNT(EmployeeID)
FROM employees; 


SELECT AVG(Quantity)
FROM `order details`;

SELECT MIN(UnitPrice) AS Minimum, MAX(UnitPrice) AS Maximum, AVG(UnitPrice) AS Average
FROM products;

