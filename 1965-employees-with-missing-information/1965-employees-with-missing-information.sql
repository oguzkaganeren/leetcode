# Write your MySQL query statement below
select * from (select employee_id from Employees e 
where employee_id not in (select employee_id from Salaries group by employee_id)
union
select employee_id from Salaries e 
where employee_id not in (select employee_id from Employees group by employee_id)) t order by t.employee_id asc