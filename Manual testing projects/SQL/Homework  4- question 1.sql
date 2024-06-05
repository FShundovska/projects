--We need to count all orders for each ship city 
in which the month they are shipped is from August to December regardless of the YEAR--  


SELECT ShipCity, OrderDate, ShippedDate, COUNT(*) AS order_count, MONTH(ShippedDate)
FROM orders
WHERE MONTH(ShippedDate) BETWEEN 8 AND 12
GROUP BY ShipCity
ORDER BY MONTH(ShippedDate); 