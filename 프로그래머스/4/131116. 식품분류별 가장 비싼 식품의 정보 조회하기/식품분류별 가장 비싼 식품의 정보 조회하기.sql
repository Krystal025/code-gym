SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT f
WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
    AND PRICE = (
        SELECT MAX(PRICE)
        FROM FOOD_PRODUCT
        WHERE CATEGORY = f.CATEGORY
    )
GROUP BY CATEGORY
ORDER BY MAX_PRICE DESC;