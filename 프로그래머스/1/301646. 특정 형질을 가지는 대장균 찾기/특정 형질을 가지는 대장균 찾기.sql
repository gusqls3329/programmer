-- 코드를 작성해주세요
select COUNT(GENOTYPE) as COUNT
from ECOLI_DATA
where GENOTYPE & 2 = 0 and (GENOTYPE & 1 >= 1 or GENOTYPE & 4 >= 1)