-- The following queries utilize the "world" database.
-- Write queries for the following problems. 
-- Notes:
--   GNP is expressed in units of one million US Dollars
--   The value immediately after the problem statement is the expected number 
--   of rows that should be returned by the query.

-- 1. The name and state plus population of all cities in states that border Ohio 
-- (i.e. cities located in Pennsylvania, West Virginia, Kentucky, Indiana, and 
-- Michigan).  
-- The name and state should be returned as a single column called 
-- name_and_state and should contain values such as ‘Detroit, Michigan’.  
-- The results should be ordered alphabetically by state name and then by city 
-- name. 
-- (19 rows)

select (name || ', ' || district) AS name_and_state, population from city where district 
IN ('Pennsylvania', 'West Verginia', 'Kentucky', 'Indiana' , 'Michigan') order by district, name

-- 2. The name, country code, and region of all countries in Africa.  The name and
-- country code should be returned as a single column named country_and_code 
-- and should contain values such as ‘Angola (AGO)’ 
-- (58 rows)

select name || ' ('||code2||')' AS country_and_code, region from country where continent = 'Africa'

-- 3. The per capita GNP (i.e. GNP multipled by 1000000 then divided by population) of all countries in the 
-- world sorted from highest to lowest. Recall: GNP is express in units of one million US Dollars 
-- (highest per capita GNP in world: 37459.26)

select round ((gnp * 1000000) / population, 2) AS per_capita_gnp from country where population is not null AND population > 0 order by per_capita_gnp desc

-- 4. The average life expectancy of countries in South America.
-- (average life expectancy in South America: 70.9461)

select round(AVG(lifeexpectancy) ::numeric, 4)from country where continent = 'South America'

-- 5. The sum of the population of all cities in California.
-- (total population of all cities in California: 16716706)

select district, sum(population) As population from city where district = 'California' group by district

-- 6. The sum of the population of all cities in China.
-- (total population of all cities in China: 175953614)

select countrycode, sum(population) AS population from city where countrycode = 'CHN' group by countrycode

-- 7. The maximum population of all countries in the world.
-- (largest country population in world: 1277558000)

select max(population) AS from country 

-- 8. The maximum population of all cities in the world.
-- (largest city population in world: 10500000)

select max(population) from city

-- 9. The maximum population of all cities in Australia.
-- (largest city population in Australia: 3276207)

select max(population) from city where countrycode = 'AUS'

-- 10. The minimum population of all countries in the world.
-- (smallest_country_population in world: 50)

select min(population) from country where population > 0

-- 11. The average population of cities in the United States.
-- (avgerage city population in USA: 286955.3795)

select round(avg(population), 4)from city where countrycode = 'USA'

-- 12. The average population of cities in China.
-- (average city population in China: 484720.6997 approx.)

select round(avg(population),4) from city where countrycode = 'CHN'

-- 13. The surface area of each continent ordered from highest to lowest.
-- (largest continental surface area: 31881000, "Asia")

select sum(surfacearea) AS total_surface_area, continent from country group by continent order by total_surface_area desc

-- 14. The highest population density (population divided by surface area) of all 
-- countries in the world. 
-- (highest population density in world: 26277.7777)

select max(round((population / surfacearea)::numeric, 4)) As density from country

-- 15. The population density and life expectancy of the top ten countries with the 
-- highest life expectancies in descending order. 
-- (highest life expectancies in world: 83.5, 166.6666, "Andorra")

select name, round(AVG(population / surfacearea)::numeric, 4)AS population_density, lifeexpectancy from country where lifeexpectancy IS NOT NULL group by name, lifeexpectancy order by lifeexpectancy desc limit 10

-- 16. The difference between the previous and current GNP of all the countries in 
-- the world ordered by the absolute value of the difference. Display both 
-- difference and absolute difference.
-- (smallest difference: 1.00, 1.00, "Ecuador")

select  gnp - gnpold AS gnp_difference, ABS(gnp-gnpold) AS absolut_difference, name from country where gnp IS NOT NULL order by ABS(gnp-gnpold)

-- 17. The average population of cities in each country (hint: use city.countrycode)
-- ordered from highest to lowest.
-- (highest avg population: 4017733.0000, "SGP")

select round(AVG(population),4) AS avg_population, countrycode from city group by city.countrycode order by avg_population desc 
	
-- 18. The count of cities in each state in the USA, ordered by state name.
-- (45 rows)

select district, count(*) AS number_of_cities from city where countrycode = 'USA' group by district order by district
	
-- 19. The count of countries on each continent, ordered from highest to lowest.
-- (highest count: 58, "Africa")

select count(*) AS number_of_countries, continent from country group by continent order by number_of_countries desc
	
-- 20. The count of cities in each country ordered from highest to lowest.
-- (largest number of  cities ib a country: 363, "CHN")

select count(*) AS number_of_cities, countrycode from city group by countrycode order by number_of_cities desc
	
-- 21. The population of the largest city in each country ordered from highest to 
-- lowest.
-- (largest city population in world: 10500000, "IND")

select max(population), countrycode from city group by countrycode order by max desc

-- 22. The average, minimum, and maximum non-null life expectancy of each continent 
-- ordered from lowest to highest average life expectancy. 
-- (lowest average life expectancy: 52.5719, 37.2, 76.8, "Africa")

select round(AVG(lifeexpectancy)::numeric, 4) AS average, round(min(lifeexpectancy)::numeric, 1), round(max(lifeexpectancy)::numeric, 1), 
continent 
from country 
where lifeexpectancy IS NOT NULL group by continent order by average 


