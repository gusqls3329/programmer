-- 코드를 입력하세요
select p.MEMBER_NAME, r.REVIEW_TEXT, DATE_FORMAT(r.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
from MEMBER_PROFILE p
JOIN REST_REVIEW r ON r.MEMBER_ID = p.MEMBER_ID
WHERE r.MEMBER_ID IN (
    -- 리뷰 개수가 가장 많은 MEMBER_ID 찾기
    SELECT MEMBER_ID
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    HAVING COUNT(*) = (
        SELECT MAX(cnt)
        FROM (
            SELECT COUNT(*) AS cnt
            FROM REST_REVIEW
            GROUP BY MEMBER_ID
        ) sub
    )
)order by REVIEW_DATE, REVIEW_TEXT
;
