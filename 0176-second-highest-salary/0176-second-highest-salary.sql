/* Write your T-SQL query statement below */
SELECT CASE WHEN COUNT(DISTINCT salary) >= 1 THEN
        MAX(salary)
       ELSE
        NULL
    END AS SecondHighestSalary FROM
    (SELECT *, DENSE_RANK() OVER(ORDER BY salary DESC) AS 'rank' 
    FROM Employee) E
WHERE rank = 2;