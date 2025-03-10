SELECT CONCAT('/home/grep/src/', b.BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD b JOIN USED_GOODS_FILE f ON b.BOARD_ID = f.BOARD_ID
WHERE b.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY FILE_ID DESC;