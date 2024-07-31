/* Write your T-SQL query statement below */
SELECT T.teacher_id, COUNT(T.teacher_id) cnt 
FROM(
    SELECT teacher_id, COUNT(teacher_id) AS duplicates
    FROM Teacher
    GROUP BY teacher_id, subject_id
) T 
GROUP BY T.teacher_id;