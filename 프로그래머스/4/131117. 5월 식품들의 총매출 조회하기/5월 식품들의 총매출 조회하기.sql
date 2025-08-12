-- 코드를 입력하세요
SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRICE * SUM(o.AMOUNT) AS TOTAL_SALES
from FOOD_PRODUCT p
join (select PRODUCT_ID, sum(AMOUNT) as AMOUNT
     from FOOD_ORDER 
     where PRODUCE_DATE>= '2022-05-01' and PRODUCE_DATE <'2022-06-01'
      group by PRODUCT_ID
     ) o
on p.PRODUCT_ID = o.PRODUCT_ID
group by p.PRODUCT_ID
order by TOTAL_SALES desc, p.PRODUCT_ID
;