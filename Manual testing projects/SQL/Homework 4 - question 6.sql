--We need to write a query where we will list the first name, last name and title that live in London
and made orders in 1995.(Hint: with subquery)--


SELECT CompanyName, ContactName, ContactTitle, City
FROM customers
WHERE City ='London' AND CustomerID IN 
(SELECT CustomerID
FROM orders
WHERE YEAR(OrderDate)= 1995)


