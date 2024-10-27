# Write your MySQL query statement below
SELECT P.project_id , ROUND(AVG(experience_years),2) AS average_years
FROM Project P LEFT JOIN Employee E On P.employee_id = E.employee_id
GROUP BY project_id;
