-- 코드를 작성해주세요
SELECT E.EMP_NO, E.EMP_NAME, CASE WHEN G.SCORE < 80 THEN "C"
                            WHEN G.SCORE >= 80 AND G.SCORE<90 THEN "B"
                            WHEN G.SCORE >= 90 AND G.SCORE<96 THEN "A"
                            ELSE "S" 
                            END AS GRADE, 
                            CASE WHEN G.SCORE < 80 THEN 0
                            WHEN G.SCORE >= 80 AND G.SCORE<90 THEN E.SAL*0.1
                            WHEN G.SCORE >= 90 AND G.SCORE<96 THEN E.SAL*0.15
                            ELSE E.SAL * 0.2
                            END AS BONUS
FROM HR_EMPLOYEES E
JOIN (SELECT EMP_NO,AVG(SCORE) AS SCORE
      FROM HR_GRADE
     GROUP BY EMP_NO) G
ON G.EMP_NO = E.EMP_NO
ORDER BY E.EMP_NO