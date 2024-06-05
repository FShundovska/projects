Zadaca 3 - prasanje 4
--We need to list to minimum value, the maximum value and the average value of Freight, for orders that fulfill the following conditions
⦁ Date of shipment is between 01.01.1994 to 01.01.1996
⦁ They are shipped via 1 or 2
⦁ There is data in Region--


SELECT ShippedDate, ShipVia, Freight, MIN(Freight) AS MinimumValue, MAX(Freight) AS MaximumValue, AVG(Freight) AS AverageValue, ShipRegion
FROM orders
WHERE ShippedDate BETWEEN '1994-01-01' AND '1996-01-01'
  AND ShipVia IN (1, 2)
  AND ShipRegion IS NOT NULL;
  