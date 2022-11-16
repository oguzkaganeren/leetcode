/* Write your T-SQL query statement below */
select sell_date,count(1) as num_sold,STRING_AGG(product, ',') WITHIN GROUP (ORDER BY product ASC) AS products from (select distinct sell_date,product from activities) a group by a.sell_date




