# Write your MySQL query statement below
Select euni.unique_id ,e.name
from Employees e LEFT JOIN EmployeeUNI euni 
ON e.id= euni.id;

