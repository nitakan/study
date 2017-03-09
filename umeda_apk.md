# umeda.apk

## Session

### Androidのガイドラインについて


* Filebase


### @wasabeef

> Firebase

* Notifications
    * 一般的にはGCM
    * 今後FCMに移行
    * 導入は簡単
    * ApplyPluginは一番下に書いてGradleを進行
    * No codeでデフォルトならかける
    * DinamicLinks
    * AS2.2で自動的につくれるみたい
    * 未来は明るい
* Hosting
* Analytics
* Crash Reporting


### @ichien178

* Android Auto
    * Standaloneなスマホアプリ
        * 最適化されたUI
        * ナビゲーション
            * Maps
            * Entertainment
        * 今年後半
    * Android In Car
        * 車載用Androidを搭載した車
        * ２つの大画面IF
        * 車も一つのデバイス
    * OK Googleの対応

* AR/VR : Project Tango
    * from 2012
    * ハードウェア
    * Lenovo Phone
        * Phab2 Pro
    * TangoAPIはAndroidNで組み込まれている

* AwarenessAPI
    * UX on Mobile
    * ユーザーのコンテキストを判断して最適な活動を支援する
    * Context Awareness
    * 違和感がないApp間連携
    * システム管理・組み合わせをより簡単に
    * UnifiedSensingPlatform
    * ２種類のAPI
        * Fence API
        Callback型のAPI
        「運転開始」のようなリアルのイベントを定義できる
        複数のFenceを論理演算を行い、新しいFenceができる
        BroadcastReceiverを使い受け取る
        * SnapshotAPI
        情報をActiveに取得

### @satorufujiwara

> 181

GoogleI/Oの公開セッション数

[時間がないAndroid開発者のためのGoogle I/O 2016セッションまとめ](http://qiita.com/satorufujiwara/items/b68cf90341f691029798)

* 現在の話
* 近い将来の話
* 未来の話
* ATAP
    * Google内の最先端
    * ６つのプロジェクト
    * 今回は４つ
        * Project Jacquard
        電子繊維を組み込んだ衣服やジャケット
        * Project Soli
        センサーで指の状態を認識する
        * Project Ara   
        デバイスを組み合わせる
        * Project Spotlight
        物語を作る？

### @yokomaku

> Drivemode
Android App for Driving.


Application Requirements

* Activity
    * UI Event Handling
    * System service call
    * AsyncTaskLoader
    * UI State management
    * Lifecycle
    * Burrito Architecture
    しんどくなるようなアーキテクチャ
    * Practices
        * MVC
        * MVVM
        * ...
    which one will we select...


* Single Responsibillity Principle
* Clean Architecture

Model as a Bento

Clean architecture
* Rx
