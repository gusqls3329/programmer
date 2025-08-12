-- 코드를 입력하세요
SELECT a.APNT_NO,p.PT_NAME, a.PT_NO, a.MCDP_CD, d.DR_NAME, a.APNT_YMD
from APPOINTMENT a
join DOCTOR  d
on d.DR_ID=a.MDDR_ID
join PATIENT p
on p.PT_NO = a.PT_NO
where a.APNT_YMD Like '2022-04-13%'
    and a.APNT_CNCL_YN = "N"
order by APNT_YMD
;