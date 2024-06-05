Zadaca 3 - prasanje 2 
--We need data for ID of Supplier, Name of Company, Name of Contact, 
Address and City for the first 10 records ordered alphabetically from the last word of the alphabet, 
which will meet the following conditions:
⦁ There is no data for Region 
⦁ There is no data for Homepage
⦁ Postal code starts with 1, 2 or 3
⦁ The country does not start with U


SELECT SupplierID, CompanyName, ContactName, Address, City, IFNULL(Region,'no region'), PostalCode, Country, IFNULL(HomePage,'Homepage') 
FROM suppliers
WHERE Country NOT LIKE 'U%' 
GROUP BY SupplierID 
HAVING COUNT(PostalCode) IN (1,2,3)
ORDER BY CompanyName DESC
LIMIT 10;
 
SELECT SupplierID, CompanyName, ContactName, Address, City, Region, PostalCode, Country, HomePage
FROM suppliers
WHERE Country NOT LIKE 'U%'
	AND Region IS NULL
  	AND HomePage IS NULL
GROUP BY SupplierID 
HAVING COUNT(PostalCode) IN (1,2,3)
ORDER BY CompanyName DESC
LIMIT 10;


