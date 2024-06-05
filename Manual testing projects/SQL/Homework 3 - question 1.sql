Zadaca 3 - prasanje 1 
--We need to count all Companies aggregated by Country which meets the following conditions, 
sorted by Country:
⦁ There is data for Region;
⦁ Can be contacted by Fax;
⦁ The ID of Customer starts with ‘A’, ‘B’ or ‘CA’;
⦁ The Country is not one of Germany, Argentina or Spain and does not starts with ‘U’ and has 3 letters;

SELECT Country,COUNT(CompanyName) AS Company
FROM customers
WHERE Region IS NOT NULL AND Fax IS NOT NULL AND CustomerID LIKE 'a%' OR CustomerID LIKE 'b%' OR CustomerID LIKE 'ca%'
GROUP BY Country
HAVING Country NOT IN ('Argentina','Germany','Spain') and Country NOT LIKE 'U_%'
ORDER BY Company; 

SELECT Country, COUNT(*) AS CompanyCount
FROM customers
WHERE Region IS NOT NULL
  AND Fax IS NOT NULL
  AND (CustomerID LIKE 'A%' OR CustomerID LIKE 'B%' OR CustomerID LIKE 'CA%')
  AND Country NOT IN ('Germany', 'Argentina', 'Spain')
  AND Country NOT LIKE 'U%'
  AND LENGTH(Country) = 3
GROUP BY Country
ORDER BY Country;