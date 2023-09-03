# Write your MySQL query statement below


SELECT p1.email as Email
From person p1
Group by email
Having count(distinct id)>1;