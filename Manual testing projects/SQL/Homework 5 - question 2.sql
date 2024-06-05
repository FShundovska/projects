-- We need to select all Companies from customer table and return list of all

orders they might have, sorted by Name of Company.-- 


SELECT c.CompanyName, o.OrderID, o.OrderDate
FROM customers c LEFT JOIN orders o 
ON c.CustomerID = o.CustomerID
ORDER BY c.CompanyName;


SELECT *
FROM customers c LEFT JOIN orders o 
ON c.CustomerID = o.CustomerID
ORDER BY c.CompanyName;