create table kodilla_course.books_aud
(
	EVENT_ID int auto_increment
		primary key,
	EVENT_DATE datetime not null,
	EVENT_TYPE varchar(10) null,
	BOOK_ID int not null,
	OLD_TITLE varchar(255) null,
	NEW_TITLE varchar(255) null,
	OLD_PUBYEAR int null,
	NEW_PUBYEAR int null,
	OLD_BESTSELLER tinyint(1) null,
	NEW_BESTSELLER tinyint(1) null
);

create table kodilla_course.readers_aud
(
    EVENT_ID      int auto_increment
        primary key,
    EVENT_DATE    datetime     not null,
    EVENT_TYPE    varchar(10)  null,
    READER_ID     int          not null,
    OLD_FIRSTNAME varchar(255) null,
    NEW_FIRSTNAME varchar(255) null,
    OLD_LASTNAME  varchar(255) null,
    NEW_LASTNAME  varchar(255) null,
    OLD_PESELID   int          null,
    NEW_PESELID   int          null,
    OLD_VIP_LEVEL varchar(255) null,
    NEW_VIP_LEVEL varchar(255) null
);


create definer = root@localhost trigger kodilla_course.READERS_DELETE
    after delete
    on kodilla_course.readers
    for each row
BEGIN
    INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID)
        VALUE (CURTIME(), 'DELETE', OLD.READER_ID);
END;


create definer = root@localhost trigger kodilla_course.READERS_INSERT
    after insert
    on kodilla_course.readers
    for each row
BEGIN
    INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID, NEW_FIRSTNAME, NEW_LASTNAME, NEW_PESELID, NEW_VIP_LEVEL)
        VALUE (CURTIME(), 'INSERT', NEW.READER_ID, NEW.FIRSTNAME, NEW.LASTNAME, NEW.PESELID, NEW.VIP_LEVEL); -- [5]
END;


create definer = root@localhost trigger kodilla_course.READERS_UPDATE
    after update
    on kodilla_course.readers
    for each row
BEGIN
    INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID, NEW_FIRSTNAME, NEW_LASTNAME,
                             NEW_PESELID, NEW_VIP_LEVEL, OLD_FIRSTNAME, OLD_LASTNAME,
                             OLD_PESELID, OLD_VIP_LEVEL)
        VALUE (CURTIME(), 'UPDATE', OLD.READER_ID, NEW.FIRSTNAME, NEW.LASTNAME,
               NEW.PESELID, NEW.VIP_LEVEL, OLD.FIRSTNAME, OLD.LASTNAME, OLD.PESELID,
               OLD.VIP_LEVEL);
END;


create definer = root@localhost trigger kodilla_course.BOOKS_DELETE
    after delete
    on kodilla_course.books
    for each row
BEGIN
    INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID)
        VALUE (CURTIME(), 'DELETE', OLD.BOOK_ID);
END;


create definer = root@localhost trigger kodilla_course.BOOKS_INSERT
    after insert
    on kodilla_course.books
    for each row
BEGIN
    INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID, NEW_TITLE, NEW_PUBYEAR, NEW_BESTSELLER)
        VALUE (CURTIME(), 'INSERT', NEW.BOOK_ID, NEW.TITLE, NEW.PUBYEAR, NEW.BESTSELLER); -- [5]
END;


create definer = root@localhost trigger kodilla_course.BOOKS_UPDATE
    after update
    on kodilla_course.books
    for each row
BEGIN
    INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID, NEW_TITLE, NEW_PUBYEAR,
                           NEW_BESTSELLER, OLD_TITLE, OLD_PUBYEAR,
                           OLD_BESTSELLER)
        VALUE (CURTIME(), 'UPDATE', OLD.BOOK_ID, NEW.TITLE, NEW.PUBYEAR,
               NEW.BESTSELLER, OLD.TITLE, OLD.PUBYEAR,
               OLD.BESTSELLER);
END;



