-- 코드를 작성해주세요
select ROUND(AVG(case when LENGTH is null or LENGTH < 10 then 10 else LENGTH end ),2) as AVERAGE_LENGTH
from FISH_INFO 
;
