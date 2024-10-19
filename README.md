# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 목록

1. [x] 로또 구입 금액 입력 기능
    - 구입 금액을 입력받고 로또 구매 개수를 계산
2. [x] 로또 발급 기능
    - Collections.shuffle()을 사용해 로또 번호를 자동으로 생성
    - 생성된 로또 번호는 오름차순 정렬 (Collections.sort() 메소드 활용)
3. [x] 당첨 번호 입력 기능
    - 지난 주 당첨 번호를 입력할 수 있다 (6개)
4. [x] 로또 당첨 결과 확인 기능
    - 구매한 로또와 당첨 번호를 비교해 일치하는 번호 개수 계산 (ArrayList의 contains() 메소드 활용)
5. [x] 수익률 계산 기능
    - 당첨된 로또에 따라 수익률 계산
6. [x] 결과 출력 기능
    - 당첨 통계, 수익률을 출력
