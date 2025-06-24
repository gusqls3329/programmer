-- 코드를 작성해주세요
select 
    case
        when 1<=MONTH(DIFFERENTIATION_DATE) && MONTH(DIFFERENTIATION_DATE) <=3
        then "1Q"
        when 4<=MONTH(DIFFERENTIATION_DATE) && MONTH(DIFFERENTIATION_DATE) <=6
        then "2Q"
        when 7<=MONTH(DIFFERENTIATION_DATE) && MONTH(DIFFERENTIATION_DATE) <=9
        then "3Q"
        else "4Q"
    end as QUARTER, count(ID) as ECOLI_COUNT
from ECOLI_DATA 
group by QUARTER
order by QUARTER
;

