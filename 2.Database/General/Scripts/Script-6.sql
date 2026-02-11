

USE study_project;

CREATE TABLE member (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'PK',
    user_name VARCHAR(50) NOT NULL COMMENT '이름',
    email VARCHAR(100) NOT NULL COMMENT '이메일',
    nick_name VARCHAR(50) NOT NULL COMMENT '닉네임',
    password VARCHAR(255) NOT NULL COMMENT '비밀번호(해시)',
    phone_number VARCHAR(20) NULL COMMENT '전화번호(선택)',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '가입일',
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일',
    PRIMARY KEY (id),
    UNIQUE KEY uk_member_email (email),
    UNIQUE KEY uk_member_nick (nick_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



use study;

CREATE TABLE board (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    board_type VARCHAR(20) NOT NULL,
    category VARCHAR(20) NOT NULL,
    view_count INT NOT NULL DEFAULT 0,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    writer_id BIGINT NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT fk_board_member FOREIGN KEY (writer_id)
        REFERENCES member(id)
);
INSERT INTO board 
(board_type, category, view_count, title, content, writer_id)
VALUES
('NOTICE','점검',132,'DB 서버 긴급 점검','데이터베이스 장애 대응 점검이 진행됩니다.',7),
('NOTICE','공지',98,'게시판 운영 정책 안내','게시판 이용 정책을 반드시 확인 바랍니다.',4),
('NOTICE','이벤트',210,'신규 회원 이벤트','회원가입 시 포인트 지급.',7),
('NOTICE','공지',76,'서비스 이용 약관 개정','개정된 약관이 적용됩니다.',2),
('NOTICE','점검',55,'API 서버 점검','외부 연동 API 점검 예정.',4),
('NOTICE','공지',64,'모바일 앱 출시','모바일 앱이 정식 출시되었습니다.',6),
('NOTICE','이벤트',143,'여름 할인 이벤트','여름 맞이 할인 진행.',2),
('NOTICE','점검',89,'네트워크 장비 점검','네트워크 교체 작업.',4),
('NOTICE','공지',45,'고객센터 운영시간 변경','운영시간이 조정되었습니다.',4),
('NOTICE','이벤트',187,'친구 초대 이벤트','초대 시 적립금 지급.',7),
('NOTICE','점검',101,'보안 패치 적용','보안 취약점 패치 진행.',6),
('NOTICE','이벤트',166,'리뷰 작성 이벤트','리뷰 작성 시 상품권 지급.',7),
('NOTICE','공지',52,'파일 업로드 정책 변경','업로드 용량이 변경되었습니다.',2),
('NOTICE','공지',39,'이메일 인증 의무화','보안 강화를 위한 정책.',4),
('NOTICE','점검',73,'백업 서버 점검','백업 무결성 점검.',4),
('NOTICE','이벤트',129,'가을 프로모션','가을 특별 할인.',2),
('NOTICE','공지',84,'NOTICE 게시판 개편','UI가 개선되었습니다.',4),
('NOTICE','점검',62,'로그 서버 점검','로그 수집 점검.',6),
('NOTICE','이벤트',98,'설문조사 이벤트','참여 시 쿠폰 지급.',2),
('NOTICE','공지',47,'알림 기능 업데이트','푸시 알림 기능 추가.',7),
('NOTICE','점검',91,'스토리지 증설 점검','저장소 확장 작업.',4),
('NOTICE','공지',58,'신규 카테고리 추가','게시판 카테고리 확장.',2),
('NOTICE','공지',33,'장기 미접속 계정 정리','휴면 계정 정리 예정.',4),
('NOTICE','이벤트',177,'겨울 감사 이벤트','연말 이벤트 진행.',6),
('NOTICE','점검',44,'CI/CD 서버 점검','배포 시스템 점검.',2),
('NOTICE','이벤트',111,'교육 수강 할인','강의 할인 제공.',7),
('NOTICE','공지',28,'운영자 연락처 변경','연락처가 변경되었습니다.',6),
('NOTICE','점검',53,'메일 서버 점검','메일 발송 지연 가능.',2),
('NOTICE','공지',67,'검색 기능 개선','검색 속도 향상.',4),
('NOTICE','이벤트',156,'굿즈 증정 이벤트','한정 굿즈 제공.',6),
('NOTICE','점검',36,'캐시 서버 점검','캐시 초기화 포함.',7),
('NOTICE','공지',41,'프로필 기능 추가','프로필 설정 가능.',4),
('NOTICE','이벤트',188,'출석 체크 이벤트','출석 시 포인트 지급.',4),
('NOTICE','점검',72,'인증 서버 점검','로그인 지연 가능.',2),
('NOTICE','공지',54,'서비스 안정화 작업','시스템 안정화 진행.',6),
('NOTICE','이벤트',134,'세미나 초청 이벤트','오프라인 초청.',4),
('NOTICE','점검',27,'이미지 서버 점검','이미지 로딩 지연.',7),
('NOTICE','공지',61,'보안 정책 강화','계정 보호 정책 강화.',4),
('NOTICE','공지',35,'이용 제한 정책 안내','정책 위반 시 제재.',6),
('NOTICE','이벤트',165,'SNS 공유 이벤트','공유 시 적립금.',2),
('NOTICE','점검',48,'로드밸런서 점검','트래픽 분산 점검.',4),
('NOTICE','공지',70,'공지 등록 정책 변경','공지 등록 기준 수정.',4),
('NOTICE','이벤트',162,'럭키 드로우 이벤트','추첨 경품 제공.',2),
('NOTICE','점검',63,'트래픽 모니터링 점검','모니터링 시스템 점검.',6),
('NOTICE','공지',29,'공지 작성 가이드','작성 기준 안내.',4),
('NOTICE','이벤트',120,'패키지 할인 이벤트','패키지 상품 할인.',2),
('NOTICE','공지',57,'서비스 점검 사전 안내','점검 일정 공지.',6),
('NOTICE','점검',38,'전체 시스템 점검','전사 시스템 점검.',4),
('NOTICE','이벤트',199,'신년 맞이 이벤트','신년 기념 혜택.',2),
('NOTICE','공지',46,'공지 노출 정책 변경','노출 기준 변경.',6),
('NOTICE','점검',82,'검색 서버 점검','검색 서비스 점검.',4),
('NOTICE','공지',31,'운영 공지 안내','운영 정책 공지.',7),
('NOTICE','이벤트',173,'마일리지 2배 이벤트','기간 한정 2배 적립.',4),
('NOTICE','공지',52,'서비스 기능 추가','신규 기능 업데이트.',4),
('NOTICE','점검',69,'세션 서버 점검','세션 정책 변경.',2),
('NOTICE','이벤트',148,'한정 특가 이벤트','24시간 특가 진행.',6),
('NOTICE','공지',37,'공지 템플릿 변경','공지 양식 개선.',4),
('NOTICE','점검',58,'클라우드 인프라 점검','클라우드 자원 점검.',2),
('NOTICE','이벤트',162,'버그 제보 이벤트','제보 포상 지급.',6),
('NOTICE','공지',43,'공지 자동화 기능 추가','공지 등록 자동화.',4);

