/* Write your T-SQL query statement below */
SELECT machine_id, ROUND(AVG(processing_time), 3) AS processing_time
FROM (
    SELECT S.machine_id, (E.timestamp - S.timestamp) AS processing_time
    FROM Activity S
    JOIN Activity E
    ON S.machine_id = E.machine_id
    AND S.process_id = E.process_id
    AND S.activity_type = 'start'
    AND E.activity_type = 'end'
) AS times
GROUP BY machine_id;
