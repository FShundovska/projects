SELECT *
FROM products
WHERE UnitsInStock BETWEEN 10 AND 50

SELECT *
FROM employees 
where TitleOfCourtesy NOT IN ('Mr.', 'Dr.');

SELECT *
FROM products
WHERE UnitPrice BETWEEN 15 AND 50 AND UnitsInStock BETWEEN 15 AND 50


SELECT *
FROM products
WHERE UnitsInStock BETWEEN 15 AND 50 AND UnitPrice NOT BETWEEN 15 AND 50

SELECT *
FROM customers
WHERE ContactTitle IN ('Owner',' Marketing manager') AND Country ='USA'; 

SELECT *
FROM products
WHERE UnitPrice <14 OR UnitsInStock =0;


SELECT *
FROM products
WHERE CategoryID BETWEEN 4 AND 8 AND (Discontinued=0 OR ReorderLevel >7) AND ProductName LIKE 'G%';


SELECT *
FROM products
WHERE UnitPrice NOT BETWEEN 30 AND 50; 

SELECT *
FROM products
WHERE CategoryID IN (1,2,8) AND ProductName NOT LIKE 'L%';


SELECT OrderID, OrderDate, RequiredDate, ShippedDate
FROM orders
ORDER BY OrderDate;


SELECT EmployeeID, FirstName
FROM employees
LIMIT 8; 

SELECT *
FROM suppliers
LIMIT 5;
