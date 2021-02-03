SELECT c.Name as Customers FROM Customers c
WHERE NOT EXISTS (SELECT 1 FROM Orders o WHERE c.Id = o.CustomerId LIMIT 1);