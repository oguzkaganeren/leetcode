/* Write your T-SQL query statement below */
select sp.name from SalesPerson sp
where sp.sales_id not in 
(
    select sales_id from Orders
where com_id in 
(select com_id from Company where name='RED')
)
