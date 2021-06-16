select series.title as series, genres.name as genre 
from series 
inner join genres 
on series.genre_id = series.id;

select episodes.title, concat(actors.first_name, " ", actors.last_name) as ator
from actor_episode
inner join episodes on episodes.id = actor_episode.episode_id 
inner join actors on actors.id = actor_episode.actor_id;

select series.title, count(seasons.id) as quantity
from series 
inner join seasons on seasons.serie_id = series.id
group by series.id;

select genres.name as genre, count(movies.id) as quantity
from genres
inner join movies on genres.id = movies.genre_id
group by genres.id
having count(movies.id) >= 3;

select distinct concat(actors.first_name, " ", actors.last_name) as actor
from actors
inner join actor_movie on actor_movie.actor_id = actors.id
inner join movies on actor_movie.movie_id = movies.id
where movies.title LIKE "La Guerra de las galaxias%";






