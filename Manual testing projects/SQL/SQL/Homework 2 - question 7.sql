--zadaca 2 - prasanje 7

SELECT *
FROM `order details`
WHERE (UnitPrice BETWEEN 14 AND 50 OR Quantity NOT BETWEEN 20 AND 45) AND ProductID LIKE '2%';






 