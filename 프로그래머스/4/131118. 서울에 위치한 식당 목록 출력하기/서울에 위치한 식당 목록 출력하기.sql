-- 코드를 입력하세요
SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS,  r.SCORE
from REST_INFO i
join (select ROUND(AVG(REVIEW_SCORE),2) as SCORE, REST_ID, REVIEW_ID
      from REST_REVIEW
     group by REST_ID) r
on i.REST_ID = r.REST_ID
where i.ADDRESS like "서울%"
order by SCORE desc, FAVORITES desc
;
