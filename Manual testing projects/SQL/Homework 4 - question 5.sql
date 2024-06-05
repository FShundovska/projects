--List all the orders in which the difference between the shipped date and the required date is 30 days
--

SELECT OrderID, ShippedDate, RequiredDate, DATEDIFF(ShippedDate, RequiredDate)
FROM orders
WHERE DATEDIFF(RequiredDate, ShippedDate)=30; 



SELECT *
FROM orders
WHERE DATEDIFF(RequiredDate, ShippedDate) =30; 



