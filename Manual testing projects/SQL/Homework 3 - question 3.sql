Zadaca 3 - prasanje 3
--We need to count all Orders and also make summation of their total unit price, 
where they meet the following conditions:
⦁ There is discount
⦁ The ID of the product is from 3 to 9
⦁ There are no more than 30 pieces in stock
⦁ The ID of the orders is from 101** to 106**--


SELECT OrderID, ProductID, SUM(UnitPrice) AS TotalPrice, Quantity, Discount
FROM `order details`
WHERE Discount > 0
  AND ProductID BETWEEN 3 AND 9
  AND Quantity <= 30
  AND OrderID BETWEEN 10100 AND 10699;