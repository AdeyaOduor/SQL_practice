//SQL query to get the names of all parks with fewer than 1,000,000 visitors.
SELECT name FROM park
WHERE park_visitors < 1000000

//SQL query to get the number of distinct cities in the park table
SELECT COUNT(DISTINCT city) FROM park

