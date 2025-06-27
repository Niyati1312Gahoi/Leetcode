# Write your MySQL query statement below
select e1.name as Employee from Employee e1 
join Employee e2 on e2.Id=e1.ManagerId
where e1.salary>e2.salary;
