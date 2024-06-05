-- We need to count how much each shipper company made shipments to the city Graz. -- 

SELECT s.CompanyName, COUNT(o.orderID),o.ShipCity
FROM orders o JOIN shippers s ON o.ShipVia=s.ShipperID 
WHERE o.ShipCity='Graz' 
GROUP BY s.CompanyName;


SELECT c.CompanyName, o.ShipName, o.ShipCity, od.Quantity, COUNT(od.quantity)
FROM orders o JOIN customers c
ON o.CustomerID = c.CustomerID
JOIN `order details` od
ON o.OrderID = od.OrderID
WHERE city = 'Graz'
GROUP BY od.Quantity;


SELECT *, COUNT(*) AS shipment_count
FROM orders o JOIN customers c
ON o.CustomerID = c.CustomerID
JOIN `order details` od
ON o.OrderID = od.OrderID
WHERE city = 'Graz'
GROUP BY od.Quantity;

