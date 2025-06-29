DROP TABLE IF EXISTS "User";

CREATE TABLE "AppUser" (
    id BIGSERIAL PRIMARY KEY,
    "userName" VARCHAR(60) NOT NULL,
    password VARCHAR(60) NOT NULL, 
    "firstName" VARCHAR(60) NOT NULL,
    "lastName" VARCHAR(60) NOT NULL, 
    email VARCHAR(60) NOT NULL,
    role SMALLINT NOT NULL
);

