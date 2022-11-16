/* Write your T-SQL query statement below */
update b1 set b1.sex=(select case b2.sex when 'm' then 'f' else 'm' end as sex from Salary b2 where b2.id=b1.id) from Salary b1