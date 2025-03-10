SELECT d.DEPT_ID, DEPT_NAME_EN, ROUND(AVG(SAL)) AS AVG_SAL
FROM HR_DEPARTMENT d JOIN HR_EMPLOYEES e ON d.DEPT_ID = e.DEPT_ID
GROUP BY e.DEPT_ID
ORDER BY AVG_SAL DESC;