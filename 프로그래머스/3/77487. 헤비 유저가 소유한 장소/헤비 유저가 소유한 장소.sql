-- 코드를 입력하세요
SELECT p.ID, p.NAME, p.HOST_ID
from PLACES p
join(SELECT *
     from PLACES 
     group by HOST_ID
     having count(HOST_ID) > 1) pp
on p.HOST_ID = pp.HOST_ID
order by p.ID
;