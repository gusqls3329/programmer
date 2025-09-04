-- 코드를 작성해주세요
select f.ID, case when j.CHILD_COUNT is null
                then 0 else j.CHILD_COUNT
                end as CHILD_COUNT
from ECOLI_DATA f
LEFT join 
    (select PARENT_ID, count(*) as CHILD_COUNT
        from ECOLI_DATA 
        group by PARENT_ID) j
on j.PARENT_ID = f.ID
order by ID
;