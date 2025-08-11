-- 코드를 입력하세요
SELECT b.CATEGORY, sum(s.SALES) as TOTAL_SALES
from BOOK b
join BOOK_SALES s
on b.BOOK_ID = s.BOOK_ID
where s.SALES_DATE >= '2022-01-01' and s.SALES_DATE< '2022-02-01'
group by b.CATEGORY
order by b.CATEGORY
;