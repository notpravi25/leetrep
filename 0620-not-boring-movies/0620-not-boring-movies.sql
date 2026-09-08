# Write your MySQL query statement below
select id, movie, description,rating
from Cinema c where c.id%2 !=0 AND c.description != "boring" 
order by rating desc