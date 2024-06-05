-- We need to return list of: ID of Order, ID of Customer and 
ID of Employee from orders table, and ID of Product AND 
also Quantity from order details table, only where there is match for the ORDER.-- 


SELECT o.OrderID AS OrderID, o.CustomerID, o.EmployeeID, od.ProductID, od.Quantity
FROM orders o JOIN `order details` od 
ON o.OrderID = od.OrderID;