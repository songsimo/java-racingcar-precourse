# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
***

## 기능 요구 사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있음
* 각 자동차에 이름을 부여할 수 있음. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 함
* 전진하는 조건은 0에서 9사이에서 random 값을 구한 후 random 값이 5이상일 경우 전진하고, 3 이하의 값이면 멈춤
* 자동차 경주 게임은 완료한 후 누가 우승했는지를 알려줌
* 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력
* 사용자가 잘못된 값을 입력할 경우 "[ERROR]"로 시작하는 에러 메시지를 출력 후 입력을 다시 받음
***

## 기능 정의
### 자동차
* 이름
* 주행거리
* 엔진
- [ ] 시동: 0 ~ 9 숫자 생성
- [ ] 4 이상 전진, 3 이하 정지

### 입력화면
- [ ] 전진 시도 횟수
- [ ] 자동차 이름 목록

### 출력화면
- [ ] 자동차 이름 입력 메세지
- [ ] 시도할 횟수 입력 메세지
- [ ] 실행 결과 메세지
- [ ] 최종 우승자 메세지

### 진행요원
> 사용자 입력값 검증
- [ ] 자동차 이름 입력 검증(입력X, 공백X, 1자 이상, 5자 이하, 중복이름)
- [ ] 시도 횟수 입력 검증(숫자)
> 우승자 확인
- [ ] 우승자 확인
