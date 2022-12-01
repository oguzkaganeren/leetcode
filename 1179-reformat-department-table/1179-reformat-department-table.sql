/* Write your T-SQL query statement below */
select distinct r.id, jan.revenue as Jan_Revenue,
feb.revenue as Feb_Revenue,
mar.revenue as Mar_Revenue,
apr.revenue as Apr_Revenue,
may.revenue as May_Revenue,
jun.revenue as Jun_Revenue,
jul.revenue as Jul_Revenue,
aug.revenue as Aug_Revenue,
sep.revenue as Sep_Revenue,
oct.revenue as Oct_Revenue,
nov.revenue as Nov_Revenue,
dec.revenue as Dec_Revenue

from Department r
left join Department jan on jan.id=r.id and jan.month='Jan'
left join Department feb on feb.id=r.id and feb.month='Feb'
left join Department mar on mar.id=r.id and mar.month='Mar'
left join Department apr on apr.id=r.id and apr.month='Apr'
left join Department may on may.id=r.id and may.month='May'
left join Department jun on jun.id=r.id and jun.month='Jun'
left join Department jul on jul.id=r.id and jul.month='Jul'
left join Department aug on aug.id=r.id and aug.month='Aug'
left join Department sep on sep.id=r.id and sep.month='Sep'
left join Department oct on oct.id=r.id and oct.month='Oct'
left join Department dec on dec.id=r.id and dec.month='Dec'
left join Department nov on nov.id=r.id and nov.month='Nov'