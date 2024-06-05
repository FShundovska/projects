--List all the employees that are from UK and their difference 
between birthdate and hiredate is less than 30 years.--


SELECT FirstName, LastName, Country, BirthDate, HireDate
FROM employees
WHERE Country = 'UK' AND TIMESTAMPDIFF(year, BirthDate, HireDate) < 30;



SELECT FirstName, LastName, Country, BirthDate, HireDate, TIMESTAMPDIFF(YEAR, BirthDate, HireDate)
FROM employees
WHERE Country = 'UK'
ORDER BY TIMESTAMPDIFF(YEAR, BirthDate, HireDate); 

