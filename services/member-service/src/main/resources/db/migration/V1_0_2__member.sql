CREATE TABLE member.member (
    id              uuid    DEFAULT uuid_generate_v4 (),
    username        varchar(50),
    gender_type     varchar(30),
    nickname        varchar(50),
    password        varchar(256),

    CONSTRAINT		pk_users_id 		PRIMARY KEY(id),
    constraint      uq_username         unique (username)
    );

CREATE UNIQUE INDEX udx_users_username ON member.member(username);