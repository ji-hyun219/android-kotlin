# android-kotlin
앱 8개를 만들면서 배우는 안드로이드 코틀린

&nbsp

### 📱 Splash Screen
AndroidManifest.xml 파일에서 첫 화면 (Splash Screen) 을 세팅할 수 있다
.SplashActivity 안에 intent-filter 에다가
`android.intent.action.Main`, `android.intent.categoty.LAUNCHER` 를 넣으면 앱을 킬 때 맨 처음 화면으로 세팅이 된다

&nbsp

### 🤸🏻‍ Handler 에 대해서 알아보자
안드로이드는 백그라운드에서 실행되어야 하는 기능을 서비스라는 애플리케이션 구성요소로 정의한다. 
하지만 별도의 프로세스가 아닌 동일한 프로세스 내에서 위의 문제를 해결하려면 
`하나의 프로세스 안에서 여러 개의 작업이 동시 수행되는 멀티 스레드 방식`을 사용할 수 있다. 
스레드는 동시 수행이 가능한 작업 단위이며, 현재 수행되는 작업 이외의 기능을 동시에 처리하고자 할 때 
새로운 스레드를 만들어 처리할 수 있다.

&nbsp

이러한 멀티 스레드 방식은 같은 프로세스 안에 들어 있으면서 메모리 리소스를 공유하게 되므로 
효율적인 처리가 가능하지만 동시에 리소스를 접근할 경우에 `데드락`이 발생하여 
시스템이 비정상적으로 동작할 수 있다

&nbsp

안드로에드에서 UI 처리를 위해 사용되는 기본 스레드는 `'메인 스레드'`라고 부른다. 
이 메인 스레드에서 이미 UI 에 접근하고 있으므로 
새로 생성한 다른 스레드에서는 `핸들러 객체`를 이용해 메시지를 전달함으로써 
메인 스레드에서 처리하도록 만들 수 있다.

&nbsp

동시 접근에 따른 데드락 문제를 해결하는 가장 간단한 방법은 작업을 순서대로 처리하는 것이다. 
이 역할은 `메인스레드의 핸들러`가 담당하여 처리한다

&nbsp

앱을 실행할 때 `프로세스가 만들어지면 그 안에 메인 스레드가 함께 만들어지고 `
최상위에서 관리되는 애플리케이션 구성 요소인 액티비티, 브로드캐스트 리시버 등과 
새로 만들어지는 윈도우를 관리하기 위한 `메시지 큐(Message Queue)를 실행`하게 된다. 

&nbsp

이 메시지 큐를 이용해 순차적으로 코드를 수행할 수 있으며, 
`이렇게 메시지 큐를 이용해 메인 스레드에서 처리할 메시지를 전달하는 역할을 담당하는 것이 핸들러 클래스`이다.
결국 핸들러는 실행하기를 원하는 특정 기능이 있을 때 
핸들러가 포함되어 있는 스레드에서 순차적으로 실행시킬 때 사용하게 된다. 
핸들러를 이용하면 `특정 메시지가 미래의 어떤 시점에 실행되도록 스케줄링`할 수도 있다.

&nbsp

![](../../../var/folders/km/ctmbcr9d0yv2wc_584gld7p00000gn/T/TemporaryItems/NSIRD_screencaptureui_m976XA/스크린샷 2023-03-19 오전 10.19.08.png)