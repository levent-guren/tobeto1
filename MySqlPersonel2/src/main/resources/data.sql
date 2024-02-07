INSERT INTO kullanici(id, email, sifre)
SELECT * 
FROM ( SELECT MID(UUID(),1,16), "levent", "$2a$10$IVT/9yWgKKv/bUQhSsYB2.q.Ss6olW7iPv6l34q0SIq6Pt/wkZ1o6" UNION ALL
       SELECT MID(UUID(),1,16), "emre", "$2a$10$LFSlOh4g6APk9a96ZObvWOPSLBdmdCC9HScy2I5ghRqMqW9vbXdo6") t
WHERE NOT EXISTS ( SELECT NULL
                   FROM kullanici as k);
                   
insert into rol(id, adi, kullanici_id) 
select * from 
 (
 select MID(UUID(),1,16), "user", (select id from kullanici where email = "levent") union all 
 select MID(UUID(),1,16), "admin", (select id from kullanici where email = "levent") union all 
 select MID(UUID(),1,16), "user", (select id from kullanici where email = "emre")  
 ) t
WHERE NOT EXISTS ( SELECT NULL
                   FROM rol as r);
 
