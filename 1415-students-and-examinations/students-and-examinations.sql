# Write your MySQL query statement below
select s.student_id,s.student_name,d.subject_name,count(e.subject_name) as attended_exams
from  Students  s 
cross join Subjects d 
left join Examinations e on e.student_id=s.student_id and e.subject_name=d.subject_name

group by s.student_id,s.student_name,d.subject_name
order by (s.student_id) ,(d.subject_name);