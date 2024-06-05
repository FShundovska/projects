-- We need to list all the customers that are and have orders from Brazil but not from Rio de Janeiro--


SELECT *
FROM customers c JOIN orders o
ON c.CustomerID = o.CustomerID 
WHERE c.Country = 'Brazil' AND c.City <> 'Rio de Janeiro'
ORDER BY c.City;

