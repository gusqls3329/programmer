-- 코드를 입력하세요
SELECT distinct(c.CART_ID)
from CART_PRODUCTS c
join (SELECT *
     from CART_PRODUCTS 
     where NAME = "Yogurt") y
on c.CART_ID = y.CART_ID
where c.NAME = "Milk" 
;