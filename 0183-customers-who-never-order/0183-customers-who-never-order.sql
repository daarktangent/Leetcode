# Write your MySQL query statement below
SELECT c.name as Customers
FROM Customers c
LEFT join Orders o 
On o.customerId = c.id
where o.id is NULL