SELECT name as Customers
FROM Customers
where id NOT IN(Select Distinct(o.customerID)
FROM Customers  c
JOIN Orders o
on c.id=o.customerId)


