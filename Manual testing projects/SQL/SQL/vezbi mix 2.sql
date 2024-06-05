SELECT Country, COUNT(CustomerID) AS Total
FROM customers
WHERE Country !='USA'
GROUP BY Country

SELECT Country, COUNT(CustomerID)
FROM customers
WHERE Country NOT LIKE 'USA'
GROUP BY Country

SELECT Country, COUNT(CustomerID) AS Total
FROM customers
WHERE Country <>'USA'
GROUP BY Country
HAVING Total >=9
ORDER BY Total DESC

SELECT DISTINCT CustomerID, COUNT(Country)
FROM customers

SELECT DISTINCT Country
FROM customers