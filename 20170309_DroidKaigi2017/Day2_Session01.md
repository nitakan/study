# Day1_Session0X

## Session Info
* Title
Android ORMの選び方

* Place
room3

* Speaker
@gfx

## Description
対象: 初心者~中級者向け

Android ORMは古くて新しいテーマです。以前はActiveAndroidやGreenDAO、そしてORMLiteくらいしか選択肢がありませんでしたが、近年は綺羅星のごとく新しいライブラリが次々に生まれています。また2016年3月に1.0となったRealmというSQLiteベースでないORMも人気を博しています。また発表者はOrmaというORMを開発しており、ORMには一家言ある開発者です。

さて、このORM百花繚乱というこの状況は多様性という意味では喜ばしいものですが、逆に選択肢が多すぎて選択するのが難しいという状況となっています。その結果、もっとも著名なORMである、しかし今やメンテナンスされていない古いライブラリであるActiveAndroidが使われ続けるということも少なくないようです。これは大変残念です。

このセッションでは、Realmを含むさまざまなORMを、インターフェイス・マイグレーション・パフォーマンスについて比較検討します。本セッションがORM選択の一助となれば幸いです。

### アウトライン（仮）

* なぜORMが必要か
	* ORMは怖くない
	* リソースのキャッシュ
	* ローカルのデータストア
* 素のSQLiteDatabaseの基本
* ライブラリ一巡り
	* Simple Helpers
		* ORMLite
		* SQLBrite
		* SQLDelight
	* O/R Mappers for SQLiteDatabase
		* ActiveAndroid
		* GreenDAO
		* DBFlow
		* Requery
		* Orma
	* Non-SQLite Databases
		* Realm
* インターフェイスの詳細比較
* パフォーマンスの詳細比較
* マイグレーションの詳細比較

## Memo
* SQLite3
* ORM
    * O/R Mapper
        `RDBMS <-> Java Plain Object`
    * Query Builder
        SQLを生成する
        * equals("title",title)
        * equals(TODO_TABLE.title, title)
            型安全、typo防止
        * titleEq(title)
            カラム名わかってるなら生成しちゃえ

    * Pub/Sub
    通知
