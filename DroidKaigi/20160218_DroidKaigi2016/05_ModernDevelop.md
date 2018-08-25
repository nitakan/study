# Dagger2とRealmを使ったモダンな開発
@experopero
北村涼

## フレームワークからロジックを切り離す
AndroidのLifecycleから切り出す

どこにかくか

* ロジックの抽象化したクラス

どこで実体化するか

* DI
	* 素朴なDIはしんどい
* DIコンテナ
	* RoboGuice
	* Dagger Square
	* Dagger2 google

* Dugger2
	* コンパイル時に生成し依存解決

### 永続化
WebAPIからのレスポンスを永続化

* キャッシュ
* Activity/Fragmentの復帰

手段
　
* Fileに書き出す
* SQLite
	* 安心感
	* めんどくさい
	* ORM
使いやすさ、速さ、安定性、将来性…
	
* Realm
	* 開発が活発
	* めんどくない
	* ver1.0 ↓
	* iOSとAndroidで共通のモデルを持ちたい
	* なにかあってもなんとかなるだろう

SQLiteに代わるModileDB
ORM


### 別スレッドでのInject
Dagger2のProvider


## サーバーサイドと並行した開発
* ダミーのレスポンスを返すダミーサーバー
* テストでもダミーサーバーを見る


## あ
fastlane
Slack連携




