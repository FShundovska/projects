-- zadaca 2 - prasanje 9

SELECT *
FROM customers
WHERE City NOT IN ('Lyon','Paris','Madrid','Berlin') and Country IN ('Germany','France','Spain');