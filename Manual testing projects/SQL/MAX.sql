SELECT MAX(ProductID)
FROM products; 


SELECT MAX(OrderID)
FROM `order details`
WHERE Discount =0; 


SELECT MAX(UnitsInStock)
FROM products
WHERE SupplierID > 4 OR CategoryID > 8; 