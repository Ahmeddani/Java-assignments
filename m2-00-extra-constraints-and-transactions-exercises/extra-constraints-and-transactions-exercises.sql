-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)

insert into city  values ('4080', 'smallville', 'USA', 'Kansas', '45001')

-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
select * from countrylanguage
insert into countrylanguage values ('USA', 'Kryptonese', 'false', '0.0001')

-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.

update countrylanguage set language = 'Krypto-babble' where language = 'Kryptonese'

-- 4. Set the US captial to Smallville, Kansas in the country table.

update country set capital = (select id from city where name = 'smallville')

-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)

delete from city where name= 'smallville'
No, because it violates fk constraint. city.id is a fk in country.capital

-- 6. Return the US captial to Washington.

update country set capital = (select id from city where name = 'Washington')

-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)

delete from city where name = 'smallville' AND district = 'Kansas'
yes, because we moved the fk constraint to city.washington and smallville is no more referenced.

-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)

update countrylanguage set isofficial = NOT isofficial where countrycode IN (select code from country where indepyear > 1800 AND indepyear < 1972)

-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)
select population from city
update city set population = round((population / 1000), 0)

-- 10. Assuming a country's surfacearea is expressed in miles, convert it to 
-- meters for all countries where French is spoken by more than 20% of the 
-- population.
-- (7 rows affected)
select * from countrylanguage
update country set surfacearea = (surfacearea * 1.6) where code IN (select countrycode 
from countrylanguage where language = 'French' AND percentage > '20')
