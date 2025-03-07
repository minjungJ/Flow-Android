![](https://user-images.githubusercontent.com/100260416/220561044-df2a16d8-2180-43dd-8e75-d3056265c415.png)

## Introduction
**[ 2023 UMC 데모데이 최우수상 수상작 ]**  

**더치페이 과정**에서 돈을 송금하고, 송금받으며 생성된 여러개의 내역을 통합하여 </br>
**실질적인 소비 금액**을 분석하는 서비스입니다.

## Features
<img src="https://user-images.githubusercontent.com/52921222/222952521-38e0b957-07c8-47c2-9476-a4872bfc3c91.png" width="700" height="400"/>
<img src="https://user-images.githubusercontent.com/52921222/222952539-20e9335f-7e26-4c50-b191-ef0f61aa215e.png" width="700" height="400"/>
<img src="https://user-images.githubusercontent.com/52921222/222952557-d81b750a-c6ae-415d-8400-7ba65a52e71e.png" width="700" height="400"/>

## How to use
#### 시작 화면
- 화면 스와이핑, 혹은 버튼 클릭으로 온보딩 화면 전환
- 건너뛰기 클릭 시, 로그인 화면으로 전환
- 카카오, 네이버, 구글 중 하나를 선택하여 로그인 가능

<img src="https://github.com/minjungJ/Flow-Android/assets/52921222/f001834b-65dd-42b4-926e-b5c449ae9fb3" width="300" height="650"/>

#### 홈 화면
- 이번달 예산의 몇프로를 소비했는지, 그리고 저번달과의 소비금액 비교 분석을 제공
- 분석의 기준이 되는 예산 금액과 시작일 변경 가능
  
<img src="https://github.com/minjungJ/Flow-Android/assets/52921222/31dfba9f-d38e-4f53-81df-2d526d31e4bd" width="300" height="650"/>

#### 내역 화면
- 내역을 long Click하여 선택 가능
- 통합하기 버튼 클릭 후, 대표내역을 선택하면
대표내역의 정보와 통합된 가격으로 통합된 내역이 보여짐
- 통합할 내역 리스트에 이미 통합된 내역이 포함된 경우엔,
이미 통합된 내역의 통합 목록에 있던 내역 모두가 새로 지정된 대표 내역으로 다시 통합됨
- 통합된 내역을 클릭하여 통합 목록에 있는 내역 확인 가능
- 삭제하기 버튼 클릭 시 내역이 삭제되며,
통합된 내역을 삭제할 경우엔 통합 목록에 있는 내역 모두가 함께 삭제됨

<img src="https://github.com/minjungJ/Flow-Android/assets/52921222/0b3ad81d-ad54-4241-982a-d9f13f70b127" width="300" height="650"/> <img src="https://github.com/minjungJ/Flow-Android/assets/52921222/05127258-05cc-4a7a-a232-a6ab4bec5cbc" width="300" height="650"/> <img src="https://github.com/minjungJ/Flow-Android/assets/52921222/e3b081de-67a1-4cc7-aac5-9c03b33f5e18" width="300" height="650"/>


#### 캘린더 화면
- 오늘 날짜 표시
- 날짜별 총 수입·지출금액 확인 가능
- 날짜를 클릭하면 내역 목록 확인 가능
- 내역을 클릭하면, 내역 상세정보 조회 및 카테고리 수정 가능

<img src="https://github.com/minjungJ/Flow-Android/assets/52921222/f92dd671-3f3d-4b18-a56f-505af67dd7a9" width="300" height="650"/>


#### 설정 화면
- 예산 금액 및 시작일 변경 가능
- 수입·지출 카테고리 추가 가능
- 기본 수입·지출 카테고리의 경우, 삭제와 수입·지출 여부 변경이 불가하며 이름 수정만 가능.
- 사용자가 생성한 수입·지출 카테고리의 경우, 삭제와 이름 수정, 수입·지출 여부 변경 가능
- 이미 존재하는 카테고리에 동일한 이름이 있는 경우, 이름 수정이 불가함
  
<img src="https://github.com/minjungJ/Flow-Android/assets/52921222/605ccf82-fb8b-47fb-b623-f4d6f9067ac2" width="300" height="650"/>

## Library
- Kotlin
- Android Studio
- RoomDatabase
- retrofit2
- viewpager2
- kakao, naver, google login

## ERD
![Flow-Android (1)](https://user-images.githubusercontent.com/52921222/222953529-9c9131b4-23ed-47bc-931c-bdd460ab1fad.png)

## Landing Page
[랜딩 페이지 바로가기](https://makeus-challenge.notion.site/Flow-cbaffda62eb149a2b0336470ce551456)

