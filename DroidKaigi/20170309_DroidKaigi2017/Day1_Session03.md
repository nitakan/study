# Day1_Session0X

## Session Info
* Title
Androidリアルタイム通信アプリ作成Tips

* Place
room3

* Speaker
@fushiroyama

## Description
ユーザが能動的に画面をリロードすることなく更新されていくリアルタイム通信型のアプリケーションはユーザに連続的な体験を提供することができます。
本セッションではスピーカーが過去に業務で利用したことのある次の3つのリアルタイム通信基盤を紹介し、それぞれの特徴や得意なこと不得意なことを紹介します。
・Socket.io (WebSocket)
・Firebase Realtime Database
・Realm Mobile Platform
また、リアルタイムに画面を更新する際のちょっとしたテクニックやTipsも合わせて解説します。

## Memo
* いいとこわるいとこ
    * いいとこ
    　リッチ
    * わるいとこ
    　むつかしい

* WebSocket
    HTTP拡張プロトコル
    2kB + payload
    OkHttp3.5でサポート
        okhttp:3.6.0
    Listener Callback
    通信内容はJson等
    String or Byte列
    軽くて薄い

    * Good Point
        Simple and Open Free
        Server hook Point
        Binary Support
        Can Scale
        Redis Pub/Sub

* Firebase
    * Realtime Database
      ローカルDBに書き込む
      見かけ上ローカルのみ
      DBが自動でSync
    * Security Rules
    * プラグイン
    * Listenerは2種

* Realm
    * Realm Mobile DB
    * Realm Mobile Platform
        * on place mis
    * Realm 3.0
        Offline Support
        Instuitive Query & Relation






* Realm
