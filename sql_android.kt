//SQL query to get the names of all parks with fewer than 1,000,000 visitors.
SELECT name FROM park
WHERE park_visitors < 1000000

//SQL query to get the number of distinct cities in the park table
SELECT COUNT(DISTINCT city) FROM park

//SQL query to get the total number of visitors to parks in San Francisco.
SELECT SUM(park_visitors) FROM park
WHERE city = "San Francisco"

//SQL query to the top 5 parks (names only) along with their visitor count that had the most visitors, in descending order.
SELECT name, park_visitors FROM park
ORDER BY park_visitors DESC
LIMIT 5

