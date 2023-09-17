SELECT p.email
FROM person p
Group BY p.email
having count(email)>1;