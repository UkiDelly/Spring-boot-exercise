# Spring Boot 실습 프로젝트

## 디펜던시 목록

1. `spring-boot-starter-devtools`

서버를 재시작하지 않고도, 코드 변경시 자동으로 서버를 재시작하게 해주는 디펜던시

2. `spring-boot-starter-actuator`

모니터링을 위한 디펜던시로, 다음과 같은 기능을 제공해준다

- 엔드포인트 제공
    1. 스프링에 등록된 `Bean` 리스트를 확인할수 있는 엔드포인트 제공
    2. 현재 애플리케이션의 상태 정보를 알수 있는 엔드 포인드 제공
    3. metrics 엔드포인트 제공
    4. 요청 매핑 관련 세부사항을 확인할 수 있는 엔드포인드 제공

---

## Spring Framework

Spring은 의존성 주입이 전부이다. 의존성을 식별하여 자동으로 연결해주는 프레임워크이다

- @Component, @Autowired,

그냥 의존성 주입을 한다고 해서 어플리케이셔을 만들수 없다. 어플리케이션을 만들기 위해선 다른 프레임워크도 사용해야 한다.

예를 들어

- DB와의 통신을 위해서는 Hibernate 또는 JPA가 필요하다.
- 단위 테스트를 작성하기 위해서는 Junit과 Mockito가 필요하다.

Spring은 Spring Models과 Spring Project로 인해 생태계를 확장하고 있다. 이를 통해 다른 프레임워크와 잘 통합할 수 있다.

## Spring MVC

Spring Module의 한 종류로, 웹 어플리케이션과 REST API의 빌드 과정을 간소화 해주는 것이다. Spring MVC 이전에는 Struts를 사용했지만 빌드 하는 과정이 매우 복잡했다.

Spring MVC는 더 나은 빌드 방법을 제공해주고, @RestController, @Service, @Repository, @RequestMapping와 같은 스테레오 타입의 빈 어노테이션을 제공해준다.

## Spring Boot

Spring은 프로젝트를 시작하면 pom.xml, web.xml, application.xml 등등의 여러 가지 설정을 해줘야하고, 이런 설정은 오래 걸리고 복잡하다. 그래서 Spring Boot가 탄생하였다.

Spring Boot는 Spring Project중 하나이다. 목표는 프로덕션 환경에 사용이 가능한 어플리케이션을 빠르게 빌드하도록 지원하는 것이다. Spring Boot의 가장 큰 장점은 Starter 프로젝트들과
자동으로 설정을 해주는 것이다.

예를 들어

- 웹 어플리케이션을 개발하는 경우, web starter를 추가하여 어플리케이션 개발에 필요한 모든 의존성과 설정을 자동으로 할수 있다.
- 비기능 요구사항도 설정해준다. (모니터링, 로깅, 에러 핸들링 등등)