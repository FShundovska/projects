--We need to list the shipper Id and the company NAME 
that has Freight bigger than 1000 (Hint: with subquery)--



SELECT ShipperID, CompanyName
FROM shippers
WHERE ShipperID in
(SELECT ShipVia
FROM orders
WHERE Freight >1000);

SELECT *
FROM orders
WHERE Freight >1000; 

SELECT *
FROM orders
WHERE Freight >1000
ORDER BY Freight desc; 