# Write your MySQL query statement below
select r.contest_id,Round(count(Distinct user_id)*100/(select count(user_id) from Users),2) as percentage
from  Register r
group by contest_id
order by percentage DESC ,contest_id;
