-- We need to select the ID of Order, Employee Last Name, Employee First
Name and Date of Order, for all orders which match the ID of Employee.-- 


SELECT o.OrderID, e.EmployeeID, o.EmployeeID, e.LastName, e.FirstName, o.OrderDate
FROM orders o JOIN employees e 
ON o.EmployeeID = e.EmployeeID; 


SELECT *
FROM orders o JOIN employees e 
ON o.EmployeeID = e.EmployeeID; 