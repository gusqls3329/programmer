-- 코드를 작성해주세요
select YEAR(YM) as YEAR, round(avg(PM_VAL1),2) as PM10,  round(avg(PM_VAL2),2) as "PM2.5"
from AIR_POLLUTION 
group by YEAR , LOCATION1,LOCATION2
having LOCATION1 = "경기도" and LOCATION2 = "수원"
order by YEAR asc;