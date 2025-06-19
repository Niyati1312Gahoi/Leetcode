# Write your MySQL query statement below
Select p.product_name, s.price,s.year 
from Sales s
Left JOIN Product p
on s.product_id=p.product_id;
