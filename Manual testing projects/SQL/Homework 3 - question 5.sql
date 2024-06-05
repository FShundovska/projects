Zadaca 3 - prasanje 5

--Write a query to return the number of orders for each order date in the orders TABLE.--


SELECT OrderDate, COUNT(*) as Order_count
FROM orders
GROUP BY OrderDate;