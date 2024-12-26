<div align="center">
<img src="https://github.com/user-attachments/assets/fa45d546-5903-4208-b533-8c516b011636"></br>
'Curevengers'의 풀스택 기반 Final 프로젝트</br>
<h3>"작은 관심에서 오는 큰 건강!"</h3>
</div>

<!-- <h3>-Spring framework의 MVC 패턴을 기반으로 한 Spring boot 웹 서비스 개발-</h3></br> -->
<div>
<hr>
<h3>📋 1. 프로젝트 소개</h3>
<h4>(1) 💁‍♀ 제작 기간 및 주제 선정 </h4>
<!-- 팀원 - 총 4명</br> -->
기간: 2024.11.18 ~ 2024.12.16 (총 28일, 4주)</br></br>
기획 배경: </br>
현대 사회에서 건강에 대한 관심은 높아졌지만, 
<b>"AHA 조사 결과, 한국이 50개국 중 뒤에서 5번째로, 건강에 대한 인식은 여전히 부족한 상황"</b>입니다. </br>
따라서,
❓개인의 건강관리 항목들을 전문으로 체크 해주고 관련 병원까지 연계함과 동시에, 관련 정보에 대하여 소통할 수 있는 장소를 제공해 주는 서비스가 있다면❓</br> 
<b>= >"건강에 대한 인식이 높아지고 관리 소홀 문제가 해결되어, 결과적으로 건강한 사회가 만들어질 수 있다고 생각"</b>하여 우리들만의 서비스를 개발하고자 하였습니다. </br></br>
주제: <b>"개인 건강관리 맞춤 제공 서비스를 통한 사회적 인식 개선과 건강 증진을 위한 서비스 개발"</b></br>
<h4>(2) 💡 서비스의 기대효과 </h4>
많은 사람들이 현재 개인의 건강상태에 대해 보다 잘 인지하며 
그에 맞는 관리법 및 추천 병원의 방문을 통하여 다양한 질병을 초기에 예방할 수 있을 것입니다.</br>
또한, 건강상태, 우울증과 관련된 고민과 경험을 안전하고 신뢰감 있게 공유할 수 있는 게시판의 운영으로, 다양한 건강 관련 정보와 정서적 지지를 얻고 고립감을 해소할 수 있을 것으로 기대합니다.
</div>
</br>
<h4>(3) 👪 팀원 소개 및 역할</h4>
총 인원: 4명
<markdown-accessiblity-table data-catalyst=""><table>
<thead>
<tr>
<th align="center"><img src="https://github.com/user-attachments/assets/0830b381-6136-4f03-a09f-80a3cbcef0c8" alt="연정"></th>
<th align="center"><img src="https://github.com/user-attachments/assets/e5ccb7c2-fd7f-4fcf-9c1e-5a6615e5b219" alt="현건"></th>
<th align="center"><img src="https://github.com/user-attachments/assets/e55b478d-b952-4464-ad35-6d429b1768d6" alt="진석"></th>
<th align="center"><img src="https://github.com/user-attachments/assets/af1c97ca-3d6e-42ce-9aa4-a065b8fd94a0" alt="율"></th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a href="https://github.com/Younjung58">박연정</a></td>
<td align="center"><a href="https://github.com/dlgusrjs940701">이현건</a></td>
<td align="center"><a href="https://github.com/JinSeok0916">최진석</a></td>
<td align="center"><a href="https://github.com/Yunyul841">윤 율</a></td>
</tr>
<tr>
<td align="center">팀장</td>
<td align="center">팀원</td>
<td align="center">팀원</td>
<td align="center">팀원</td>
</tr>
<tr>
<td align="center">DB설계 및 ERD작성<br>News, Daum API 설계 및 개발<br>spring security 및 소셜로그인 구현<br>디버깅 및 리팩토링</td>
<td align="center">DB설계 및 ERD작성<br>게시판 전반적 기능 구현<br>엑셀-pdf다운로드 구현</td>
<td align="center">DB설계 및 ERD작성<br>건강검진 기능 및 결과지 구현<br>kakao map API 설계 및 개발</td>
<td align="center">DB설계 및 ERD작성<br>전박적 view의 제작<br>kakao map API 설계 및 개발</td>
</tr>
</tbody>
</table></markdown-accessiblity-table>
<h3><a href="https://docs.google.com/spreadsheets/d/1uosjk0E-rJUSYmFzgP4EMhxqU1z50nODCKyZT_XGQNA/edit?usp=sharing">더욱 자세한 담당 업무 및 기간은 WBS를 참고해주세요😊😊</br>(누르면 이동이 가능합니다.)</a></h3>

