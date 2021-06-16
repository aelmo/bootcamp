insert into movies values (3423, now(), now(), "Filme do mal", 4.5, 2, now(), 1, 1);

insert into genres values (3423, now(), now(), "Romantico", 13, 1);

UPDATE movies m
SET m.genre_id = 3423
WHERE m.id = 3423;

UPDATE actors a
SET a.favorite_movie_id = 3423
WHERE a.id = 1;

CREATE TEMPORARY TABLE temp_movies SELECT * FROM movies;
	
delete from temp_movies tm where tm.awards < 5;

select g.name from genres g 
inner join movies m
on g.id = m.genre_id
group by g.id
having count(m.id) >= 1;

select a.first_name from actors a
inner join movies m
on a.favorite_movie_id = m.id
where m.awards > 3;

explain delete from temp_movies tm where tm.awards < 5;

explain select g.name from genres g 
inner join movies m
on g.id = m.genre_id
group by g.id
having count(m.id) >= 1;

CREATE INDEX idx_movie_titleidx_movie_titleidx_movie_title ON movies(title);

SHOW INDEX FROM movies
