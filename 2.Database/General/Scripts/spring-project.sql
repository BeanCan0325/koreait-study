use spring_project;
show tables;

CREATE TABLE members (
  member_id BIGINT NOT NULL AUTO_INCREMENT,
  user_id VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL,
  user_name VARCHAR(50) NOT NULL,
  birth_date DATETIME NULL,
  phone_number VARCHAR(50) NULL,
  created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (member_id),
  UNIQUE KEY uq_members_user_id (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='회원';

select * from members;

CREATE TABLE books (
  book_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '도서ID',
  title VARCHAR(255) NOT NULL COMMENT '도서제목',
  author VARCHAR(100) NOT NULL COMMENT '도서저자',
  publisher VARCHAR(100) NOT NULL COMMENT '도서출판사',
  PRIMARY KEY (book_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='도서정보';

select * from books;

CREATE TABLE borrowing (
  borrow_key BIGINT NOT NULL AUTO_INCREMENT,
  member_id  BIGINT NOT NULL,
  book_id    BIGINT NOT NULL,
  is_borrowed BOOLEAN NOT NULL DEFAULT TRUE,
  PRIMARY KEY (borrow_key),
  FOREIGN KEY (member_id) REFERENCES members(member_id),
  FOREIGN KEY (book_id) REFERENCES books(book_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='대여';

select * from borrowing;

