SELECT AVG(UnitsInStock)
FROM products
WHERE ReorderLevel>25;

SELECT AVG(Freight)
FROM orders
WHERE EmployeeID<9 AND ShipVia IN (1,2); 

SELECT COUNT(ShipVia)
FROM orders
WHERE ShipVia>300; 


SELECT COUNT(ProductID)
FROM products
GROUP By UnitsOnOrder; 

SELECT ProductID, COUNT(UnitsOnOrder)
FROM products
GROUP BY UnitsOnOrder; 