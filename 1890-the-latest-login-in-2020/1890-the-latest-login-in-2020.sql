/* Write your T-SQL query statement below */
select li.user_id,max(li.time_stamp) as last_stamp from Logins li 

where YEAR(li.time_stamp)=2020
group by li.user_id