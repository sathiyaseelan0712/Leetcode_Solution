# Write your MySQL query statement below
select activity_date as day, count(Distinct user_id) as active_users
FROM Activity
Where (activity_date >"2019-06-27" AND activity_date <="2019-07-27")
GROUP BY activity_date;
