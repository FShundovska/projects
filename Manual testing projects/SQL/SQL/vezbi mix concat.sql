SELECT Discontinued, COUNT(Discontinued)
FROM products
GROUP BY Discontinued


SELECT OrderDate, COUNT(OrderDate)
FROM orders
GROUP BY OrderDate

SELECT ProductID, SUM(UnitPrice),SUM(Quantity), SUM(UnitPrice)*SUM(Quantity) AS Total
FROM `order details`
GROUP BY ProductID
HAVING  Total>600000
ORDER BY ProductID


SELECT CONCAT(FirstName,' ',LastName) AS NAME
FROM employees

SELECT CONCAT(IFNULL(Region,'no region'),' ', City) AS Location
FROM employees

SELECT CONCAT(TitleOfCourtesy.,FirstName,' ',LastName,'/ BirthDate:',BirthDate) AS EmployeeData
from employees