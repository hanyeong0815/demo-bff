CREATE TABLE board.board (
    id              BIGINT,
    title           varchar(50),
    content         varchar(256),
    upload_datetime        timestamp default current_timestamp,

    CONSTRAINT		pk_board_id 		PRIMARY KEY(id)
    );

CREATE UNIQUE INDEX udx_board_title ON board.board(title);