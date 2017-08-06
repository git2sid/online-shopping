CREATE TABLE category
(
id IDENTITY,
name VARCHAR(50),
description varchar(255),
is_active boolean,
img_URL varchar(50),
CONSTRAINT pk_category_id PRIMARY KEY(id)
);