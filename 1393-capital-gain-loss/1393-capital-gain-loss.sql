/* Write your T-SQL query statement below */
select stock_name, sum(capital_gain_loss) as capital_gain_loss from 
(select stock_name,sum(price) as capital_gain_loss from Stocks where operation='Sell' group by stock_name
union all
select stock_name,sum(price)*-1 as capital_gain_loss from Stocks where operation='Buy' group by stock_name) t group by stock_name
