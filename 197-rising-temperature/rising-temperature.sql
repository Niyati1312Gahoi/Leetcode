# Write your MySQL query statement below
select w1.id from Weather w1 
join Weather w2 on w1.recordDate=DATE_ADD(w2.recordDate,Interval 1 day)
where w1.temperature>w2.temperature;
