# 用途に合わせたアニメーションの実装方法
@cattaka_net
住友さん

## Androidのアニメーション

アニメーションの対象

* Viewの中身
* View
* レイアウトを切り替える

### Viewの中身を動かす
#### Animation Drawable

* パラパラアニメ
* 複数画像とXMLで指定

#### Animated Vector Drawable

* XMLでSVGを作成
* XMLでSVGの動きを制御

### View自体を動かす
#### View Animation

* 移動・回転・スケール・透過
* XMLで動きを定義
* コードで実行
* 動いても実体は元の場所にある

#### Property Animation

* ObjectAnimator
	* XML + Coding
	* F/Wがリフレクションでプロパティ値を設定する
	
* ViewPropertyAnimator
	* 簡潔な記述

### 複数のView

#### Activity Animation
* xml + coding
* 使ったView

#### Fragment Animation
* SupportLibraryをつかう
	* View animation をつかう
* SupportLibraryを使わない
	* Property Animation を使う
	
#### Transition
* 前後の画面で共通のView
* 前のみのView
* 後のみのView
* XML + Coding
* 複数の動きをする場合、TransitionSetを使う

#### Actibity Transition
* XML + Coding
* 遷移の前後で共通要素を指定
* 共通要素の入出の動きを指定

#### Fragment Transition


## まとめ
* アニメーションの仕組みは多い
* 場合にあったアニメーションを使う