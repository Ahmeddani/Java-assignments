-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

insert into actor values (201, 'Hampton', 'Avenue')
insert into actor values (202, 'Lisa', 'Byway')

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

insert into film (title, description, release_year, language_id, length) values ('Euclidean PI', 'A Epic drama of Euclid as a pizza delivery boy in ancient Greece', 
'1998', '1', '198')
 

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

insert into film_actor (actor_id, film_id) values ('201', '1001')
insert into film_actor (actor_id, film_id) values ('202', '1001')
-- 4. Add Mathmagical to the category table.

insert into category (name) values ('Mathmagical')

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

update film_category set category_id = '17' where film_id = (select film_id from film where title = 'Euclidean PI')
update film_category set category_id = '17' where film_id = (select film_id from film where title = 'EGG IGBY')
update film_category set category_id = '17' where film_id = (select film_id from film where title = 'KARATE MOON')
update film_category set category_id = '17' where film_id = (select film_id from film where title = 'RANDOM GO')
update film_category set category_id = '17' where film_id = (select film_id from film where title = 'YOUNG LANGUAGE')

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

update film set rating = 'G' where film_id IN (select film_id from film_Category where category_id = '17')

-- 7. Add a copy of "Euclidean PI" to all the stores.
select count(*) from inventory
insert into inventory values ('4582', '1001', '1')
insert into inventory values ('4583', '1001', '2')

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

delete from film where title = 'Euclidean PI'

It did not succeed because it violates foreign_key constraint. film_id is being referenced 
from film_actor table where it must exist in film table.

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

delete from category where name = 'Mathmagical'

It did not. Because it violates fkey_referential integrity. category_id is serving as a foreign_key in film_category
pointing or refering to the primary_key of category table which is category_id.

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

delete from film_category where category_id = '17'
It was successful, because category_id in film_category is a pk in that table and not a fk in any other table.
It has not been referenced as a fk from any table.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

delete from category where category_id = '17'
It succeeded because we no more have any link with the film_category table, we can delete any row. 
delete from film where title = 'Euclidean PI'
It was not successful because we still have film_id in the film_actor table as fk refering back to film table.

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS

-we have a film_actor_film_id_fkey constraint and also a unique_constraint on pk_film_id.
-we have a inventory_film_id_fkey referential constraint too and also a unique pk constraint on inventory_film_id
-In order to delete the film we have to break all the referential links to film_id starting from film_actor then from inventory table

delete from film_actor where film_id = '1001'
delete from inventory where film_id = '1001'
delete from film where film_id = '1001'
