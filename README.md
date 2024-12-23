교육 과정 기간에 학습한 풀스택 기반의 Final 팀 프로젝트를 진행하였습니다.</br>
<h3>-Spring framework의 MVC 패턴을 기반으로 한 Spring boot 웹 서비스 개발-</h3></br>
팀원 - 총 4명 / 직책 - 팀장</br>
기간: 2024.11.18 ~ 2024.12.16 (총 28일)</br>
주제: 개인 건강관리 맞춤 제공 서비스를 통한 사회적 인식 개선과 건강 증진을 위한 서비스 개발</br>
주제 선정의 목표: </br>
전공 및 의료 경력으로 쌓은 지식과 관련 전문 사이트를 참고하여 누구나 쉽게 자신의 건강을 이해하도록 도와줄 수 있는 우리만의 서비스를 구축해보자!
</br></br>
<h4>사용한 기술 스택</h4>
: Spring boot, Intellij, MariaDB, DBeaver, Mybatis, Visual Studio Code, Git</br>
</br>
<h4>어떤 기술들을 실제 구현해보았나?</h4>
<spna>1. View의 제작</br>
         &nbsp;&nbsp;&nbsp; : html5, CSS3, Bootstrap를 사용한 정적디자인 / 타임리프, JSP를 사용한 동적 렌더링 /</br>
         &nbsp;&nbsp;&nbsp; JavaScript를 이용한 이벤트 핸들러처리, 테이블 형성 및 document의 요소 동적 생성 구현</spna>
<div>2. 사용한 API는?? </br>
  : 카카오 Map Api를 통한 건강 맞춤 추천 병원 지도를 구현 / Daum Api를 통한 주소 검색 기능 구현 / Kakao Api 통한 소셜 로그인 /
  &nbsp;&nbsp;&nbsp;News Api 통한 메인화면에 건강관련 뉴스코너를 구성</div>
<div>3. 백엔드의 구현 (크게 5가지로 분류) </br>
  - 3-1. 로그인: spring security통한 authority부여, 인증과 인가정책, oauth2 라이브러리 통한 소셜 로그인 구현, 유저디테일 및 핸들러의 커스텀</br>
  - 3-2. 회원가입: ajax를 통한 비동기 방식 구현(아이디 중복체크, 비밀번호 유효성 체크 등), spring-boot-starter-mail 라이브러리를 통한 이메일 인증 구현, Daum Api를 통한 주소 검색 및 저장 기능</br>
  - 3-3. 게시판: 타임리프 통한 동적 화면 구성, 추천-신고 기능등의 비동기 구현, 댓글 작성 및 수정의 암호화된 비밀번호 인증 처리, 페이징구현, 추천순-최신순으로의 데이터베이스 커스텀, 파일 첨부기능</br>
  - 3-4. 마이페이지: 최근 활동 정보 출력을 위한 데이터 정제 및 추출, JS의 테이블 tr-td 생성으로 화면 동적 생성, 회원의 정보 수정 및 삭제를 위한 2차 인증절차 및 url로의 접근 제한 구현</br>
  - 3-5. 관리자모드: spring security통한 authority부여, JS의 테이블 tr-td 생성으로 화면 동적 생성, 관리자가 조회할 수 있는 데이터의 커스텀 및 정제</br>
