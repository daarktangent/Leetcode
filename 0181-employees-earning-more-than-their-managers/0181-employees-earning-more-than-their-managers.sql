SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2
on e1.managerId=e2.id
where e1.salary>e2.salary;
