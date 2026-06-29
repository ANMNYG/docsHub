# docsHub
마크다운(Markdown) 기반 개발 템플릿 및 API 문서 자동화 저장소

# 📝 Docs-Hub (vibe-docs)
> **"Swagger JSON만 던지세요. 가장 힙한 마크다운 API 명세서로 바꿔드립니다."**

개발자들은 협업을 위해 API 명세서를 작성하지만, Swagger UI는 가독성이 떨어지고 노션이나 깃허브 위키에 마크다운으로 직접 옮겨 적는 것은 매번 귀찮고 반복적인 일상적 불편함(Pain Point)을 유발합니다. 
**Docs-Hub**는 이 불편함을 해결하기 위해 Swagger/OpenAPI Spec을 단 1초 만에 깔끔한 Markdown 문서로 파싱 및 변환해 주는 개발자 전용 생산성 유틸리티 툴입니다.

---

## 🔥 Key Features (MVP)
* **Swagger/OpenAPI 3.0 파싱 엔진:** 복잡한 API 구조(JSON)를 완벽하게 자바 객체로 맵핑 및 가공
* **Markdown 테이블 자동 조립:** API 엔드포인트, HTTP 메서드, 응답 상태 코드(Responses)를 가독성 높은 마크다운 표 형태로 자동 변환
* **보안 취약점 제어:** 의존성 주입 과정에서 발생한 이행적 종속성(Transitive Dependency, Rhino DoS 취약점 CVE-2025-66453)을 `exclude` 전략으로 완전히 제거하여 안전한 인프라 구축

---

## 🛠️ Tech Stacks
* **Backend:** Java 21, Spring Boot 4.0.7, Spring Web, Spring Data JPA
* **Libraries:** Swagger-Parser 2.1.22
* **Security:** Spring Security, OAuth2 Client (GitHub/Google 로그인 확장 예정)
* **Database:** MySQL (추후 템플릿 저장 기능 연동 예정)

---

## 🏗️ Architecture & Core Logic (MVP)

현재 MVP 단계에서는 별도의 DB 연동 없이, 오직 백엔드의 **'파싱 및 변환 성능'**에만 집중하는 고성능 컨버터 구조를 가집니다.
