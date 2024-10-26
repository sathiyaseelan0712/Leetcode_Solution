# Write your MySQL query statement below
select e.user_id, round(avg(if(c.action="confirmed",1,0)),2) as confirmation_rate
from Signups e
LEFT JOIN Confirmations c
on e.user_id = c.user_id
group by user_id;
