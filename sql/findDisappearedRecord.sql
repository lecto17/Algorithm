--없어진 기록 찾기
SELECT ao.ANIMAL_ID, ao.NAME
FROM ANIMAL_INS as ai
RIGHT JOIN ANIMAL_OUTS as ao
ON ai.ANIMAL_ID = ao.ANIMAL_ID
WHERE ai.ANIMAL_ID IS NULL
