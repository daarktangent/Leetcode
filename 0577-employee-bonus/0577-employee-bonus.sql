# Write your MySQL query statement below
SELECT e.name,b.bonus
FROM Employee e
LEFT JOIN Bonus b
on e.empID=b.empId
WHERE b.bonus IS NULL or b.bonus<1000;