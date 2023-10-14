DROP TABLE IF EXISTS cats;

CREATE TABLE cats (
  id INT unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  color VARCHAR(20) NOT NULL,
  birth_date DATE NOT NULL,
  favorite_snack VARCHAR(30) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO cats (name,color,birth_date,favorite_snack) VALUES ("Roku","黒",｀"2019/6/9","ちゅ〜る贅沢まぐろ味");
INSERT INTO cats (name,color,birth_date,favorite_snack) VALUES ("Tom","グレー＆白","2022/4/10","またたびスナック");
INSERT INTO cats (name,color,birth_date,favorite_snack) VALUES ("Lucca","茶＆白","2022/7/10","ロイヤルカナンのパウチ");
INSERT INTO cats (name,color,birth_date,favorite_snack) VALUES ("Bungaku","黒＆白","2022/9/15","にぼし");
INSERT INTO cats (name,color,birth_date,favorite_snack) VALUES ("Hinata","茶＆白","2022/9/15","鰹節");
