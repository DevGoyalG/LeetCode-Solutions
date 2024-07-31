SELECT q.query_name,
       ROUND(AVG(q.rating/q.position),2) AS quality, 
       ROUND(AVG(IF(rating<3,1,0))*100,2) AS poor_query_percentage
FROM Queries q
WHERE q.query_name IS NOT NULL
GROUP BY q.query_name;
