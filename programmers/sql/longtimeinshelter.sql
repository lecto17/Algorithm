--오랜 기간 보호한 동물(1)
SELECT ai.NAME, ai.DATETIME
FROM ANIMAL_INS AS ai
LEFT JOIN ANIMAL_OUTS AS ao
ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ao.DATETIME IS NULL
ORDER BY ai.DATETIME 
LIMIT 0, 3