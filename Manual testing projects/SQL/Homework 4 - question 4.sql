--Write a query that will list the company name and the city 
in which their required dates for their orders is in September 1994.(Hint: with subquery)--

SELECT CompanyName, City
FROM customers
WHERE CustomerID IN (
    SELECT CustomerID
    FROM orders
    WHERE MONTH(RequiredDate) = 9 AND YEAR(RequiredDate) = 1994);




