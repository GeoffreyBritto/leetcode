/* Write your T-SQL query statement below */
SELECT
    P.product_id,
    ISNULL(ROUND(SUM(P.price * US.units * 1.0) / SUM(US.units), 2), 0) AS average_price 
FROM Prices P
    LEFT LOOP JOIN UnitsSold US ON US.product_id = P.product_id 
        AND US.purchase_date BETWEEN P.start_date AND P.end_date
GROUP BY P.product_id 