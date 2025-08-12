-- 코드를 입력하세요
SELECT a.AUTHOR_ID,	a.AUTHOR_NAME, b.CATEGORY, sum(s.SALES*b.PRICE) as TOTAL_SALES

from BOOK b
join AUTHOR a
on b.AUTHOR_ID = a.AUTHOR_ID
join (select sum(SALES) as SALES, BOOK_ID
      from BOOK_SALES
      where SALES_DATE LIKE '2022-01%'
      group by BOOK_ID
      )s
on s.BOOK_ID = b.BOOK_ID
GROUP BY a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY

order by a.AUTHOR_ID , b.CATEGORY desc
;