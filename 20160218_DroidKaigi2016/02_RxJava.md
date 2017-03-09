# 明日から使えるRxJava頻出パターン

* speaker   
`@kazy`

* hashtag   
`#droidkaigiA` 


RxJava導入している人、3割くらい

## 非同期時代の課題
* getActivity == null 問題
* コールバック処理でヌルポ
* 並列化/直列化で複雑に…

## RxJava頻出パターン
### 準備/理解
add to build.gradle

Observable化する


### 非同期
> Observableに同期/非同期実行の概念はない

* subscribeOn

* observeOn
指定された行より下が指定されたスレッドで実行される

```
.map()
.subscribeOn()
.observeOn()
.observe()

```

getActivity() == null問題

-> trello/RxLifeCycleを使って対応

```
.compose(bindToLifecycle())
```
Activityが無い場合、Subscriveは呼ばれない

### 待ち合わせ

```
combineLatist(Observable o1, Observable o2, Func2)
```

```
Func2 -> Pair::create
```

Attention

* 片方の処理が失敗すると、両方が失敗する   
`Observable.onErrorReturn()`

* combineLatist().subscribeOnでは、直列で処理が実行される  
`o1` `o2` それぞれにsubscribeOn()を指定する

* retry  
`Observable.retry`

* Observableの結果を更にObservableに直列化   
`flatMap`


### tips
`Single`
Promiseのようなもの

`Completable`

