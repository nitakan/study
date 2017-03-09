# 明日、敗訴しないためのセキュアコーディング
@kengoscal

## AndroidにおけるSecureCoding

## 背景
* A社 発注側
* B社 受注側
情報流出→B社が敗訴


## Androidにおけるセキュアコーディングは必要なのか
IPAがAndroid脆弱性チェックツール
訴訟リスク回避のため、Androidでもするべき

* 脆弱性 = バグ
	* 品質の向上
	* ユーザー体験の向上
* ユーザー体験のことを考えるならば、やるべきかもしれない

## どこからはじめる？

* Android Security
* Androidアプリのセキュア設計・セキュアコーディングガイド

### 課題
Android SCの範囲は広い！

* Build Security In

### 設計フェーズ
* SCそのものではない
* 脅威と脆弱性の把握
	* Permission
	* 3rd Party製の広告ツール
	* データの保管
	* WebView
	* etc

### 実装フェーズ
* あるある系
	* https
	* LogCat
	* ファイル暗号化漏れ
	* WebView
	
### 運用フェーズ
* keystore 秘密鍵の保存


 
## まとめ
> セキュリティは品質
