SELECT OUTS.ANIMAL_ID, OUTS.NAME
FROM ANIMAL_OUTS AS OUTS
LEFT JOIN ANIMAL_INS AS INS
ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
WHERE INS.NAME IS NULL
AND OUTS.NAME IS NOT NULL
ORDER BY OUTS.ANIMAL_ID