# Write your MySQL query statement below
Select o.customer_number
From Orders o
Group BY o.customer_number 
Order by COUNT(o.order_number) DESC
LIMIT 1;
