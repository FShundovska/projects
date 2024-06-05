SELECT MIN(OrderID) AS 'Min ID'
FROM orders;

SELECT MAX(OrderID) AS 'Max'
FROM orders;

SELECT OrderID
FROM orders
ORDER BY orderID;


SELECT COUNT(*)
from orders;

SELECT SUM(OrderID)
FROM orders;

SELECT AVG(OrderID)
FROM orders
WHERE EmployeeID=2;

SELECT SupplierID, CompanyName, ContactName, Address, City, Region, PostalCode, Country, HomePage
FROM suppliers
WHERE Country NOT LIKE 'U%'
	AND Region IS NULL
  	AND HomePage IS NULL
GROUP BY SupplierID 
HAVING COUNT(PostalCode) IN (1,2,3)
ORDER BY CompanyName DESC
LIMIT 10;