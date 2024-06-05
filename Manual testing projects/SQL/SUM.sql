SELECT Country, COUNT(*) AS brojac
FROM customers
GROUP BY Country
ORDER BY brojac


SELECT Country, COUNT(*) AS brojac
FROM customers
GROUP BY Country
HAVING COUNT(*)=11
ORDER BY brojac; 

SELECT SUM(UnitPrice) AS Total, CategoryID
FROM products
GROUP BY CategoryID
HAVING Total>200
ORDER by Total; 