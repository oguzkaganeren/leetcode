# Write your MySQL query statement below
select s.name, s.balance from (select u.name, sum(t.amount) as balance from Users u
inner join Transactions t on u.account = t.account
group by u.name) s where s.balance > 10000