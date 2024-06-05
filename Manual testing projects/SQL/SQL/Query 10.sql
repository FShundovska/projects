--zadaca 1 - prasanje 5

SELECT ProductID, UnitPrice, Quantity, Discount
FROM `order details`; 



SELECT ProductID, UnitPrice, Quantity, Discount
FROM `order details`
WHERE Discount >'0';
