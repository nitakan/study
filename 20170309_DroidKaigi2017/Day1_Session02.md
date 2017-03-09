# Day1_Session0X

## Session Info
* Title
minneにおけるテスト〜リリース〜リリース後にやっている事の紹介

* Place
room1

* Speaker
@mapyo

## Description
■対象者
初級〜中級者
テストやリリース周りの仕組を整備していきたいと考えている人
リリース後のクラッシュ対応、レビュー対応について検討している人


■概要
僕が所属しているminneではAndroidチーム３人で開発しています。
複数人数で安定的にアプリをリリースしていく為には、テスト〜リリースまでの仕組を整える事が必要になってきます。
また、レビューの良い評価を維持していくために、レビューの対応についても実際にやってきた事を含めながらお話していきます。

具体的には、以下の内容を発表します。

- リリースフローにテストをどう組み込んでいるか。
- テストの種類
 - 自動的テスト
    - Unit test
    - UI test
    - CI
 - 手動テスト
    - 手作業による検証
- 構築しているCI環境の仕組紹介
 - Drone.io
 - DeviceFarm
 - Slack
- リリース前の検証について
 - リリース担当
 - 検証シート作成
 - DeployGate
- リリース
 - 段階的公開
 - Crashlytics
- リリース後
 - クラッシュ監視
 - レビューの監視
 - レビュー返信の体制

## Memo
* サイクル
　スプリント計画→リリースまで２週間

* テスト
    * Unit Test
        * Local Unit Test
        　JVM上
        　Robolectric
        * Instrument Test
        　
    * UI Test
    　Espresso
    * 検証
* CI
    * Drone
        CIとUnit Test
    * AWS Device Farm
        実機を用いたテストができる
        apkをアップ

* リリース
　* Issuesで管理
　* DeployGateで配布

* リリース後
    * Crashlytics

* 振り返り
　Keep-Good/Problem/Try


* リリース後の負の連鎖
