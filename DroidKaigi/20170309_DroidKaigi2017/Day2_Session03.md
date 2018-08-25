# Day1_Session0X

## Session Info
* Title
Kotlin + RxJava + Dagger2 + Orma + Retrofit で作るAndroidアプリ

* Place
room3

* Speaker
@lvla0805

## Description
対象: 初心者〜中級者

- Kotlin(Language)どうなの?
- RxJava(ReactiveProgrammingFramework)どうなの?
- Dagger2(DependencyInjection)どうなの?
- Orma(ORMapper)どうなの?
- Retrofit(HttpClient)どうなの?

そんな疑問にお答えします。
(個人的には)もはやこの5つのソフトウェアはAndroidアプリケーション開発において無くてはならない存在です。
これらを利用したAndroidアプリケーションの作り方を紹介したいと思います。

目次(予定)
- 各ソフトウェア軽い紹介
    - Kotlin?
    - RxJava?
    - Dagger2?
    - Orma?
    - Retrofit?
- DroidKaigi2016公式アプリのコントリビューター一覧画面を作ろう
    - RetrofitをつかってApiClientを実装しよう
    - OrmaをつかってDaoを実装しよう
    - Daggerを使って依存性を注入しよう
    - ApiClientとDaoを束ねるRepositoryをつくろう
    - UseCaseをつくろう
    - Presenterをつくろう

## Memo
* Orma, retrofit, service
    毎回作るのは無駄なのでSingletonにする

* Dagger2
    Providesは既に定義されていると引数に使える
