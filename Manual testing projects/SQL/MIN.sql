SELECT MIN(OrderID)
FROM orders; 

SELECT MIN(EmployeeID)
FROM orders
WHERE ShipVia=3; 


SELECT MIN(ShipperID), CompanyName
FROM shippers
WHERE CompanyName LIKE '_%' AND ShipperID>1
GROUP BY CompanyName
ORDER BY ShipperID;