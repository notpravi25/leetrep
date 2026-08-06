# Write your MySQL query statement below
select distinct Customer.customer_id as customer_id
from Customer group by customer_id
having count(distinct product_key) = (select count(product_key)
from Product)