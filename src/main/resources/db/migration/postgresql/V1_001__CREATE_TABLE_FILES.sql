CREATE SEQUENCE  files_seq;

CREATE TABLE files (
    id    INT   NOT NULL DEFAULT nextval('files_seq'),
    file  BYTEA NOT NULL,
    PRIMARY KEY (id)
);