<hr>
<h3>💊 2. 주요 기능 및 설계</h3>
<h4>(1) Main화면의 기본 디자인 설계</h4>
<img src="https://github.com/user-attachments/assets/f5b786b0-7173-4c7a-b337-91ae8bf050c0">
<h4>(2) 요구사항 보러가기!</h4>
<a href="https://docs.google.com/spreadsheets/d/16US4o8_Yy0UbsYzRZtFX-uC85ofW8f5_WLkOHVndZIU/edit?gid=0#gid=0">-> 과연 어떤 기능들을 구현할 것인가????</a>
<h4>(3) 어떤 기술들을 실제 구현해보았나?</h4>
<spna>1. <b>View</b>의 제작</br>
         &nbsp;&nbsp;&nbsp; : html5, CSS3, Bootstrap를 사용한 정적디자인 / 타임리프, JSP를 사용한 동적 렌더링 /</br>
         &nbsp;&nbsp;&nbsp; JavaScript를 이용한 이벤트 핸들러처리, 테이블 형성 및 document의 요소 동적 생성 구현</spna>
<div>2. 사용한 <b>API</b>는?? </br>
  : 카카오 Map Api를 통한 건강 맞춤 추천 병원 지도를 구현 / Daum Api를 통한 주소 검색 기능 구현 / Kakao Api 통한 소셜 로그인 /
  &nbsp;&nbsp;&nbsp;News Api 통한 메인화면에 건강관련 뉴스코너를 구성</div>
<div>3. <b>백엔드</b>의 구현 (크게 5가지로 분류) </br>
  - 3-1. 로그인: spring security통한 authority부여, 인증과 인가정책, oauth2 라이브러리 통한 소셜 로그인 구현, 유저디테일 및 핸들러의 커스텀</br>
  - 3-2. 회원가입: ajax를 통한 비동기 방식 구현(아이디 중복체크, 비밀번호 유효성 체크 등), spring-boot-starter-mail 라이브러리를 통한 이메일 인증 구현, Daum Api를 통한 주소 검색 및 저장 기능</br>
  - 3-3. 게시판: 타임리프 통한 동적 화면 구성, 추천-신고 기능등의 비동기 구현, 댓글 작성 및 수정의 암호화된 비밀번호 인증 처리, 페이징구현, 추천순-최신순으로의 데이터베이스 커스텀, 파일 첨부기능</br>
  - 3-4. 마이페이지: 최근 활동 정보 출력을 위한 데이터 정제 및 추출, JS의 테이블 tr-td 생성으로 화면 동적 생성, 회원의 정보 수정 및 삭제를 위한 2차 인증절차 및 url로의 접근 제한 구현</br>
  - 3-5. 관리자모드: spring security통한 authority부여, JS의 테이블 tr-td 생성으로 화면 동적 생성, 관리자가 조회할 수 있는 데이터의 커스텀 및 정제</br>
<hr>
<h3>💻 3. 개발 환경</h3>
⚙️ 개발 환경
<div display="inline">✅FRONTEND : <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white"><img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white"><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white"><div align="center"><img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=Thymeleaf&logoColor=white"><img src="https://img.shields.io/badge/Bootstrapap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white"/><img src="https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white"/><img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white"></div>
  <br></div></br>
<div display="inline">
✅BACKEND : <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"><img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white"><img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=Spring Security&logoColor=white"><img src="https://img.shields.io/badge/Apache Tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=black"/><img src="https://img.shields.io/badge/MyBatis-000000?style=for-the-badge&logo=MyBatis&logoColor=white"> 
</div></br>
<div display="inline">
✅DATABASE : <img src="https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariaDB&logoColor=white"/><img src="https://img.shields.io/badge/dbeaver-gray?style=for-the-badge"></div></br>
<div display="inline">
✅IDEs : <img src="https://img.shields.io/badge/IntelliJ%20IDEAE-000000?style=for-the-badge&logo=EclipseIDE&logoColor=white" /><img src="https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=VisualStudioCode&logoColor=white"/><img src="https://img.shields.io/badge/Eclipse%20IDE-2C2255?style=for-the-badge&logo=EclipseIDE&logoColor=white" />
</div></br>



  <h3>해당 과정을 통하여 프로젝트를 진행하고, 최종적으로 PPT를 제작하였습니다. </br>(ppt링크 하단 첨부)</h3>
  <h5>https://www.canva.com/design/DAGZVvxtMYA/wBKJnaE-GkslEEP4kNPlJA/edit?utm_content=DAGZVvxtMYA&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton</h5>
