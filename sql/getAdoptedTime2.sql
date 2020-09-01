--프로시저 개념

SET @hour := -1;

SELECT (@hour := @hour + 1) AS HOUR,
(SELECT count(*) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @hour) as COUNT
FROM ANIMAL_OUTS
WHERE @hour < 23
