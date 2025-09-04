-- 코드를 작성해주세요
select ITEM_ID, ITEM_NAME, RARITY
from ITEM_INFO
where ITEM_NAME NOT IN (
    select i.ITEM_NAME
     from ITEM_TREE t
     join ITEM_INFO i
      on i.ITEM_ID = t.PARENT_ITEM_ID
     where t.PARENT_ITEM_ID is not null)
order by ITEM_ID desc
;